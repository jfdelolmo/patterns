package com.jfo.patterns.behavioral.g_chain_of_responsibility;

public class PaymentCheckoutHandler extends CheckoutHandler {

    @Override
    public void handleCheckout() {
        System.out.println("Handling Payment of the customer");
        if (null!=nextHandler){
            nextHandler.handleCheckout();
        }
    }

}
