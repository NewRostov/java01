package task4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        generalBord(4,4, 3);

    }

    public static void generalBord(int H, int W, int M){
        Random random = new Random();


        int[][] bord = new int[H][W];
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {


                int x = random.nextInt(H);
                int y = random.nextInt(W);
                while( M == 1 ){
                    bord[x][y] = 1;
                    M--;
                }

                System.out.print(bord[x][y] + "  ");




            }
            System.out.println();
        }
    }

}

        


