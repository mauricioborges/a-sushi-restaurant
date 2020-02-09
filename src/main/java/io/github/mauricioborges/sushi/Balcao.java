package io.github.mauricioborges.sushi;

import java.util.ArrayList;

public class Balcao {

    private ArrayList<Order> doneOrdersList = new ArrayList<>();

    public void callClientByInvoiceNumber(Integer invoiceNumber) {
        System.out.println("Pedido #" + invoiceNumber + " está pronto");
    }

    public void receiveDoneOrderFromKitchen(Order order) {
        addToDoneOrdersList(order);
    }

    private void addToDoneOrdersList(Order order) {
        doneOrdersList.add(order);
    }

    public ArrayList<Order> getDoneOrdersList() {
        return doneOrdersList;
    }

    public void callDoneOrders() {
        doneOrdersList.forEach(order -> {
            callClientByInvoiceNumber(order.getInvoiceNumber());
        });
    }
}
