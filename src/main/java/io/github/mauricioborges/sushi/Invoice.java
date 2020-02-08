package io.github.mauricioborges.sushi;

public class Invoice {
    private Integer invoiceNumber = 0;

    public Integer getInvoiceNumber() {
        return ++invoiceNumber;
    }
}
