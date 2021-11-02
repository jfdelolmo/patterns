package com.jfo.patterns.behavioral.i_template;

public class ExpensiveLoanCalculation extends LoanCalculationAlgorithm {

    @Override
    int getBaseAmount() {
        return 1000000;
    }

    @Override
    double getInterest() {
        return 5.4;
    }

    @Override
    int calculateDiscount() {
        return 100;
    }
}
