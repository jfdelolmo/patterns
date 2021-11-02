package com.jfo.patterns.behavioral.f_mediator;

import java.util.ArrayList;
import java.util.List;

public class MyList {

    List<String> items = new ArrayList<>();

    private ScreenDirector screenDirector;

    public void selectItem(int itemNumber){
        String item = items.get(itemNumber);
        if (null!=screenDirector){
            screenDirector.itemSelected(item);
        }
    }

    public void setScreenDirector(ScreenDirector screenDirector) {
        this.screenDirector = screenDirector;
    }

    public List<String> getItems() {
        return items;
    }
}
