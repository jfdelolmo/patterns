package com.jfo.patterns.behavioral.a_command.rover.commands;

import com.jfo.patterns.behavioral.a_command.rover.Navigator;

public abstract class AbstractCommand implements Command {

    protected static final String LIMIT_MSG = "This is an square land, you have reached the %s!!%n";
    protected static final String OBSTACLE_MSG = "There is an obstacle in front of you, you shall not pass!!";

    private final Navigator navigator;

    public AbstractCommand(Navigator navigator) {
        this.navigator = navigator;
    }

    public Navigator getNavigator() {
        return this.navigator;
    }
}
