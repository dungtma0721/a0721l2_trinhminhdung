package demo_subkey_lt.demo_fx.as4;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.text.DecimalFormat;
import java.util.*;

public class HumanResources {

    public ArrayList<Staff> arrayList = new ArrayList<>();
    public ArrayList<Department> list = new ArrayList<>();
    Department department1 = new Department("bp1", "Business", 0);
    Department department2 = new Department("bp2", "Project", 0);
    Department department3 = new Department("bp3", "Technical", 0);


    public void setList(){
        if(list.size() < 3){
        list.add(department1);
        list.add(department2);
        list.add(department3);}
    }


    //Phương thức hiển thị danh sách nhân viên công ti
    public void hienThiDanhSach(){
        System.out.println("Danh sách nhân viên:");
        System.out.println(String.format("%-10s%-15s%-15s%-15s%-10s%-10s%-20s",
                "Mã", "Tên",
                "Bộ phận", "Hệ số Lương",
                "Tuổi", "Ngày nghỉ",
                "Ngày vào làm"));
        for(int i = 0;i < arrayList.size(); i++){
            System.out.println( arrayList.get(i).toString());
        }
    }



    //Phương thức hiển các bộ phận trong công ti
    public void hienThiBoPhan(){
        setList();
        System.out.println(String.format("%-20s%-20s%-20s", "Mã bộ phận",
                "Tên bộ phận", "Số lượng nhân viên"));
        for(int i = 0;i < list.size(); i++){
            System.out.println( list.get(i).toString());
        }
    }



    //Phương thức hiển thị nhân viên từng bộ phận
    public void hienThiNhanVienBoPhan(){
        setList();
        for(int i = 0;i < list.size(); i++){
            System.out.println("Nhân viên bộ phận " + list.get(i).getTenBoPhan() + ":");
            for (int j = 0;j < arrayList.size(); j++){
                if(list.get(i).getTenBoPhan().equalsIgnoreCase(arrayList.get(j).getBoPhan())){
                    System.out.println("+" + arrayList.get(j).getTen());
                }
            }
        }
    }




    //Phương thức tìm kiếm bằng tên hoặc mã nhân viên
    public void timKiem(String str){
        boolean check = false;
        System.out.println(String.format("%-10s%-15s%-15s%-15s%-10s%-10s%-20s",
                "Mã", "Tên",
                "Bộ phận", "Hệ số Lương",
                "Tuổi", "Ngày nghỉ",
                "Ngày vào làm"));
        for (int i = 0;i < arrayList.size(); i++){
            if(arrayList.get(i).getTen().contains(str) || arrayList.get(i).getMaNv().contains(str)){
                System.out.println( arrayList.get(i).toString());
                check = true;
            }
        }
        if(check == false)
            System.out.println("Không tìm thấy thông tin về nhân viên");
    }




    //Phương thức hiển thị bảng lương giảm dần
    public void hienThiBangLuong(){
        for(int i = 0;i < arrayList.size(); i++){
            int k = i;
            for(int j = i;j < arrayList.size(); j++){
                if(arrayList.get(k).calculateSalary() < arrayList.get(j).calculateSalary())
                    k = j;
            }
            Staff s;
            s = arrayList.get(i);
            arrayList.set(i, arrayList.get(k));
            arrayList.set(k, s);
        }
        for (int i = 0;i < arrayList.size(); i++){
            System.out.println(String.format("%s:%.0f", arrayList.get(i).getTen(),
                    arrayList.get(i).calculateSalary()));
        }
    }




    //Phương thức hiển thị bảng lương tăng dần
    public void hienThiBangLuongTangDan(){
        for(int i = 0;i < arrayList.size(); i++){
            int k = i;
            for(int j = i;j < arrayList.size(); j++){
                if(arrayList.get(k).calculateSalary() > arrayList.get(j).calculateSalary())
                    k = j;
            }
            Staff s;
            s = arrayList.get(i);
            arrayList.set(i, arrayList.get(k));
            arrayList.set(k, s);
        }
        for (int i = 0;i < arrayList.size(); i++){
            System.out.println(String.format("%s:%.0f", arrayList.get(i).getTen(),
                    arrayList.get(i).calculateSalary()));
        }
    }




