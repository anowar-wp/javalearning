import java.util.Scanner;

public class Pattern8Part12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Enter your number: ");
        n = input.nextInt();

/*
   *  
  *** 
 *****
*******
  
 */

        for(int row =1; row<=n; row++){
            //printing spaces
            for(int col = 1; col<=n-row; col++){
                System.out.print("  ");
            }
            for(int col = 1; col<= 2*row-1; col++){
                System.out.print("* ");
            }
            System.out.println("");
        }


/*
          1
       1 0 1
     1 0 1 0 1
   1 0 1 0 1 0 1
 1 0 1 0 1 0 1 0 1
 */

        for(int row =1; row<=n; row++){
            //printing spaces
            for(int col = 1; col<=n-row; col++){
                System.out.print("  ");
            }
            for(int col = 1; col<= 2*row-1; col++){
                System.out.print(" "+col%2);
            }
            System.out.println("");
        }

    }
}
