import java.util.Scanner;

public class PatternPart11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Enter your number: ");
        n = input.nextInt();

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("  "+col*row);
            }
            System.out.println("");
        }
    }
}
