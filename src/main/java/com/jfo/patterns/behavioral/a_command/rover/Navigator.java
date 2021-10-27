package com.jfo.patterns.behavioral.a_command.rover;

import com.jfo.patterns.behavioral.a_command.rover.commands.*;

import java.util.Deque;
import java.util.LinkedList;

public class Navigator {

    private Explorer explorer = new Explorer();

    private Deque<Command> queue = new LinkedList<>();

    private void executeAction(Command command) {
        command.action();
        queue.add(command);
    }

    private void undo() {
        Command command = queue.pollLast();
        if (null != command) {
            command.undo();
        }
    }

    public Explorer getRover() {
        return explorer;
    }

    public void setRover(Explorer explorer) {
        this.explorer = explorer;
    }

    public static void main(String[] args) {
        Navigator navigator = new Navigator();

        InitializeMapCommand initCommand = new InitializeMapCommand(navigator, new Coordinate(3, 3));
        navigator.executeAction(initCommand);

//        AddObstacleCommand addObstacleCommand = new AddObstacleCommand(navigator, new Coordinate(0, 1));
//        navigator.executeAction(addObstacleCommand);

        MoveNorthCommand northCommand = new MoveNorthCommand(navigator);
        navigator.executeAction(northCommand);
        navigator.executeAction(northCommand);
        navigator.executeAction(northCommand);

        MoveEastCommand moveEastCommand = new MoveEastCommand(navigator);
        navigator.executeAction(moveEastCommand);
        navigator.executeAction(moveEastCommand);
        navigator.executeAction(moveEastCommand);

        MoveSouthCommand moveSouthCommand = new MoveSouthCommand(navigator);
        navigator.executeAction(moveSouthCommand);
        navigator.executeAction(moveSouthCommand);
        navigator.executeAction(moveSouthCommand);

        MoveWestCommand moveWestCommand = new MoveWestCommand(navigator);
        navigator.executeAction(moveWestCommand);
        navigator.executeAction(moveWestCommand);
        navigator.executeAction(moveWestCommand);

    }


}
