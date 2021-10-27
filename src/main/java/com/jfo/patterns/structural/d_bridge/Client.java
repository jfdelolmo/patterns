package com.jfo.patterns.structural.d_bridge;

public class Client {

    public static void main(String[] args) {
        IconWindow iconWindow = new IconWindow();
        iconWindow.setWindow(new DirectXWindow());
        iconWindow.drawIcon();

        iconWindow.setWindow(new LinuxWindow());
        iconWindow.drawIcon();
    }
}
