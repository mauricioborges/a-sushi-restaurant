package io.github.mauricioborges.sushi;

import java.util.ArrayList;
import java.util.Iterator;

public class Order implements Iterable<MenuThings>{

    private ArrayList<Object> orderList;

    public Order(MenuThings menuThings) {
        orderList = new ArrayList<>();
        orderList.add(menuThings);
    }

    @Override
    public Iterator iterator() {
        return orderList.iterator();
    }
}
