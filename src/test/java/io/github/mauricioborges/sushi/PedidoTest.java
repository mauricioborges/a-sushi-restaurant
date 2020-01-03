package io.github.mauricioborges.sushi;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.junit.jupiter.api.Assertions.fail;

public class PedidoTest {

    @Test
    void tirarPedidoDeUmItemNoCaixaDoRestaurante() {
    // GIVEN
        Restaurante restaurante = new Restaurante();
        CoisaDoCardapio umaCoisaDoCardapio = new CoisaDoCardapio();
        Caixa caixa = restaurante.getCaixa();
    // WHEN
        Pedido pedido = caixa.tiraOPedido(umaCoisaDoCardapio);
    // THEN
        assertThat(pedido, contains(umaCoisaDoCardapio));
    }

    @Test
    void fazerPedido() {
        fail();
//        Cliente cliente;
        Restaurante restaurante;

//        cliente.entra(restaurante);
        CoisaDoCardapio umaCoisaDoCardapio;

//        cliente.fazPedido(umaCoisaDoCardapio);
//        Caixa caixa = restaurante.getCaixa();
//        Pedido pedido = caixa.tiraOPedido(umaCoisaDoCardapio);

        //assertThat(pedido).contains(umaCoisaDoCardapio);
        //assertThat(pedido).soTemUmItem;
    }
}
