package demo_subkey_lt.demo_fx.as4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        HumanResources humanResources = new HumanResources();
        boolean check = true;
        System.out.println("Chào mừng bạn đến với phần mền quản lí nhân viên công ti");

        //Vòng lặp thực hiện chương trình
        while (check){
            menu();
            System.out.printf("Lựa chọn của bạn:");
            int choose = scanner.nextInt();
            switch (choose){
                case 1:
                    System.out.println();
                    humanResources.hienThiDanhSach();
                    break;
                case 2:
                    System.out.println();
                    humanResources.hienThiBoPhan();
                    break;
                case 3:
                    System.out.println();
                    humanResources.hienThiNhanVienBoPhan();
                    break;
                case 4:
                    System.out.println();
                    humanResources.themNhanVien(scanner);
                    break;
                case 5:
                    System.out.println();
                    String s = scanner.nextLine();
                    System.out.printf("Nhập tên hoặc mã nhân viên:");
                    String str = scanner.nextLine();
                    humanResources.timKiem(str);
                    break;
                case 6:
                    System.out.println();
                    humanResources.hienThiBangLuong();
                    break;
                case 7:
                    System.out.println();
                    humanResources.hienThiBangLuongTangDan();
                    break;
                case 8:
                    System.out.println();
                    check = false;
                    break;
                default:System.out.println("Số bạn nhập không có trong menu");
            }
        }
    }


    //Phương thức hiển thị menu lựa chọn
    public static void menu(){
        System.out.println("-------------------------------------------------------");
        System.out.println("1.Hiển thị danh sách nhân viên hiện có trong công ty");
        System.out.println("2.Hiển thị các bộ phận trong công ty");
        System.out.println("3.Hiển thị các nhân viên theo từng bộ phận");
        System.out.println("4.Thêm nhân viên mới vào công ty");
        System.out.println("5.Tìm kiếm thông tin nhân viên theo tên hoặc mã nhân viên");
        System.out.println("6.Hiển thị bảng lương của nhân viên toàn công ty");
        System.out.println("7.Hiển thị bảng lương của nhân viên theo thứ tự tăng dần");
        System.out.println("8.Thoát");
    }
}
