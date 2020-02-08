package io.github.mauricioborges.sushi;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static io.github.mauricioborges.sushi.MenuThings.Dishes.HOTROLL;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.fail;

public class OrderTest {

    @Test
    void takeOrderOfOneItemAtRestaurantCashier() {
    // GIVEN
        Restaurant restaurant = new Restaurant();
        Cashier cashier = restaurant.getCashier();
    // WHEN
        Order order = cashier.takeOrder(HOTROLL);
    // THEN
        assertThat(order, contains(HOTROLL));
    }

    @Disabled("this is more like a Functional/Integration test and will not pass for now")
    @Test
    void clientOrderOneThing() {
        fail();

//        Cliente cliente;
        Restaurant restaurant;

//        cliente.entra(restaurante);
        MenuThings umaMenuThings;

//        cliente.fazPedido(umaCoisaDoCardapio);
//        Caixa caixa = restaurante.getCaixa();
//        Pedido pedido = caixa.tiraOPedido(umaCoisaDoCardapio);

        //assertThat(pedido).contains(umaCoisaDoCardapio);
        //assertThat(pedido).soTemUmItem;
    }

    // Lucas pede hot roll no caixa do restaurante
    // Lucas paga com dinheiro
    // e recebe a invoice numero 2
    // Restaurante prepara o pedido do Lucas
    // e grita o numero quando tá pronto
    // Lucas pega o prato e come
    @Test
    void lucasOrderingAHotRoll() throws InterruptedException {
        // GIVEN
        Client client =  new Client();
        client.setName("Lucas");
        Restaurant restaurant = new Restaurant();
        Cashier cashier = restaurant.getCashier();
        Cozinha cozinha = restaurant.getCozinha();
        Balcao balcao = restaurant.getBalcao();
        cozinha.setBalcao(balcao);

        // WHEN
        Integer invoiceNumber = cashier.receiveCash(16);
        Order order = cashier.takeOrder(HOTROLL);
        order.setInvoiceNumber(invoiceNumber);
        client.setInvoiceNumber(invoiceNumber);
        // cozinha recebe Order com itens do pedido
        cozinha.addOrders(order);

        // THEN
        // na lista de pedidos prontos do balcão tem o pedido de Lucas
        assertThat(balcao.getDoneOrderList(), contains(order));
        // o número do pedido é 1
        assertThat(order.getInvoiceNumber(), equalTo(invoiceNumber) );
        // o pedido é de Lucas
        assertThat(client.getInvoiceNumber(), equalTo(order.getInvoiceNumber()));
        assertThat(client.getName(), equalTo("Lucas"));

    }
}
