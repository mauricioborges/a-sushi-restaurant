package io.github.mauricioborges.sushi;

public class Cashier {
    private Integer money = 0;

    //@TODO Receber mais de um item por pedido
    public Order takeOrder(MenuThings.Dishes menuThing) {
        return new Order(menuThing);
    }


    public Integer receiveCash(Integer cash) {
        setMoney(cash);
        return getInvoiceNumber();
    }

    private Integer getInvoiceNumber() {
        return new Invoice().getInvoiceNumber();
    }

    public void setMoney(Integer money) {
        this.money += money;
    }
}
