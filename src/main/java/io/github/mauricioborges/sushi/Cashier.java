package io.github.mauricioborges.sushi;

public class Cashier {
    public Order takeOrder(MenuThings menuThing) {
        return new Order(menuThing);
    }
}
