package io.github.mauricioborges.sushi;

import java.util.ArrayList;
import java.util.Iterator;

public class Order implements Iterable<MenuThings>{

    ArrayList<MenuThings.Dishes> orderItensList = new ArrayList<>();
    private Integer invoiceNumber;

    public Order(ArrayList<MenuThings.Dishes> menuThingsList) {
        this.orderItensList = menuThingsList;
    }

    @Override
    public Iterator iterator() {
        return orderItensList.iterator();
    }

    public Integer getInvoiceNumber() {
        return invoiceNumber;
    }

    void setInvoiceNumber(Integer invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public ArrayList<MenuThings.Dishes> getOrderItens() {
        return orderItensList;
    }

    public void printOrderItems() {
        orderItensList.forEach(orderItensList -> {
            System.out.println(orderItensList);
        });
    }
}
