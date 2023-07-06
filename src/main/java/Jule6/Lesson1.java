package Jule6;

public class Lesson1 {

    public static void Task1(int n) {
        int s = 0;
        for (int i = 1; i <= n; i++) {
            s = s + i;
            System.out.println("n - " + i + " = " + s);
        }
        System.out.println("n-ое треугольного число равно " + s);
    }

    public static void Task2(int n){
        for (int i = 1; i <= n; i++) {
            System.out.print(i + "; ");

        }
        System.out.println();
    }

    public static void Task3(float a, float b, int e){
        if(e == 1){
            System.out.println("a + b = " + (a + b));
        } else if(e == 2){
            System.out.println("a + b = " + (a - b));
        }else if(e == 3){
            System.out.println("a * b = " + (a * b));
        }else if(e == 4){
            System.out.println("a / b = " + (a / b));
        }
        }

    public static void Task4(String q){
        int[] qq = new int[3];
        String m;
        for (int i = 0; i < qq.length; i++) {
            System.out.println(qq[i]);
        }

        }


    }



