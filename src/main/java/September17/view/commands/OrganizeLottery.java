package September17.view.commands;

import September17.view.ConsoleUI;


public class OrganizeLottery extends Command{

    public OrganizeLottery(ConsoleUI consoleUI) {
        super(consoleUI, "провести розыгрыш игрушек");
    }

    @Override
    public void execute() {
        consoleUI.getOrganazeLottery();
    }
}