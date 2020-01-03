package io.github.mauricioborges.sushi;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;

public class PaymentTest {
//STEPS:
    //1. transformar o texto em um teste (meio que um teste funcional) pra modelar o problema


//    o cliente pede uma coisa do menu, indo no caixa
//    o caixa verifica qual o preço do item pedido
//    qual a forma de pagamento do cliente
//    cliente escolhe dinheiro ou cheque
//    o caixa recebe o pagamento
//    o caixa preenche o pedido


    @Test
    void clientDoesThePayment() {
//Given:
//        Client client;
        Restaurant restaurant;

        //TODO: test: retrieve a counter and it's free
        //TODO: test: retrieve a counter and it's busy
//        Counter counter = restaurant.getCounter();
        //TODO: 2 tests: retrieve a menu free/busy
//        client.getMenu(counter);
//        client.choose(oneItem);
        Cashier cashier;
        //TODO: what methods?
        //client.askForPaymentMethods(cashier);

        //TODO: test: I can't pay with any of the methods
        //TODO: test: I can pay
        //client.choosePaymentMethod();
//When:
        //TODO: test: I can pay
        //TODO: test: I can't pay
        //Invoice invoice = client.pays(cashier);

//Then:
        //assertThat(invoice, notNullValue());//unit test bem "tradicional"
        //assertThat(pedidoFoiGerado); // integration test
        //caixa preencheu a comanda
        //como garantir que eu to pegando o pedido certo, podem ter multiplos caixas por exemplo
        //precisa ter um caixa que preenche o pedido

        //com mock: verificar se o cashier.takeOrder() foi chamado
        //sem mock: verificar se o restaurante tem um pedido praquele cliente especifico vinculado aquela invoice

        // dentro da lista de pedidos pra um restaurante eu tenho um pedido que esse cliente acaboiu de fazer

        //TODO: test: how do I create a relationship between invoice and order?
        //restaurant.getOrder(invoice);




    }
}
