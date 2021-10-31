package demo_linhtran.demkytu;

import java.util.Scanner;

public class CountCharacterInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi nhap vao 1 chuoi bat ky: ");
        String chuoi = scanner.nextLine();
        int[] tanSuat = new int[26];

        // tanSuat[0] số lần xuất hiện của chữ a
        // tanSuat[1] số lần xuất hiện của chữ b
        // ...
        // tanSuat[25] số lần xuất hiện của chữ z

        char[] kytu = chuoi.toCharArray();
        for (int i = 0; i < kytu.length; i++) {
            char ch = kytu[i];
            // Kiểm tra xem ch có phải chữ in hoa A-Z,
            if (ch >= 65 && ch <= 90) {
                // Chuyển thành chữ in thường dựa vào bảng mã ascii
                ch = (char) (ch + 32);
            }

            // kiểm tra char có phải là chữ thường hay không
            if (ch >= 97 && ch <= 122) {
                tanSuat[ch - 97]++;
            }
        }

        for (int i = 0; i < tanSuat.length; i++) {
            if (tanSuat[i] != 0) {
                System.out.printf("Ky tu %s xuat hien %d lan\n", (char)(i + 97), tanSuat[i]);
            }
        }
    }
}
