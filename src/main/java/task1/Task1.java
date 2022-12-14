package task1;

/*
2. Создайте метод printThreeWords(), который при вызове должен отпечатать в столбец три слова: Orange, Banana, Apple.
Orange
Banana
Apple
3. Создайте метод checkSumSign(), в теле которого объявите две int переменные a и b, и инициализируйте их любыми значениями, которыми захотите. Далее метод должен просуммировать эти переменные, и если их сумма больше или равна 0, то вывести в консоль сообщение “Сумма положительная”, в противном случае - “Сумма отрицательная”;
4. Создайте метод printColor() в теле которого задайте int переменную value и инициализируйте ее любым значением. Если value меньше 0 (0 включительно), то в консоль метод должен вывести сообщение “Красный”, если лежит в пределах от 0 (0 исключительно) до 100 (100 включительно), то “Желтый”, если больше 100 (100 исключительно) - “Зеленый”;
5. Создайте метод compareNumbers(), в теле которого объявите две int переменные a и b, и инициализируйте их любыми значениями, которыми захотите. Если a больше или равно b, то необходимо вывести в консоль сообщение “a >= b”, в противном случае “a < b”;
 */

public class Task1 {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign(3, -9);
        printColor(1110);
        compareNumbers(1,6);
        fizzBuzz(30);
        factorial(6);
        System.out.println(fib(50));

    }
    public static void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign(int a, int b){

        if ((a + b) >=0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }

    }

    public static void printColor(int value){
        if (value < 0) {
            System.out.println("Красный");
        } else if ((value >= 0) && (value <= 100)) {
            System.out.println("Желтый");
        }
        if (value > 100) {
            System.out.println("Зеленый");
        }

    }

    public static void compareNumbers(int a, int b){
        if (a >= b) {
            System.out.println("a >= b");
        }else {
            System.out.println("a < b");
        }
    }

    public static void fizzBuzz(int a){
        if (a%3 == 0 && a%5== 0){
            System.out.println("делится на 3 и 5");
        } else if (a%5 == 0 ) {
            System.out.println("делится на 5");
        }else if( a%3 == 0  ) {
            System.out.println("делится на 3 ");
        }
    }

    public static void factorial(int c){
        int f = 1;
        for (int i = 1; i < c; i++) {
            f = f*i;
            System.out.println(f);
        }
    }


    public static long fib(int n){
        if (n < 3){
            return 1;
        }
           return fib(n - 2) + fib(n - 1);

    }

    public static void fib2(int n) {
        for (int i = 1; i <=n ; i++) {


        }

    }

}
