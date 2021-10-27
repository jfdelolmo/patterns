package com.jfo.patterns.creational.c_factory;

public class BikeFactory extends TransportFactory{

    @Override
    Transport create() {
        return new Bike();
    }

}
