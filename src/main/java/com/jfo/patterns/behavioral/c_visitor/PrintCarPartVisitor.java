package com.jfo.patterns.behavioral.c_visitor;

public class PrintCarPartVisitor implements CarPartVisitor {

    @Override
    public void visit(CarPart carPart) {
        System.out.println("Printing " + carPart.whoami());
    }
}
