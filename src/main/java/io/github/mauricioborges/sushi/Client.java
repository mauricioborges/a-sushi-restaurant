package io.github.mauricioborges.sushi;

public class Client {

    private Integer invoiceNumber;

    private String name;

     public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Integer getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(Integer invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }
}
