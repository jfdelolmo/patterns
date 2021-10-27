package com.jfo.patterns.structural.a_facade;

import static java.lang.String.format;

public class InvoiceCustomerSystem {

    public void createInvoiceForBill(Bill bill) {
        System.out.println(format("Creating invoice for bill with amount: %d", bill.getAmount()));
    }
}
