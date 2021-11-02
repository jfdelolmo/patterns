package com.jfo.patterns.behavioral.i_template;

public abstract class LoanCalculationAlgorithm {

    abstract int getBaseAmount();

    abstract double getInterest();

    abstract int calculateDiscount();

    public int calculateLoan() {
        return (int) (getBaseAmount() * getInterest() - calculateDiscount());
    }
}
