package io.github.mauricioborges.sushi;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;

public class OrderTest {

    @Test
    void takeOrderOfOneItemAtRestaurantCasher() {
    // GIVEN
        Restaurant restaurant = new Restaurant();
        MenuThings menuThing = new MenuThings();
        Cashier cashier = restaurant.getCashier();
    // WHEN
        Order order = cashier.takeOrder(menuThing);
    // THEN
        assertThat(order, contains(menuThing));
    }

    @Test
    void makeOrder() {
//        fail();

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
}
