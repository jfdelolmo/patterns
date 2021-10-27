package com.jfo.patterns.behavioral.a_command.simple.commands;

import com.jfo.patterns.behavioral.a_command.simple.TextEditor;

public class AddTextCommand extends AbstractCommand {

    private String undoText;
    private String textToAdd;

    public AddTextCommand(TextEditor textEditor, String textToAdd) {
        super(textEditor);
        this.textToAdd = textToAdd;
    }

    @Override
    public void action() {
//        System.out.println("Executing AddTextCommand action");
        this.undoText = getTextEditor().getText();
        getTextEditor().setText(getTextEditor().getText() + this.textToAdd);
    }

    @Override
    public void undo() {
//        System.out.println("Executing AddTextCommand undo");
        getTextEditor().setText(this.undoText);
    }
}
