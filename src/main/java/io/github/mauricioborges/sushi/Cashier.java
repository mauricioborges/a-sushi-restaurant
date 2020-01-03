package io.github.mauricioborges.sushi;

public class Cashier {
    public Order takeOrder(MenuThings umaMenuThings) {
        return new Order(umaMenuThings);
    }
}
