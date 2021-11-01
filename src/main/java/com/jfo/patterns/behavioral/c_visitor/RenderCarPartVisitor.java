package com.jfo.patterns.behavioral.c_visitor;

public class RenderCarPartVisitor implements CarPartVisitor {

    @Override
    public void visit(CarPart carPart) {
        System.out.println("Rendering " + carPart.whoami());
    }
}