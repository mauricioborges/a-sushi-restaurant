package io.github.mauricioborges.sushi;

import java.util.ArrayList;
import java.util.Iterator;

public class Order implements Iterable<MenuThings>{

    private ArrayList<Object> orderItensList = new ArrayList<>();
    private Integer invoiceNumber;

    public Order(MenuThings.Dishes menuThings) {
        orderItensList.add(menuThings);
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

    public ArrayList<Object> getOrderItens() {
        return orderItensList;
    }

    public void printOrderItems() {
        orderItensList.forEach(orderItensList -> {
            System.out.println(orderItensList);
        });
    }
}
