package ss2_loop.thuc_hanh;

import java.util.Scanner;

public class is_Prime {
    public static void main(String[] args) {
        //Scanner input = new Scanner(System.in);
        //System.out.println("Enter a number");
        /**
         *int n = input.nextInt();
         *         int count =0;
         *         for (int i = 1; i <=n ; i++) {
         *             if (n%i==0){
         *                 count++;
         *             }
         *         }
         *         if (count==2){
         *             System.out.println("n is prime");
         *         }
         *         else {
         *             System.out.println("n is not prime");
         *
         *         }
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number:");
        int number = scanner.nextInt();
        if (number < 2){
            System.out.println(number + " is not a prime");
        }
        /**
        *else {
         *             int i = 2;
         *             boolean check = true;
         *             while (i < number) {
         *                 if (number % i == 0) {
         *                     check = false;
         *                     break;
         *                 }
         *                 i++;
         *             }
         *             if (check)
         *                 System.out.println(number + " is a prime");
         *             else
         *                 System.out.println(number + " is not a prime");
         *         }
         */

        else {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(number)) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check)
                System.out.println(number + " is a prime");
            else
                System.out.println(number + " is not a prime");
        }
    }

}
