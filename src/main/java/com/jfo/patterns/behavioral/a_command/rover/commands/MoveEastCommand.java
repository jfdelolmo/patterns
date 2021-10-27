package com.jfo.patterns.behavioral.a_command.rover.commands;

import com.jfo.patterns.behavioral.a_command.rover.Coordinate;
import com.jfo.patterns.behavioral.a_command.rover.Navigator;

public class MoveEastCommand extends AbstractCommand {

    private Navigator undo;

    public MoveEastCommand(Navigator navigator) {
        super(navigator);
    }

    @Override
    public void action() {
        undo = getNavigator();

        Coordinate destination = getNavigator().getRover().getCurrentPosition().peekEast();

        if (getNavigator().getRover().isEastLimit(destination)) {
            System.out.printf(LIMIT_MSG, "east");
        } else if (getNavigator().getRover().hasAnObstacle(destination)) {
            System.out.printf("%s%n", OBSTACLE_MSG);
        } else {
            getNavigator().getRover().setCurrentPosition(destination);
            System.out.printf(
                    "Going east (%d,%d)%n",
                    getNavigator().getRover().getCurrentPosition().getX(),
                    getNavigator().getRover().getCurrentPosition().getY()
            );
        }
    }

    @Override
    public void undo() {
        getNavigator().setRover(undo.getRover());
    }
}
