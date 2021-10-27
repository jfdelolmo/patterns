package com.jfo.patterns.creational.e_prototype;

public class GraphicTool {

    private Graphic prototype;

    public GraphicTool(Graphic prototype){
        this.prototype = prototype;
    }

    protected Graphic createGraphic(){
        return this.prototype.clone();
    }

    public void setPrototype(Graphic prototype) {
        this.prototype = prototype;
    }
}
