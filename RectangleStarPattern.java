import java.util.Scanner;

public class RectangleStarPattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Enter your number");
        n = input.nextInt();
        /*
         * for (int row = 1; row <= n; row++) {
         * for (int col = 1; col <= n; col++) {
         * if (row == 1 || row == n || col == 1 || col == n) {
         * System.out.print("* ");
         * } else {
         * System.out.print("  ");
         * }
         * }
         * System.out.println("");
         * }
         * 
         * for (int row = 1; row <= n; row++) {
         * for (int col = 1; col <= n; col++) {
         * if (col == 1 || row == n || col == row) {
         * System.out.print("* ");
         * } else {
         * System.out.print("  ");
         * }
         * }
         * System.out.println("");
         * }
         * for (int row = 1; row <= n; row++) {
         * for (int col = 1; col <= n; col++) {
         * if (row == col || row + col == n + 1) {
         * System.out.print("* ");
         * } else {
         * System.out.print("  ");
         * }
         * }
         * System.out.println("");
         * }
         * int count = 0;
         * for (int row = 1; row <= n; row++) {
         * for (int col = 1; col <= row; col++) {
         * System.out.print((++count)+"  ");
         * }
         * System.out.println("");
         * }
         * 
         */
        
        
        /*
                  1
                1 2 1
              1 2 3 2 1
         */
        
        
         for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n-row; col++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print(" " + col);
            }
            for (int col = row-1; col >=1; col--) {
                System.out.print(" " + col);
            }
            System.out.println("");
        }

/*
    1 2 1
     1
 */
        for (int row = n-1; row >=1; row--) {
            for (int col = 1; col <= n-row; col++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print(" " + col);
            }
            for (int col = row-1; col >=1; col--) {
                System.out.print(" " + col);
            }
            System.out.println("");
        }

    }
}
