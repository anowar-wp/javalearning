import java.util.Scanner;

public class LoopAssignment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        int pass;
        do {
            System.out.println("Enter your name");
            name = input.nextLine();
            System.out.println("Enter your password: ");
            pass = input.nextInt();
            input.nextLine();
            if (name.equals("anis") && pass == 123456) {
                System.out.println("Welcome to the system");
            } else {
                System.out.println("Username/password is incorrect. Please try again");
                break;
            }
        } while (!name.equals("anis") && pass != 123456);
    }
}
