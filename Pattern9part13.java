/*
         1
       1 2 3
     1 2 3 4 5
   1 2 3 4 5 6 7
 1 2 3 4 5 6 7 8 9
   1 2 3 4 5 6 7
     1 2 3 4 5
       1 2 3
         1
 */
import java.util.Scanner;
public class Pattern9part13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Enter your number: ");
        n = input.nextInt();

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row; col++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= 2 * row - 1; col++) {
                System.out.print(" " + col);
            }
            System.out.println("");
        }

        for (int row = n-1; row >= 1; row--) {
            for (int col = 1; col <= n - row; col++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= 2 * row - 1; col++) {
                System.out.print(" " + col);
            }
            System.out.println("");
        }
    }
}
