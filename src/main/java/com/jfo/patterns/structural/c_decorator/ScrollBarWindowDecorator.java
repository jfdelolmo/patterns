package com.jfo.patterns.structural.c_decorator;

public class ScrollBarWindowDecorator extends WindowDecorator {

    public ScrollBarWindowDecorator(Window window) {
        super(window);
    }

    @Override
    public void draw() {
        System.out.println("Drawing ScrollBar");
        window.draw();
    }
}
