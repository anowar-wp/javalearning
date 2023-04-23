import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;
        System.out.println("Enyter your number: ");
        n = input.nextInt();
        /*
         * 1
         * 1 2
         * 1 2 3
         */
        System.out.println("****************Type-1*************");
        for (int row = 1; row <= n; row++) {
            // printing space
            for (int col = 1; col <= n - row; col++) {
                System.out.print("  ");
            }
            // printing number
            for (int col = 1; col <= row; col++) {
                System.out.print(" " + col);
            }
            System.out.println("");
        }
        System.out.println("*****************Type-2************");
        /*
         * 1
         * 2 2
         * 3 3 3
         */

        for (int row = 1; row <= n; row++) {
            // printing space
            for (int col = 1; col <= n - row; col++) {
                System.out.print("  ");
            }
            // printing number
            for (int col = 1; col <= row; col++) {
                System.out.print(" " + row);
            }
            System.out.println("");
        }
        System.out.println("***************Type-3**************");
        /*
         * 1
         * 1 0
         * 1 0 1
         */

        for (int row = 1; row <= n; row++) {
            // printing space
            for (int col = 1; col <= n - row; col++) {
                System.out.print("  ");
            }
            // printing number
            for (int col = 1; col <= row; col++) {
                System.out.print(" " + col % 2);
            }
            System.out.println("");
        }
        System.out.println("*************Type-4****************");
        /*
         * 1
         * 0 0
         * 1 1 1
         */
        for (int row = 1; row <= n; row++) {
            // printing space
            for (int col = 1; col <= n - row; col++) {
                System.out.print("  ");
            }
            // printing number
            for (int col = 1; col <= row; col++) {
                System.out.print(" " + row % 2);
            }
            System.out.println("");
        }
        System.out.println("**************Type-5**************");
        /*
         * A
         * A B
         * A B C
         */
        for (int row = 1; row <= n; row++) {
            // printing space
            for (int col = 1; col <= n - row; col++) {
                System.out.print("  ");
            }
            // printing number
            for (int col = 1; col <= row; col++) {
                System.out.print(" " + (char) (col + 64));
            }
            System.out.println("");
        }
        System.out.println("*************Type-6****************");
        /*
         * A
         * B B
         * C C C
         */
        for (int row = 1; row <= n; row++) {
            // printing space
            for (int col = 1; col <= n - row; col++) {
                System.out.print("  ");
            }
            // printing number
            for (int col = 1; col <= row; col++) {
                System.out.print(" " + (char) (row + 64));
            }
            System.out.println("");
        }
        System.out.println("************Type-7*****************");
        /*
         * 
         * *
         * * *
         */

        for (int row = 1; row <= n; row++) {
            // printing space
            for (int col = 1; col <= n - row; col++) {
                System.out.print("  ");
            }
            // printing number
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println("**************Type-8***************");
        /*
         * #
         * # #
         * # # #
         */
        for (int row = 1; row <= n; row++) {
            // printing space
            for (int col = 1; col <= n - row; col++) {
                System.out.print("  ");
            }
            // printing number
            for (int col = 1; col <= row; col++) {
                System.out.print("# ");
            }
            System.out.println("");
        }
        System.out.println("***************************************");

    }
}
