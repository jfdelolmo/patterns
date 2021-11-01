package com.jfo.patterns.behavioral.c_visitor;

public abstract class CarPart {

    public void acceptVisitor(CarPartVisitor carPartVisitor){
        carPartVisitor.visit(this);
    }

    public abstract String whoami();
}
