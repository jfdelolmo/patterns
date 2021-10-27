package com.jfo.patterns.behavioral.a_command.simple;

import com.jfo.patterns.behavioral.a_command.simple.commands.AddTextCommand;
import com.jfo.patterns.behavioral.a_command.simple.commands.ClearTextCommand;
import com.jfo.patterns.behavioral.a_command.simple.commands.Command;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Optional;

public class TextEditor {

    private String text;

    private final Deque<Command> stack = new LinkedList<>();

    private void executeAction(Command command) {
        command.action();
        stack.add(command);
    }

    private void undo() {
        Command command = stack.pollLast();
        if (null != command) {
            command.undo();
        }
    }

    public String getText() {
        return Optional.ofNullable(text).orElse("");
    }

    public void setText(String text) {
        this.text = text;
    }

    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        editor.setText("Demo text");

        ClearTextCommand command = new ClearTextCommand(editor);
        editor.executeAction(command);

        System.out.printf("Text is: %s%n", editor.getText());
        editor.undo();
        System.out.printf("Text is: %s%n", editor.getText());

        AddTextCommand addTextCommand = new AddTextCommand(editor, "Hello world1!");
        editor.executeAction(addTextCommand);
        System.out.printf("Text is: %s%n", editor.getText());
        addTextCommand = new AddTextCommand(editor, " Hello world2!");
        editor.executeAction(addTextCommand);

        System.out.printf("Text is: %s%n", editor.getText());
        editor.undo();
        System.out.printf("Text is: %s%n", editor.getText());
        editor.undo();
        System.out.printf("Text is: %s%n", editor.getText());
    }

}
