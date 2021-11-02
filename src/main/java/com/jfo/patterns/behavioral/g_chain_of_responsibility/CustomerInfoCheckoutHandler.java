package com.jfo.patterns.behavioral.g_chain_of_responsibility;

public class CustomerInfoCheckoutHandler extends CheckoutHandler {

    @Override
    public void handleCheckout() {
        System.out.println("Adding extra info to checkout of the customer");
        if (null!=nextHandler){
            nextHandler.handleCheckout();
        }
    }

}
