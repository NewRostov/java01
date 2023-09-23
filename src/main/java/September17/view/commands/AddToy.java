package September17.view.commands;

import September17.view.ConsoleUI;


public class AddToy extends Command {

    public AddToy(ConsoleUI consoleUI) {
        super(consoleUI, "добавить новую игрушку в список");
    }

    @Override
    public void execute() {
        consoleUI.addToy();
    }
}