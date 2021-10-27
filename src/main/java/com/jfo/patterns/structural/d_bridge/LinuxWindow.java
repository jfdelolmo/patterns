package com.jfo.patterns.structural.d_bridge;

public class LinuxWindow extends WindowImpl {

    @Override
    public void draw(int xPosition, int yPosition, int width, int height, String color) {
        System.out.printf(
                "Drawing a Linux window x: %d, y: %d, width: %d, height:%d, color: %s%n",
                xPosition,
                yPosition,
                width,
                height,
                color
        );
    }
}
