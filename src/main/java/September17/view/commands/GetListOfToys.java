package September17.view.commands;

import September17.view.ConsoleUI;


public class GetListOfToys extends Command {

    public GetListOfToys(ConsoleUI consoleUI) {
        super(consoleUI, "вывести список игрушек");
    }

    @Override
    public void execute()  {consoleUI.getListOfToys();}
}