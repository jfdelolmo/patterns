package com.jfo.patterns.behavioral.a_command.rover.commands;

public interface Command {

    void action();
    void undo();

}
