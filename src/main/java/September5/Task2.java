package September5;

/*
Задание 2
try {
   int d = 0;
   double catchedRes1 = intArray[8] / d;
   System.out.println("catchedRes1 = " + catchedRes1);
} catch (ArithmeticException e) {
   System.out.println("Catching exception: " + e);
}

 */

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int[] intArray = new int[] {3, 6, 2, 6, 1, 9, 12, 23, 12, 6, 2, 1};
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Введите делимое (индекс элемента массива): ");
            int divisible = intArray[scanner.nextInt() - 1];
            System.out.println("Введите делитель: ");
            int d = scanner.nextInt();
            double catchedRes1 = (double) divisible / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException | IndexOutOfBoundsException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}