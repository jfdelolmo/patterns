package com.jfo.patterns.structural.b_adapter;

public class LegacyRectangleAdapter extends Rectangle {

    private LegacyRectangle legacyRectangle;

    public LegacyRectangleAdapter(LegacyRectangle legacyRectangle) {
        this.legacyRectangle = legacyRectangle;
    }

    @Override
    public Integer determineSize(){
        return legacyRectangle.calculateSize();
    }
}
