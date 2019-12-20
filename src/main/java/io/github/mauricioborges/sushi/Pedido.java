package io.github.mauricioborges.sushi;

import java.util.ArrayList;
import java.util.Iterator;

public class Pedido implements Iterable<CoisaDoCardapio>{

    private ArrayList<Object> listaDeCoisasNoPedido;

    public Pedido(CoisaDoCardapio umaCoisaDoCardapio) {
        listaDeCoisasNoPedido = new ArrayList<>();
        listaDeCoisasNoPedido.add(umaCoisaDoCardapio);
    }

    public Boolean soTemUmItem() {
        return listaDeCoisasNoPedido.size() == 1;
    }

    @Override
    public Iterator iterator() {
        return listaDeCoisasNoPedido.iterator();
    }
}
