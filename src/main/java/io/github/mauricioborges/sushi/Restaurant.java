package io.github.mauricioborges.sushi;

public class Restaurant {
    public Cashier getCashier() {
        return new Cashier();
    }

    public Balcao getBalcao() { return  new Balcao(); }

    public Cozinha getCozinha() { return new Cozinha(); }
}
