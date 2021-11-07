package demo_chanhtran.ss8_clean_code;

import java.util.Scanner;

public class DemoCleanCode1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập tháng");//
        int d = Integer.parseInt(scanner.nextLine());// tên biêế không rõ ràng
        System.out.println("nhập tháng");// message không rõ
        int y = Integer.parseInt(scanner.nextLine());// tên biến không rõ ràng
        dayInMonth(d, y);
    }

    public static void dayInMonth(int d, int y) { // tên tham số không rõ nghĩa + tên method phải bắt đầu bằng động từ
        String result = "";
        switch (d) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                result = "tháng " + d + " có 31 ngày";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                result = "tháng " + d + " có 31"; // thông tin hiên thị ra sai
                break;
            case 2:  //
                if ((y % 4 == 0 && y % 100 == 0) || y % 400 == 0) { // quá nhiều điều kiện trong if => tách hằng + pt đang làm 2 nhiều vụ
                    // in số ngày trong tháng + tính năm nhuận = > tách phương thức
                    result = "tháng " + d + " có 29 ngày";
                } else {
                    result = "tháng " + d + " có 28 ngày";
                }
                break;
            default:
                result = d + " không phải là tháng trong năm ";

        }
        System.out.println(result);

    }
}
