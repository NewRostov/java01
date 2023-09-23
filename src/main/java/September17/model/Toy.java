package September17.model;

// класс игрушка
public class Toy implements Comparable<Toy> {
    private int id;
    private final String name;
    private int quantity;
    private final int frequencyOfLoss;

    public Toy(int id, String name, int quantity, int frequencyOfLoss) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        if(frequencyOfLoss<1 || frequencyOfLoss>9){
            System.out.println("шанс выпадения игрушки введен некорректно\n" +
                    "задано значение по умолчанию  = 4");
            this.frequencyOfLoss = 4;
        } else {this.frequencyOfLoss = frequencyOfLoss;}
    }

    public int getId() {return id;}

    public void setId(int id) {this.id = id;}

    public String getName() {return name;}

    public int getQuantity() {return quantity;}

    public void setQuantity(int quantity) {this.quantity = quantity;}

    public int getFrequencyOfLoss() {return frequencyOfLoss;}

    @Override
    public String toString() {
        return "id: " + id + ", название: " + name + ", кол-во: " + quantity +
                ", шанс выпадения: " + frequencyOfLoss;
    }

    @Override
    public int compareTo(Toy toy) {
        return this.frequencyOfLoss - toy.getFrequencyOfLoss();
    }
}