package com.jfo.patterns.structural.e_composite;

public class Client {

    public static void main(String[] args) {

        GraphicGroup group1 = new GraphicGroup();
        group1.addGraphic(new Line());
        group1.addGraphic(new Rectangle());
        group1.draw();

        System.out.println("-----------------------");

        GraphicGroup group2 = new GraphicGroup();
        group2.addGraphic(group1);
        group2.addGraphic(new Line());
        group2.draw();

        System.out.println("-----------------------");
        new Line().draw();
    }
}
