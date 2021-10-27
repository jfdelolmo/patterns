package com.jfo.patterns.behavioral.a_command.rover.commands;

import com.jfo.patterns.behavioral.a_command.rover.Coordinate;
import com.jfo.patterns.behavioral.a_command.rover.Navigator;

public class InitializeMapCommand extends AbstractCommand {

    private Navigator undo;
    private final Coordinate coordinate;

    public InitializeMapCommand(Navigator navigator, Coordinate coordinate) {
        super(navigator);
        this.coordinate = coordinate;
    }

    @Override
    public void action() {
        undo = getNavigator();
        getNavigator().getRover().initialize(this.coordinate);
        System.out.printf("MapSize: %s%n", getNavigator().getRover().getMapSize());
        System.out.printf(
                "CurrentPosition: %d - %d%n",
                getNavigator().getRover().getCurrentPosition().getX(),
                getNavigator().getRover().getCurrentPosition().getX());
    }

    @Override
    public void undo() {
        getNavigator().setRover(undo.getRover());
    }
}
