package Jule14;

public class Lesson3 {


    public static void task1(int[] array){
        for (int i = 0; i < array.length; i++) {

            if (array[i]%2 != 0) {
                System.out.print(array[i] + "; ");

            }

        }System.out.println();
    }

    public static void task2(int[] array){
        int min = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= array[min]) {
                min = i;

            }
        }
        System.out.print("минимальное значение: " + array[min] + "; ");
        System.out.println();
    }


    public static void task3(int[] array){
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= array[max]) {
                max = i;

            }
        }
        System.out.print("максимальное значение: " + array[max] + "; ");
        System.out.println();
    }

    public static void task4( int[] array){

        double summa = 0;
        for (int i = 0; i < array.length; i++) {
            summa = summa + array[i];
            }
        System.out.println("среднее значение " + summa/array.length);
        }
    }




