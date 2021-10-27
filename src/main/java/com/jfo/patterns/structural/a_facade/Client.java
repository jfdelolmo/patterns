package com.jfo.patterns.structural.a_facade;

public class Client {

    public static void main(String[] args) {
        BillingSystem billingSystem = new BillingSystem();
        InvoiceCustomerSystem invoiceCustomerSystem = new InvoiceCustomerSystem();

        FinancialSystemFacade financialSystemFacade = new FinancialSystemFacade(
                billingSystem,
                invoiceCustomerSystem
        );

        financialSystemFacade.createInvoiceForAmount(1000);
    }
}
