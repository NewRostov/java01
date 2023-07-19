package Jule19;

// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Task1 {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите длину списка: ");
        int l = in.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < l; i++) {
            list.add(i, (int) ( Math.random() * 100 ));

        }System.out.println("список без измениний:   " + list);

        LinkedList<String> reversedList = reverseLinkedList(list);
        System.out.println("список после измениний: " + reversedList);
    }

    public static LinkedList reverseLinkedList(LinkedList list) {
        Collections.reverse(list);
        return list;
    }
}
