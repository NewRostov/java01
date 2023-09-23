package September17.view;

import September17.view.commands.*;
import java.util.ArrayList;
import java.util.List;


// класс для описания меню

public class MainMenu {
    private final List<Command> commandList;

    public MainMenu (ConsoleUI consoleUI){
        commandList = new ArrayList<>();
        commandList.add(new GetListOfToys(consoleUI));
        commandList.add(new OrganizeLottery(consoleUI));
        commandList.add(new AddToy(consoleUI));
        commandList.add(new Finish(consoleUI));
    }

    public int getSize() {
        return commandList.size();
    }

    // метод составления меню строк
    public String menu() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < commandList.size(); i++) {
            stringBuilder.append(i + 1);
            stringBuilder.append(". ");
            stringBuilder.append(commandList.get(i).getDescription());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    //м-д выполнения действий по результатам выбора пользователя
    public void execute(int choice) {
        Command command = commandList.get(choice - 1);
        command.execute();
        System.out.println("<><><><><><><><><><><><><>");
    }
}