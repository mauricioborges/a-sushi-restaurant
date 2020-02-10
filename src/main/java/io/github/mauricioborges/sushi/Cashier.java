package io.github.mauricioborges.sushi;

import java.util.ArrayList;

public class Cashier {
    private Integer money = 0;

    public Order takeOrder(ArrayList<MenuThings.Dishes> menuThing) {
        return new Order(menuThing);
    }

    public Integer receiveCash(Integer cash) {
        setMoney(cash);
        return getInvoiceNumber();
    }

    private Integer getInvoiceNumber() {
        return new Invoice().getInvoiceNumber();
    }

    public void setMoney(Integer money) {
        this.money += money;
    }
}
