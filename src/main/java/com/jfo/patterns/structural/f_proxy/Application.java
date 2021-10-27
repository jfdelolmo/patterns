package com.jfo.patterns.structural.f_proxy;

import java.util.ArrayList;
import java.util.List;

public class Application {

    private List<Image> imageList = new ArrayList<>();

    public Application(List<Image> imageList) {
        this.imageList = imageList;
    }

    public void draw(){
        imageList.forEach(Image::draw);
    }
}
