package com.jfo.patterns.behavioral.g_chain_of_responsibility;

public abstract class CheckoutHandler {
    protected CheckoutHandler nextHandler;

    public abstract void handleCheckout();

    public void setNextHandler(CheckoutHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
