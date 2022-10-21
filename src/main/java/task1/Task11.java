package task1;

public class Task11 {
    public static void main(String[] args) {
        r(9);
        r1(9);
        r2(9);
        r3(9);
        r4(9);
    }

    public static void r(int a) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if (i == 0 || i == 8 || j == 0 || j == 8) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }System.out.println("------------------");
    }

    public static void r1(int a) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if (i == 0 || i == 8 || j == 0 || j == 8 || i == j) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();

        } System.out.println("------------------");
    }


        public static void r2(int a){
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < a; j++) {
                    if (i == 8 || j == 0 || i == j) {
                        System.out.print(" *");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }System.out.println("------------------");

        }

    public static void r3(int a) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if (i == 0 || i == 1 || i == 8 || i == 7 || j == 0 || j == 8 || j == 1 || j == 7) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }System.out.println("------------------");
    }

    public static void r4(int a) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if ( (i > 2 || j < 6) && (i < 6 || j > 2) ) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }System.out.println("------------------");
    }

    }

