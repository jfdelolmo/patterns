package com.jfo.patterns.behavioral.i_template;

public class Client {

    public static void main(String[] args) {
        LoanCalculationAlgorithm loanCalculationAlgorithm = new ExpensiveLoanCalculation();
        System.out.println(loanCalculationAlgorithm.calculateLoan());

        loanCalculationAlgorithm = new CheapLoanCalculation();
        System.out.println(loanCalculationAlgorithm.calculateLoan());
    }
}
