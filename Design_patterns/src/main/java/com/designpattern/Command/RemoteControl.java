package com.example.design_patter.Command;

import java.util.ArrayList;
import java.util.List;// Đối tượng Điều khiển từ xa
class RemoteControl {
    private final List<Command> commands;

    public RemoteControl() {
        commands = new ArrayList<>();
    }

    public void addCommand(Command command) {
        commands.add(command);
    }

    public void executeCommands() {
        for (Command command : commands) {
            command.execute();
        }
    }
}