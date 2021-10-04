package ss2_loop.bai_tap;

import java.util.Scanner;

public class Shape_menu {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while(choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
            System.out.println("3. Print isosceles triangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Print the rectangle");
                    System.out.println("m= :");
                    int m = input.nextInt();
                    System.out.println("n= :");
                    int n = input.nextInt();
                    for (int i = 0; i <m ; i++) {
                        for (int j = 0; j <n ; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("Print the square triangle");
                    System.out.println("m= ");
                    int x = input.nextInt();
                    System.out.println("n= ");
                    int y = input.nextInt();
                    for (int i = 0; i <x ; i++) {
                        for (int j = 0; j <y-i ; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    for (int i = 0; i <x ; i++) {
                        for (int j = 0; j <i ; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Print isosceles triangle");
                    System.out.println("m= ");
                    int a = input.nextInt();
                    System.out.println("n= ");
                    int b = input.nextInt();
                    for (int i = 0; i <a ; i++) {
                        for (int j = a/2+i; j <b ; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
