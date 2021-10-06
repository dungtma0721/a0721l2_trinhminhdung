package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class convert_usd_vnd {
    public static void main(String[] args) {
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter usd:");
        usd = sc.nextDouble();
        System.out.println("Equivalent: " + usd*23000 + "vnd");
    }
}
