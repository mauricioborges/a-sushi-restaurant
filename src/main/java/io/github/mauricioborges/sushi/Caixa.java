package io.github.mauricioborges.sushi;

public class Caixa {
    public Pedido tiraOPedido(CoisaDoCardapio umaCoisaDoCardapio) {
        return new Pedido(umaCoisaDoCardapio);
    }
}
