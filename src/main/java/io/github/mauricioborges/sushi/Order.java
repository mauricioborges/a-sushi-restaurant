package io.github.mauricioborges.sushi;

import java.util.ArrayList;
import java.util.Iterator;

public class Order implements Iterable<MenuThings>{

    private ArrayList<Object> listaDeCoisasNoPedido;

    public Order(MenuThings menuThings) {
        listaDeCoisasNoPedido = new ArrayList<>();
        listaDeCoisasNoPedido.add(menuThings);
    }

    @Override
    public Iterator iterator() {
        return listaDeCoisasNoPedido.iterator();
    }
}
