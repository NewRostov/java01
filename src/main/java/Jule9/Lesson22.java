package Jule9;
import java.io.*;

/*
2) Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
3) К калькулятору из предыдущего ДЗ добавить логирование.
 */
public class Lesson22 {

    public static void Task2(){
        try(FileOutputStream fos=new FileOutputStream("notes3.txt"))
        {
            int[] array = {4,2,9,5,33,2,7,};
            int max = 0 ;
            for (int i = 1; i < array.length ; i++) {

                if (array[i] > array[max]){
                    max = i;
                }
                String text = "Итерация номер " + ( i ) + "; Максимальное число = " + array[max] + "\n";
                byte[] buffer = text.getBytes();
                fos.write(buffer, 0, buffer.length);

            }
            System.out.println( "Индекс наибольшего числа [ i ] = " + ( max - 1 ) + "; Максимальное число = " + array[max]);
            System.out.println("The file has been written");
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }




    }


    public static void Task3(float a, float b, int e){

        try(FileOutputStream fos=new FileOutputStream("notes4.txt")) {



            if(e == 1){
                String text = "Операция - Сложение: " + "a + b = " + (a + b) + "\n";
                byte[] buffer = text.getBytes();
                fos.write(buffer, 0, buffer.length);
                System.out.println("a + b = " + (a + b));

            } else if(e == 2){
                String text = "Операция - Вычетание: " + "a - b = " + (a - b) + "\n";
                byte[] buffer = text.getBytes();
                fos.write(buffer, 0, buffer.length);
                System.out.println("a + b = " + (a - b));
            }else if(e == 3){
                String text = "Операция - Умножение: " + "a - b = " + (a * b) + "\n";
                byte[] buffer = text.getBytes();
                fos.write(buffer, 0, buffer.length);
                System.out.println("a * b = " + (a * b));
            }else if(e == 4){
                String text = "Операция - Деление: " + "a - b = " + (a / b) + "\n";
                byte[] buffer = text.getBytes();
                fos.write(buffer, 0, buffer.length);
                System.out.println("a / b = " + (a / b));
            }




        }

        catch(IOException ex){

            System.out.println(ex.getMessage());
        }

    }




}



