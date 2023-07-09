package Jule9;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Lesson22.Task2();

        System.out.println("3) Реализовать простой калькулятор");

        System.out.println("Цифра 1 - Сложение");
        System.out.println("Цифра 2 - Вычетание");
        System.out.println("Цифра 3 - Умножение");
        System.out.println("Цифра 4 - Деление");
        System.out.println("Введите операцию :");
        int c = in.nextInt();
        System.out.println("Введите часло А: ");
        int a = in.nextInt();
        System.out.print("Введите часло Б: ");
        int b = in.nextInt();
        Lesson22.Task3(a,b,c);
        System.out.println();

    }
}
