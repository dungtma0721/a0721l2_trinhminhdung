package ss1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class RectangleProgram {
    public static void main(String[] args) {
        float width;
        float height;
        //Khai báo đối tượng Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Width");
        width = scanner.nextFloat();//Nhập chiều rộng
        System.out.println("Enter Height");
        height = scanner.nextFloat();//Nhập chiều dài
        float area = width*height;
        System.out.println("Area "+area);

    }
}
