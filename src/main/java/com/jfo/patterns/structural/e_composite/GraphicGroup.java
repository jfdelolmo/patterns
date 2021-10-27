package com.jfo.patterns.structural.e_composite;

import java.util.ArrayList;
import java.util.List;

public class GraphicGroup implements Graphic {

    private final List<Graphic> graphicList = new ArrayList<>();

    public void addGraphic(Graphic graphic){
        graphicList.add(graphic);
    }

    @Override
    public void draw() {
        graphicList.forEach(Graphic::draw);
    }
}
