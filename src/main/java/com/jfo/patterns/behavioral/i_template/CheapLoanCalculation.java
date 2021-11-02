package com.jfo.patterns.behavioral.i_template;

public class CheapLoanCalculation extends LoanCalculationAlgorithm {

    @Override
    int getBaseAmount() {
        return 1000000;
    }

    @Override
    double getInterest() {
        return 3;
    }

    @Override
    int calculateDiscount() {
        return 100;
    }
}
