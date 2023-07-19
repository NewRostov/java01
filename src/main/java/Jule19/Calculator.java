package Jule19;


import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        try {
            File file = new File("log.txt");
            FileWriter fileWriter = new FileWriter(file, true);

            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите первое число: ");
            int a = Integer.parseInt(scanner.nextLine());
            System.out.print("Введите операцию (+ - * /): ");
            char op = scanner.nextLine().charAt(0);
            System.out.print("Введите второе число: ");
            int b = Integer.parseInt(scanner.nextLine());

            switch (op) {
                case '+':
                    System.out.println(a + " + " + b + " = " + add(a, b));
                    fileWriter.write(a + " + " + b + " = " + add(a, b)  + '\n');
                    break;
                case '-':
                    System.out.println(a + " - " + b + " = " + minus(a, b));
                    fileWriter.write(a + " - " + b + " = " + minus(a, b) + '\n');
                    break;
                case '*':
                    System.out.println(a + " * " + b + " = " + multi(a, b));
                    fileWriter.write(a + " * " + b + " = " + multi(a, b) + '\n');
                    break;
                case '/':
                    System.out.println(a + " / " + b + " = " + divide(a, b));
                    fileWriter.write(a + " / " + b + " = " + divide(a, b) + '\n');
                    break;
                default:
                    System.out.println("Wrong operation!");
                    break;
            }
            fileWriter.flush();
            fileWriter.close();
        }
        catch (Exception e){
            System.out.println("Исключение при работе с файлом.");
        }

    }

    private static int divide(int a, int b) {
        if (b != 0) return a / b;
        return -1;
    }

    private static int multi(int a, int b) {
        return a * b;
    }

    private static int minus(int a, int b) {
        return a - b;
    }

    private static int add(int a, int b) {
        return a + b;
    }

}

