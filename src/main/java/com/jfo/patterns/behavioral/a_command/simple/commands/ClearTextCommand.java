package com.jfo.patterns.behavioral.a_command.simple.commands;

import com.jfo.patterns.behavioral.a_command.simple.TextEditor;

public class ClearTextCommand extends AbstractCommand {

    private String undoText = "";

    public ClearTextCommand(TextEditor textEditor) {
        super(textEditor);
    }

    @Override
    public void action() {
//        System.out.println("Executing ClearTextCommand action");
        undoText = getTextEditor().getText();
        getTextEditor().setText("");
    }

    @Override
    public void undo() {
//        System.out.println("Executing ClearTextCommand undo");
        getTextEditor().setText(undoText);
    }
}
