package com.jfo.patterns.behavioral.a_command.rover;

public class Coordinate {

    private final Integer x;
    private final Integer y;

    public Coordinate(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    public Integer getX() {
        return x;
    }

    public Integer getY() {
        return y;
    }

    public Coordinate peekNorth() {
        return new Coordinate(this.x, this.y + 1);
    }

    public Coordinate peekSouth() {
        return new Coordinate(this.x, this.y - 1);
    }

    public Coordinate peekEast(){
        return new Coordinate(this.x + 1, this.y);
    }

    public Coordinate peekWest(){
        return new Coordinate(this.x - 1, this.y);
    }

}
