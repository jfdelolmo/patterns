package com.jfo.patterns.behavioral.g_chain_of_responsibility;

import org.springframework.util.comparator.BooleanComparator;

public class Client {

    public static void main(String[] args) {
        PaymentCheckoutHandler paymentHandler = new PaymentCheckoutHandler();
        CustomerInfoCheckoutHandler customerHandler = new CustomerInfoCheckoutHandler();

        paymentHandler.setNextHandler(customerHandler);

        paymentHandler.handleCheckout();
    }
}
