package Jule14;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int l = in.nextInt();
        int[] array = new int[l];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ( Math.random() * 100 );
         System.out.print(array[i] + "; ");
        }

        Lesson3.task1(array);
        Lesson3.task2(array);
        Lesson3.task3(array);
        Lesson3.task4(array);
    }

}
