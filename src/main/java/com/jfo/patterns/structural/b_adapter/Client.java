package com.jfo.patterns.structural.b_adapter;

import static java.lang.String.format;

public class Client {

    public void calculateRectangleSize(Rectangle rectangle) {
        System.out.printf("Rectangle size: %d%n", rectangle.determineSize());
    }

    public static void main(String[] args) {
        Client client = new Client();
        LegacyRectangle legacyRectangle = new LegacyRectangle();
        LegacyRectangleAdapter adapter = new LegacyRectangleAdapter(legacyRectangle);
        client.calculateRectangleSize(adapter);
    }
}
