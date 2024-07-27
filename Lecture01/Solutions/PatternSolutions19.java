package Lecture01.Solutions;
public class PatternSolutions19{

    public static void pattern19(int n){


        /*
         *              OUTPUT FOR N = 7
         * 
         *               * * * * * * *
         *               * * *   * * *
         *               * *       * *
         *               *           *
         *               * *       * *
         *               * * *   * * *
         *               * * * * * * *
         * 
         */

        for (int i = n/2+1; i >=1; i--) {
            for (int j = 1; j <=i && j<=n/2; j++) {
                System.out.print("* ");
            }
            for (int k = 2; k <=n/2+1-i && k<=n/2; k++) {
                System.out.print("  ");
            }
            for (int k = 1; k <=n/2+1-i; k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 2; i <=n/2+1; i++) {
            for (int j = 1; j <=i && j<=n/2; j++) {
                System.out.print("* ");
            }
            for (int k = 2; k <=n/2+1-i && k<=n/2; k++) {
                System.out.print("  ");
            }
            for (int k = 1; k <=n/2+1-i; k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern19(7);
    }
}