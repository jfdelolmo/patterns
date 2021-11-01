package com.jfo.patterns.behavioral.c_visitor;

public class UpgradeCarPartVisitor implements CarPartVisitor {

    @Override
    public void visit(CarPart carPart) {
        System.out.println("Upgrading " + carPart.whoami());
    }

}