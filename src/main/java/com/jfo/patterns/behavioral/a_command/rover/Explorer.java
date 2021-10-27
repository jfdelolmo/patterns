package com.jfo.patterns.behavioral.a_command.rover;

import static java.lang.String.format;

public class Explorer {

    private static final String OBSTACLE = "XXX";

    private String[][] map;
    private int xMax;
    private int yMax;
    private Coordinate currentPosition;

    public Explorer() {
        this.map = null;
        this.xMax = 0;
        this.yMax = 0;
        this.currentPosition = new Coordinate(0, 0);
    }

    public void initialize(Coordinate coordinate) {
        if (null != coordinate) {
            xMax = coordinate.getX();
            yMax = coordinate.getY();
            map = new String[xMax][yMax];
        } else {
            map = null;
            xMax = 0;
            yMax = 0;
        }
        this.currentPosition = new Coordinate(0, 0);
    }

    public void addObstacle(Coordinate coordinate) {
        if (null == map) {
            throw new IllegalArgumentException("The exploration map has not been initialized");
        }

        if (coordinateIsOutOutLimits(coordinate)) {
            throw new IllegalArgumentException("The obstacle in out of the limits");
        }

        map[coordinate.getX()][coordinate.getY()] = OBSTACLE;
    }

    public void setCurrentPosition(Coordinate coordinate) {
        this.currentPosition = coordinate;
    }

    public Coordinate getCurrentPosition() {
        return this.currentPosition;
    }

    public boolean hasAnObstacle(Coordinate coordinate) {
        return OBSTACLE.equals(map[coordinate.getX()][coordinate.getY()]);
    }

    private boolean coordinateIsOutOutLimits(Coordinate coordinate) {
        return coordinate.getX() > xMax || coordinate.getY() > yMax;
    }

    public boolean isNorthLimit(Coordinate newPosition) {
        return isNorthLimit(newPosition.getY());
    }

    private boolean isNorthLimit(int y) {
        return y == yMax;
    }

    public boolean isSouthLimit(Coordinate newPosition) {
        return isSouthLimit(newPosition.getY());
    }

    private boolean isSouthLimit(int y) {
        return y < 0;
    }

    public boolean isEastLimit(Coordinate newPosition) {
        return isEastLimit(newPosition.getX());
    }

    private boolean isEastLimit(int x) {
        return x == xMax;
    }

    public boolean isWestLimit(Coordinate newPosition) {
        return isWestLimit(newPosition.getX());
    }

    private boolean isWestLimit(int x) {
        return x < 0;
    }

    public String getMapSize() {
        return format("%d x %d", xMax, yMax);
    }

}
