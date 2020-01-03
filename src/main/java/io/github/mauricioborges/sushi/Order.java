package io.github.mauricioborges.sushi;

import java.util.ArrayList;
import java.util.Iterator;

public class Order implements Iterable<MenuThings>{

    private ArrayList<Object> orderItensList;

    public Order(MenuThings menuThings) {
        orderItensList = new ArrayList<>();
        orderItensList.add(menuThings);
    }

    @Override
    public Iterator iterator() {
        return orderItensList.iterator();
    }
}
