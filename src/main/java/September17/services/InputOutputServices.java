package September17.services;

import September17.model.QuestionForLottery;
import September17.model.Toy;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

// класс работы с файлами
public class InputOutputServices {
    public InputOutputServices() {
    }

    // метод добавления игрушки в файл
    public static void saveToyInFile (Toy toy, Boolean logical){
        try (FileWriter writer = new FileWriter(new File("toys.txt"), logical);) {
//        try (FileWriter writer = new FileWriter(new File("toys.txt"), true);) {
            try {
                writer.write(toy.getId() + ",");
                writer.write(toy.getName() + ",");
                writer.write(toy.getQuantity() + ",");
                writer.write(toy.getFrequencyOfLoss() + "\n");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
//            System.out.println("в список игрушек добавлена следующая запись: \n" + toy);
        } catch (IOException e) {
            e.printStackTrace();
        }
//        System.out.println(toy);
    }

    // метод перезаписи либо добавления игрушек
    public static void reWriteToyInFile (List<Toy> listToys) {
        int id = 1;
        for (Toy toy : listToys) {
            if (toy.getId() == 1) {
                toy.setId(id++);
                saveToyInFile(toy, false);
                continue;
            }
            toy.setId(id++);
            saveToyInFile(toy, true);
        }
    }

    // метод получения списка игрушкек из файла
    public static List<Toy> loadToyFromFile() {
        try {
            new File("toys.txt").createNewFile();
        } catch (IOException e) { throw new RuntimeException(e);}
        List<Toy> list = new ArrayList<>();
        try (BufferedReader bf = new BufferedReader(new FileReader("toys.txt"))) {
            String str;
            while ((str = bf.readLine()) != null) {
                String[] array = str.split(",");
                Toy toy = new Toy(Integer.parseInt(array[0]), array[1], Integer.parseInt(array[2]), Integer.parseInt(array[3]));
                list.add(toy);
            }
        } catch (IOException e) { e.printStackTrace();}
        return list;
    }

    // метод получения вопросов для розыгрыша
    public static List<QuestionForLottery> getQuestions() {
        try {
            new File("questionsList.txt").createNewFile();
        } catch (IOException e) {throw new RuntimeException(e);}

        List<QuestionForLottery> list = new ArrayList<>();
        try (BufferedReader bf = new BufferedReader(new FileReader("questionsList.txt"))) {
            String str;
            while ((str = bf.readLine()) != null) {
                String[] array = str.split(";");
                QuestionForLottery questionForLottery = new QuestionForLottery(
                        Integer.parseInt(array[0]), array[1], Integer.valueOf(array[array.length - 1]));
                int num = 1;
                for (String value : array) {
                    if (value.startsWith(num + ".")) {
                        questionForLottery.getListAnswer().add(value);
                        num++;
                    }
                }
                list.add(questionForLottery);
            }
        } catch (IOException e) { e.printStackTrace();}
        return list;
    }
}