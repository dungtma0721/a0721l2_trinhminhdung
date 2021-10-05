package ss2_loop.bai_tap;

import java.util.Scanner;

public class nPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so nguyen to can in");
        int n = input.nextInt();
        int countP = 0;
        int N = 2;
        int count = 0;
        while (countP < n) {
            for (int i = 1; i <=N; i++) { //check prime
                if (N % i == 0){
                    count++;
                }
            }
            if (count == 2){
                System.out.print(N);
                countP++;
            }
            if (countP==n) break;
            N++;
        }
    }
}
