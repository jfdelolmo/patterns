package com.jfo.patterns.behavioral.e_memento;

public class ConnectionSolverCaretaker {

    private ConnectionSolverMemento connectionSolverMemento;

    public void saveState(ConnectionSolver connectionSolver){
        connectionSolverMemento = connectionSolver.createMemento();
    }

    public void restoreState(ConnectionSolver connectionSolver){
        connectionSolver.setMemento(connectionSolverMemento);
    }
}
