package com.jfo.patterns.behavioral.e_memento;

import java.awt.geom.Point2D;

public class ConnectionSolverMemento {

    private final Point2D firstPoint;
    private final Point2D secondPoint;

    public ConnectionSolverMemento(Point2D firstPoint, Point2D secondPoint) {
        this.firstPoint = firstPoint;
        this.secondPoint = secondPoint;
    }

    public Point2D getFirstPoint() {
        return firstPoint;
    }

    public Point2D getSecondPoint() {
        return secondPoint;
    }
}
