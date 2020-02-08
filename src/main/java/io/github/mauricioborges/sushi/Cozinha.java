package io.github.mauricioborges.sushi;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Cozinha {

    // lista de pedidos a serem preparados
    private ArrayList<Order> orderListToPrepare = new ArrayList<>();
    private Balcao balcao;

    public Order addOrders(Order order) throws InterruptedException {
        addOrderToPreparationList(order);
        prepareOrder();
        return order;
    }

    private void addOrderToPreparationList(Order order) {
        orderListToPrepare.add(order);
    }

    void prepareOrder() throws InterruptedException {
        orderListToPrepare.forEach(order -> {
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            balcao.getDoneOrder(order);
        });
    }


    public void setBalcao(Balcao balcao) {
        this.balcao = balcao;
    }
}
