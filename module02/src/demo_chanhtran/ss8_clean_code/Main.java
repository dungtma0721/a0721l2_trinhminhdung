package demo_chanhtran.ss8_clean_code;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập tháng");//
        int month = Integer.parseInt(scanner.nextLine());// tên biêế không rõ ràng
        System.out.println("nhập năm");// message không rõ
        int year = Integer.parseInt(scanner.nextLine());// tên biến không rõ ràng
        DayInMonth dayInMonth = new DayInMonth();
        dayInMonth.showDayInMonth(month,year);
    }
}
