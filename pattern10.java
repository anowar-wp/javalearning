import java.util.Scanner;

public class pattern10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Enter your number: ");
        n = input.nextInt();

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print(" " + row);
            }
            System.out.println("");
        }
        System.out.println("");
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print(" " + (char) (col + 64));
            }
            System.out.println("");
        }
    }
}