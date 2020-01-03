package io.github.mauricioborges.sushi;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.junit.jupiter.api.Assertions.fail;

public class OrderTest {

    @Test
    void takeOrderOfOneItemAtRestaurantCashier() {
    // GIVEN
        Restaurant restaurant = new Restaurant();
        MenuThings menuThing = new MenuThings();
        Cashier cashier = restaurant.getCashier();
    // WHEN
        Order order = cashier.takeOrder(menuThing);
    // THEN
        assertThat(order, contains(menuThing));
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
}
