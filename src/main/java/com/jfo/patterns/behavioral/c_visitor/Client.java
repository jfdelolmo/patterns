package com.jfo.patterns.behavioral.c_visitor;

public class Client {

    public static void main(String[] args) {
        Car car = new Car();

        car.addCarPart(new Wheel());
        car.addCarPart(new Wheel());
        car.addCarPart(new Wheel());
        car.addCarPart(new Wheel());

        car.addCarPart(new Light());
        car.addCarPart(new Light());

        car.addCarPart(new Engine());

        car.upgrade();
        car.print();
        car.render();

    }
}
