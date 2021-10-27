package com.jfo.patterns.structural.a_facade;

public class BillingSystem {

    public Bill createBill(Integer amount){
        Bill bill = new Bill();
        bill.setAmount(amount);
        return bill;
    }
}
