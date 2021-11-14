package demo_x.b;

import java.util.Scanner;

public class trycatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Nhap so nguyen");
            int n = scanner.nextInt();
            System.out.println(n);
        }
        catch (Exception e){
            System.out.println("Nhap lai");
        }
    }
}
