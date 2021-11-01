package com.jfo.patterns.behavioral.e_memento;

import java.awt.geom.Point2D;

public class Client {

    public static void main(String[] args) {

        Point2D firstPoint = new Point2D.Double(1.0, 1.0);
        Point2D secondPoint = new Point2D.Double(5.0, 1.0);
        ConnectionSolver connectionSolver = new ConnectionSolver(firstPoint, secondPoint);
        ConnectionSolverCaretaker caretaker = new ConnectionSolverCaretaker();

        caretaker.saveState(connectionSolver);
        connectionSolver.calculateLine();

        firstPoint = new Point2D.Double(2.0, 2.0);
        secondPoint = new Point2D.Double(5.0, 2.0);
        connectionSolver = new ConnectionSolver(firstPoint, secondPoint);
        connectionSolver.calculateLine();

        ConnectionSolver newConnectionSolver = new ConnectionSolver(null, null);
        caretaker.restoreState(newConnectionSolver);
        newConnectionSolver.calculateLine();

        caretaker.restoreState(connectionSolver);
        connectionSolver.calculateLine();
    }

}
