package io.github.mauricioborges.sushi;

import java.util.ArrayList;

public class Balcao {

    private ArrayList<Order> doneOrderList = new ArrayList<>();

    public void callClientByInvoiceNumber(Integer invoiceNumber) {
        System.out.println("Pedido #" + invoiceNumber + " está pronto");
    }

    public void getDoneOrder(Order order) {
        addToDoneOrdersList(order);
        callClientByInvoiceNumber(order.getInvoiceNumber());
    }

    private void addToDoneOrdersList(Order order) {
        doneOrderList.add(order);
    }

    public ArrayList<Order> getDoneOrderList() {
        return doneOrderList;
    }
}
