package com.jfo.patterns.structural.a_facade;

public class FinancialSystemFacade {

    private BillingSystem billingSystem;
    private InvoiceCustomerSystem invoiceCustomerSystem;

    public FinancialSystemFacade(BillingSystem billingSystem, InvoiceCustomerSystem invoiceCustomerSystem) {
        this.billingSystem = billingSystem;
        this.invoiceCustomerSystem = invoiceCustomerSystem;
    }

    public void createInvoiceForAmount(Integer amount){
        Bill bill = billingSystem.createBill(amount);
        invoiceCustomerSystem.createInvoiceForBill(bill);
    }
}
