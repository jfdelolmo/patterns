package com.jfo.patterns.creational.c_factory;

public class CarFactory extends TransportFactory {

    @Override
    Transport create() {
        return new Car();
    }

}
