package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class readNum {
    public static void main(String[] args) {
        //Bước 1: viết mã để chương trình hỏi số cần đọc
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = scanner.nextInt();

    /**
    Bước 2: đọc các số có một chữ số
    Nếu số cần đọc nhỏ hơn 10 và lớn hơn hoặc bằng 0, hãy sử dụng cấu trúc switch case để đọc số đó.
    Nếu số cần đọc vượt quá khả năng, in ra chuỗi out of ability
    final String KHONG = "không";
    final String [] number = {KHONG, MOT, HAI, BA,
            BON, NAM, SAU, BAY, TAM, CHIN};
     */

        if (num > 0 && num < 10) {
            switch (num) {
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("seven");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                case 9:
                    System.out.println("nine");
                    break;
            }
        }
        /**
         * Bước 3: đọc các số có hai chữ số nhỏ hơn 20
         *
         * Trong trường hợp số cần đọc nhỏ hơn 20 và lớn hơn hoặc bằng 10, tính ra số hàng đơn vị (ones), sau đó sử dụng cấu trúc switch case để đọc số thành các string tương ứng.
         *
         * Ví dụ: từ số 16, có số 6, đọc thành sixteen.
          */
        else if(num>=10 && num<20){
            int x = num%10;
            switch (x){
                case 0:
                    System.out.println("ten");
                    break;
                case 1:
                    System.out.println("eleven");
                    break;
                case 2:
                    System.out.println("twelve");
                    break;
                case 3:
                    System.out.println("thirdteen");
                    break;
                case 4:
                    System.out.println("fourfteen");
                    break;
                case 5:
                    System.out.println("fifteen");
                    break;
                case 6:
                    System.out.println("sixteen");
                    break;
                case 7:
                    System.out.println("seventeen");
                    break;
                case 8:
                    System.out.println("eighteen");
                    break;
                case 9:
                    System.out.println("nineteen");
                    break;
            }
        }
        /**
         * Bước 4: đọc các số có hai chữ số lớn hơn hoặc bằng 20
         *
         * Trong trường hợp số cần đọc nhỏ hơn 100 và lớn hơn hoặc bằng 20, tính ra số hàng chục và số hàng đơn vị (ones).
         *
         * Ví dụ, từ 61 có tens = 6 và ones = 1.
         *
         * Sử dụng cấu trúc switch case để đọc riêng biệt hàng chục và hàng đơn vị thành chữ, ghép lại thành câu hoàn chỉnh.
         *
         * Ví dụ, từ 61 có sixty và one, ghép lại thành sixty one.
          */
        else if (num>=20&& num<100){
            int y = num/10;
            int x = num%10;
            switch (y){
                case 2:
                    System.out.print("twenty ");
                    switch (x){
                        case 1:
                            System.out.println("one");
                            break;
                    }
            }
        }
    }
}