    //Phương thức thêm nhân viên
    public void themNhanVien(Scanner scanner){
        setList();
        System.out.println("1.Thêm nhân viên thông thường.");
        System.out.println("2.Thêm nhân viên quản lí.");
        System.out.printf("Nhập lựa chọn của bạn:");
        int choose = scanner.nextInt();
        String str = scanner.nextLine();
        switch (choose){
            case 1:
                System.out.printf("Mã nhân viên: ");
                String ma = scanner.nextLine();
                System.out.printf("Tên nhân viên: ");
                String ten = scanner.nextLine();
                System.out.printf("Tuổi: ");
                int tuoi = scanner.nextInt();
                String s = scanner.nextLine();
                System.out.println("Bộ phận: ");
                boolean check = true;
                String boPhan = "";
                while (check) {
                    System.out.println("1.Project");
                    System.out.println("2.Business");
                    System.out.println("3.Technical");
                    System.out.printf("Bạn chọn: ");
                    int sel = scanner.nextInt();
                    if(sel == 1 || sel == 2 || sel == 3){
                        check = false;
                    }
                    if (sel == 1) {
                        boPhan = "Project";
                    } else if (sel == 2) {
                        boPhan = "Business";
                    } else if (sel == 3) {
                        boPhan = "Technical";
                    }
                }
                String s3 = scanner.nextLine();
                System.out.printf("Ngày vào làm: ");
                String ngay = scanner.nextLine();
                System.out.printf("Ngày nghỉ phép: ");
                int phep = scanner.nextInt();
                System.out.printf("Hệ số lượng: ");
                double heSo = scanner.nextDouble();
                System.out.printf("Giờ làm thêm: ");
                int lamThem = scanner.nextInt();
                arrayList.add(new Employee(ma, ten, ngay, boPhan, tuoi, phep, heSo, lamThem));
                if(boPhan.equalsIgnoreCase("Business"))
                    list.get(0).setSoLuongNhanVien();
                if(boPhan.equalsIgnoreCase("Project"))
                    list.get(1).setSoLuongNhanVien();
                if(boPhan.equalsIgnoreCase("Technical"))
                    list.get(2).setSoLuongNhanVien();
                break;
            case 2:
                System.out.printf("Mã nhân viên: ");
                String ma1 = scanner.nextLine();
                System.out.printf("Tên nhân viên: ");
                String ten1 = scanner.nextLine();
                System.out.printf("Tuổi: ");
                int tuoi1 = scanner.nextInt();
                String s1 = scanner.nextLine();
                System.out.println("Bộ phận: ");
                boolean check1 = true;
                String boPhan1 = "";
                while (check1) {
                    System.out.println("1.Project");
                    System.out.println("2.Business");
                    System.out.println("3.Technical");
                    System.out.printf("Bạn chọn: ");
                    int sel = scanner.nextInt();
                    if(sel == 1 || sel == 2 || sel == 3){
                        check1 = false;
                    }
                    if (sel == 1) {
                        boPhan1 = "Project";
                    } else if (sel == 2) {
                        boPhan1 = "Business";
                    } else if (sel == 3) {
                        boPhan1 = "Technical";
                    }
                }
                String s4 = scanner.nextLine();
                System.out.printf("Ngày vào làm: ");
                String ngay1 = scanner.nextLine();
                System.out.printf("Ngày nghỉ phép: ");
                int phep1 = scanner.nextInt();
                System.out.printf("Hệ số lượng: ");
                double heSo1 = scanner.nextDouble();
                String s2 = scanner.nextLine();
                System.out.println("Chức danh: ");
                boolean check2 = true;
                String chucDanh = "";
                while (check2){
                System.out.println("1.Project Leader");
                System.out.println("2.Business Leader");
                System.out.println("3.Technical Leader");
                System.out.printf("Bạn chọn: ");
                int sel2 = scanner.nextInt();
                if(sel2 == 1 || sel2 == 2 || sel2 == 3){
                        check2 = false;
                }
                if(sel2 == 1){
                    chucDanh = "Project Leader";
                }
                else if(sel2 == 2){
                    chucDanh = "Business Leader";
                }
                else if(sel2 == 3){
                    chucDanh = "Technical Leader";
                }
                }
                arrayList.add(new Manager(ma1, ten1, ngay1, boPhan1, tuoi1, phep1, heSo1, chucDanh));
                if(boPhan1.equalsIgnoreCase("Business"))
                    list.get(0).setSoLuongNhanVien();
                else if(boPhan1.equalsIgnoreCase("Project"))
                    list.get(1).setSoLuongNhanVien();
                else if(boPhan1.equalsIgnoreCase("Technical"))
                    list.get(2).setSoLuongNhanVien();
                break;
            default:
                System.out.println("Số bạn nhập không đúng");
        }
    }


}
