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
        // cozinha recebe Order com itens do pedido, prepara e envia para o Balcão
        cozinha.addOrders(order);
        // Balcão recebe a order pronta e chama o número da invoice que acabou de ficar pronta
        balcao.callDoneOrders();

        // THEN
        // na lista de pedidos prontos do balcão tem o pedido de Lucas
        assertThat(balcao.getDoneOrdersList(), contains(order));
        // o número do pedido é 1
        assertThat(order.getInvoiceNumber(), equalTo(invoiceNumber) );
        // o pedido é de Lucas
        assertThat(client.getInvoiceNumber(), equalTo(order.getInvoiceNumber()));
        assertThat(client.getName(), equalTo("Lucas"));

        // cliente pega o pedido
        Boolean delivered = client.getOrderBalcao(invoiceNumber, balcao);
        assertThat(delivered, equalTo(true));
        // client não pode pegar pedido que não existe ou não está pronto ainda
        Boolean notDelivered = client.getOrderBalcao(999, balcao);
        assertThat(notDelivered, equalTo(false));
    }

    // client chega no restaurante vai no caixa e pega o menu
    // client escolhe item do menu client vai até o caixa e faz o pedido desse item
    // client paga com dinheiro pro caixa
    // client espera chamar pelo numero da invoice
    // cozinha prepara o pedido e avisa que o numero da invoice tá feito
    // client pega o pedido no balcão
    // pronto client come
    @Test
    void proximo() throws InterruptedException {
        // SETUP
        Client client =  new Client();
        client.setName("Lucas");
        Restaurant restaurant = new Restaurant();
        Cashier cashier = restaurant.getCashier();
        Cozinha cozinha = restaurant.getCozinha();
        Balcao balcao = restaurant.getBalcao();
        cozinha.setBalcao(balcao);
        MenuThings menuThings = new MenuThings();

        // GIVEN
        menuThings.showMenuThings();




        // WHEN
        Integer invoiceNumber = cashier.receiveCash(16);
        MenuThings.Dishes thingChoosed = menuThings.chooseDisheRandomly();
        Order order = cashier.takeOrder(thingChoosed);
        order.setInvoiceNumber(invoiceNumber);
        client.setInvoiceNumber(invoiceNumber);
        cozinha.addOrders(order);
        // Balcão recebe a order pronta e chama o número da invoice que acabou de ficar pronta
        balcao.callDoneOrders();

        // THEN

        assertThat(balcao.getDoneOrdersList(), contains(order));

        // cliente pega o pedido
        Boolean delivered = client.getOrderBalcao(invoiceNumber, balcao);
        assertThat(delivered, equalTo(true));
        // client não pode pegar pedido que não existe ou não está pronto ainda
        Boolean notDelivered = client.getOrderBalcao(999, balcao);
        assertThat(notDelivered, equalTo(false));
    }
}
