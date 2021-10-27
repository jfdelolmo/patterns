package com.jfo.patterns.structural.d_bridge;

public class Window {

    private WindowImpl window;

    public void setWindow(WindowImpl window) {
        this.window = window;
    }

    public void draw(int xPosition, int yPosition, int width, int height, String color) {
        window.draw(xPosition, yPosition, width, height, color);
    }


}
