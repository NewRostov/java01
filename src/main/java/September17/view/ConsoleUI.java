package September17.view;

import September17.model.QuestionForLottery;
import September17.model.Toy;
import September17.services.InputOutputServices;
import September17.services.Services;

import java.util.List;
import java.util.Scanner;


public class ConsoleUI implements View{
    private boolean work;
    private final Scanner scanner;
    private final MainMenu mainMenu;
    private InputOutputServices inputOutputServices;
    private final Services services;


    public ConsoleUI() {
        this.work = true;
        this.scanner = new Scanner(System.in);
        mainMenu = new MainMenu(this);
        this.services = new Services();
    }

    @Override
    public void start() {
        System.out.println("Добро пожаловать в программу Магазин игрушек!");
        System.out.println("----------------");
        while (work) {
            System.out.println(mainMenu.menu());
            String choice = scanner.nextLine();
            int numChoice = Integer.parseInt(choice);
            mainMenu.execute(numChoice);
//            finish();
        }
    }

    public void finish(){
        System.out.println("программа завершена!");
        work = false;
    }

    public void addToy(){
        Scanner scanner = new Scanner(System.in);
        int id = getListOfToys().size() + 1;
        System.out.println("-------------------------");
        System.out.println("Введите название игрушки");
        String name = scanner.nextLine();
        String quantity;
        do {
            System.out.println("количество игрушек (значение от от 1 до 9):   ");
            quantity = scanner.nextLine();
        } while (!quantity.matches("[1-9]"));
        String frequencyOfLoss;
        do {
            System.out.println("введите шанс выпадения игрушки  (значение от от 1 до 9): ");
            frequencyOfLoss = scanner.nextLine();
        } while (!frequencyOfLoss.matches("[1-9]"));
        InputOutputServices.saveToyInFile(new Toy(id, name, Integer.parseInt(quantity) , Integer.parseInt(frequencyOfLoss)), true);
    }

    public List<Toy> getListOfToys(){
        List<Toy> listToys = InputOutputServices.loadToyFromFile();
        System.out.println("Список игрушек:");
        for (Toy toy : listToys) {
            System.out.printf("id: " + toy.getId() + ", название: " + toy.getName() +
                    ", кол-во шт.: " + toy.getQuantity() + ", шанс получения приза: " + toy.getFrequencyOfLoss()+";\n");
//            System.out.println("-------------------------------");
        }
        return listToys;
    }

    public void getOrganazeLottery(){
        List<QuestionForLottery> list = InputOutputServices.getQuestions();
        QuestionForLottery questionForLottery = services.choiceQuestion(list);

        System.out.printf("%s\n Розыгрыш приза! Выберите вариант ответа: \n", questionForLottery.getBody());
        for (String question : questionForLottery.getListAnswer()) {
            System.out.printf("\t%s\n", question);
        }
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (true) {
            if (input.equals(String.valueOf(questionForLottery.getTrueAnswer()))) {
//                String toy = services.getListOfToys();
                String toy = services.getPrize();
                System.out.println("<><><><><><><><><><><><><>");
                System.out.printf("!!! вы выиграли ПРИЗ: %s \n", toy);
                break;
            } else {
                System.out.println("неверно! попробуйте снова");
                input = scanner.nextLine();
            }
        }
    }

    @Override
    public void answer(String text) {
        System.out.println(text);
    }
}