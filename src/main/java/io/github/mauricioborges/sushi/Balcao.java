package io.github.mauricioborges.sushi;

import java.util.ArrayList;

public class Balcao {

    private ArrayList<Order> doneOrdersList = new ArrayList<>();
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_RESET = "\u001B[0m";

    public void callClientByInvoiceNumber(Order order) {
        System.out.println("Pedido #" + order.getInvoiceNumber() + " está pronto");
        System.out.println("####### Itens do Pedido: #######");
        order.printOrderItems();
        System.out.println("####### Final da listagem de Itens do Pedido ########");
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
        if (!doneOrdersList.isEmpty()) {
            doneOrdersList.forEach(order -> {
                callClientByInvoiceNumber(order);
            });
        } else {
            System.out.println("Lista de Pedidos vaiza - Aguardando Novos Pedidos");
        }

    }

    public Boolean deliverOrderToClient(Integer invoiceNumber) {
        if (thisOrderIsDoneOrExist(invoiceNumber)) {
            doneOrdersList.removeIf(order -> order.getInvoiceNumber().equals(invoiceNumber));
            System.out.println("Pedido #" + invoiceNumber + " foi ENTREGUE!");
            return true;
        } else {
            System.out.println( "Pedido #" +  invoiceNumber + " "
                    + ANSI_RED_BACKGROUND +"NÃO ENCONTRADO!" + ANSI_RESET);
            return false;
        }


    }

    private Boolean thisOrderIsDoneOrExist(Integer invoiceNumber) {
        return doneOrdersList.stream()
                .filter(order -> order.getInvoiceNumber().equals(invoiceNumber))
                .findFirst()
                .isPresent();
    }
}
