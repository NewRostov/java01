package September17.services;

import September17.model.QuestionForLottery;
import September17.model.Toy;

import java.util.List;
import java.util.Random;


// класс обработки
public class Services {

    // метод розыгрыша приза
    public String getPrize() {
        List<Toy> listToys = InputOutputServices.loadToyFromFile();
        int value = priorityValue();

        for (Toy toy : listToys) {
            if (toy.getFrequencyOfLoss() == value) {
                if (toy.getQuantity() > 0) {
                    toy.setQuantity(toy.getQuantity() - 1);
                    InputOutputServices.reWriteToyInFile(listToys);
                    return toy.getName();
                } else {
                    getPrize();
                    listToys.remove(toy);
                    InputOutputServices.reWriteToyInFile(listToys);
                }
            }
        }
        return getPrize();
    }

    // метод выбора вопросов
    public QuestionForLottery choiceQuestion(List<QuestionForLottery> list) {
        return list.get(new Random().nextInt(list.size()));
    }

    //метод генерации шанса получения приза: чем меньше значение, тем больше вероятность
    private int priorityValue() {
        int seed = new Random().nextInt(9) + 1;
        return new Random().nextInt(seed + 1);
    }
}
