/*
1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
5. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
7. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
 */



package task3;
public class Task3 {
    public static void main(String[] args) {

        // task 1
        System.out.println("task 1");

        int[] arr31 = {1, 1, 0, 0};
        for (int i = 0; i < arr31.length; i++) {
            if (arr31[i] == 0) {
                arr31[i] = 1;
            }else {
                arr31[i] = 0;
            }
            System.out.println(arr31[i]);
        }

        // task2
        System.out.println("task2");

        int[] arr32 = new int[100];
        for (int i = 0; i < arr32.length; i++) {
            arr32[i] = arr32[i] + i + 1;
            System.out.println( "arr " + i + " = " + arr32[i]);
        }

        // task3
        System.out.println("task3");

        int[] arr33 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr33.length; i++) {
            if (arr33[i] < 6) {
                arr33[i] = arr33[i] * 2;
            }
            System.out.println(arr33[i]);
        }

        // task4
        System.out.println("task4");

        int[][] arr34 = new int[4][4];
        for (int i = 0; i < arr34.length; i++) {
            for (int j = 0; j < arr34[i].length; j++) {
                if ((i == j) || (i == (j - 1) )) {
                    arr34[i][j] = 1;
                    /*
                    0001   i4  j3
                    0010   i3  j2
                    0100   i2  j1
                    1000   i1  j0
                     */

                }
                System.out.print(arr34[i][j]);
            }
            System.out.println();
        }


       //task 5
        System.out.println("task5");

        arr35(6, "qqq");

        //task6
        System.out.println("task6");
        int[] arr36 = {11,42,13,444,5,6,9,20,5,2,5,1,8,93};
        int max = 0;
        for (int i = 0; i < arr36.length; i++) {

            if (arr36[i] > max) {
                max = arr36[i];

            }
        }
        System.out.println(max);


        System.out.println("задание 7 через метод");
        arr(2,2,2,3,3,3);

        System.out.println("задание 7 true or false");
        System.out.println(arr(11,1,1,1,1,1));


        System.out.println("задание 7");
     /*
    7. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
     */
        int[] arr37 = {6,1,1,1,1,22,22,33,33,35,77,78,8,8,8,8,8,554,866,  20,2,2,2,2};
        int l = arr37.length/2, r = arr37.length - l;

        System.out.println( "длина массива = " + arr37.length);
        System.out.println("длина левой части массива = " + l);
        System.out.println("длина правой части массива = " + r);
        int sumL = 0;
        int sumR = 0;

        for (int i = 0; i < l; i++) {
            sumL += arr37[i];

        }
        System.out.println("сумма левой части массива = " + sumL);

        for (int i = l; i < arr37.length; i++) {
            sumR += arr37[i];
        }
        System.out.println("сумма правой части массива = " + sumR);




    }

    /*
    task 5
    5. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
     */
    public static int[] arr35(int len, String initialValue ){
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            System.out.println(initialValue);

        }
        return arr;
    }


    /*
    7. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
     */

    public static boolean arr(int q, int w,int e,int f,int t,int u){
        int[] arr371 = {q,w,e,f,t,u};
        int l = arr371.length/2, r = arr371.length - l;

        System.out.println( "длина массива = " + arr371.length);
        System.out.println("длина левой части массива = " + l);
        System.out.println("длина правой части массива = " + r);
        int sumL = 0;
        int sumR = 0;

        for (int i = 0; i < l; i++) {
            sumL += arr371[i];

        }
        System.out.println("сумма левой части массива = " + sumL);

        for (int i = l; i < arr371.length; i++) {
            sumR += arr371[i];
        }
        System.out.println("сумма правой части массива = " + sumR);

        return  (sumR == sumL);

        }


    }





