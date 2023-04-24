/*
              * 
             * *
            * * *
 */


import java.util.Scanner;

public class Pattern10Part14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Enter your number: ");
        n = input.nextInt();
        /*
         * for (int row = 1; row <= n; row++) {
         * // printing spaces
         * for (int col=1; col<=n-row; col++) {
         * System.out.print(" ");
         * }
         * // printing stars
         * for (int col=1; col<=2*row-1; col++) {
         * System.out.print("*");
         * }
         * System.out.println("");
         * }
         * 
         * for (int row = n-1; row>=1; row--) {
         * // printing spaces
         * for (int col=1; col<=n-row; col++) {
         * System.out.print(" ");
         * }
         * // printing stars
         * for (int col = 1; col<=2*row-1; col++) {
         * System.out.print("*");
         * }
         * System.out.println("");
         * }
         */

         for(int row=1; row<=n; row++){
            //printing spaces
            for(int col=1; col<=n-row;col++){
                System.out.print(" ");
            }
            //printing numbers
            for(int col=1; col<=row;col++){
                System.out.print(" "+col);
            }
            System.out.println("");
         }
         for(int row=n-1; row>=1; row--){
            //printing spaces
            for(int col=1; col<=n-row;col++){
                System.out.print(" ");
            }
            //printing numbers
            for(int col=1; col<=row;col++){
                System.out.print(" "+col);
            }
            System.out.println("");
         }
    }

}