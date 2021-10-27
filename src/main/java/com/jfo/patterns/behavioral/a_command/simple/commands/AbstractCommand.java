package com.jfo.patterns.behavioral.a_command.simple.commands;

import com.jfo.patterns.behavioral.a_command.simple.TextEditor;

public abstract class AbstractCommand implements Command {

    private TextEditor textEditor;

    public AbstractCommand(TextEditor textEditor) {
        this.textEditor = textEditor;
    }

    public TextEditor getTextEditor(){
        return textEditor;
    }
}
