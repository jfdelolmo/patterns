package com.jfo.patterns.structural.f_proxy;

public class Image {

    protected String url;

    public Image() {
    }

    public Image(String url) {
        System.out.printf("Loading an image from %s%n", url);
        this.url = url;
    }

    public void draw(){
        System.out.printf("Drawing an image from %s%n", url);
    }
}
