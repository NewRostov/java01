package Jule6;
/*
1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
2) Вывести все простые числа от 1 до 1000
3) Реализовать простой калькулятор
4) (дополнительное задание) Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69. Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет.
*/
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.println("1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)");
        System.out.print("Введите n-ое треугольное число: ");
        int n = in.nextInt();
        Lesson1.Task1(n);
        System.out.println();


        System.out.println("2) Вывести все простые числа от 1 до 1000( или любого числа M)");
        System.out.print("Введите число M: ");
        int m = in.nextInt();
        Lesson1.Task2(m);
        System.out.println();

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
        Lesson1.Task3(a,b,c);
        System.out.println();



    }
}
