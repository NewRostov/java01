package September17.view.commands;

import September17.view.ConsoleUI;

public abstract class Command {
    ConsoleUI consoleUI;
    String description;

    public Command(ConsoleUI consoleUI, String description) {
        this.consoleUI = consoleUI;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public abstract void execute();
}
