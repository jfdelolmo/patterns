package com.jfo.patterns.behavioral.c_visitor;

import java.util.ArrayList;
import java.util.List;

public class Car {

    private final List<CarPart> parts = new ArrayList<>();

    public void addCarPart(CarPart part) {
        parts.add(part);
    }

    public void render(){
        RenderCarPartVisitor visitor = new RenderCarPartVisitor();
        parts.forEach(part -> part.acceptVisitor(visitor));
    }

    public void print(){
        PrintCarPartVisitor visitor = new PrintCarPartVisitor();
        parts.forEach(part -> part.acceptVisitor(visitor));
    }

    public void upgrade(){
        UpgradeCarPartVisitor visitor = new UpgradeCarPartVisitor();
        parts.forEach(part -> part.acceptVisitor(visitor));
    }
}
