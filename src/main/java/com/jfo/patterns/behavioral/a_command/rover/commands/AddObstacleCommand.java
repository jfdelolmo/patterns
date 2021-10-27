package com.jfo.patterns.behavioral.a_command.rover.commands;

import com.jfo.patterns.behavioral.a_command.rover.Coordinate;
import com.jfo.patterns.behavioral.a_command.rover.Navigator;

public class AddObstacleCommand extends AbstractCommand {

    private Navigator undo;
    private final Coordinate coordinate;

    public AddObstacleCommand(Navigator navigator, Coordinate coordinate) {
        super(navigator);
        this.coordinate = coordinate;
    }

    @Override
    public void action() {
        undo = getNavigator();
        getNavigator().getRover().addObstacle(this.coordinate);
    }

    @Override
    public void undo() {
        getNavigator().setRover(undo.getRover());
    }
}
