package com.jfo.patterns.structural.f_proxy;

import java.util.Optional;

public class ImageProxy extends Image {

    private Image image;

    public ImageProxy(String url) {
        super();
        this.url = url;
    }

    @Override
    public void draw() {
        image = Optional.ofNullable(this.image).orElse(new Image(this.url));
        image.draw();
    }
}
