package September17.view.commands;

import September17.view.ConsoleUI;


public class Finish extends Command {

    public Finish(ConsoleUI consoleUI) {
        super(consoleUI, "выйти из программы");
    }

    @Override
    public void execute() {consoleUI.finish();}
}