package September5;

/*
Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. Пользователю должно
показаться сообщение, что пустые строки вводить нельзя.
 */

import java.util.EmptyStackException;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) throws Exception {
        noEmptyStrings();
    }

    public static void noEmptyStrings() throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");
        String line = scanner.nextLine();
        if (line.isEmpty()){
            System.out.println("Пустые строки вводить нельзя");
            Exception EmptyStackException = null;
            throw EmptyStackException;
        }
    }
}
