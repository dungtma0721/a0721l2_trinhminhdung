package demo_chanhtran.ss15_exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class DemoException {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        method();

        System.out.println(" nhập file");
        String pathFile = scanner.nextLine();
        readFile(pathFile);

        System.out.println(" nhập đường dẫn");
        String pathFile1 = scanner.nextLine();
        try {
            readFile1(pathFile1);
        } catch (FileNotFoundException e) {
            System.out.println("Lỗi không tìm thầy file");
            e.printStackTrace();
        }

        // demo CustomException

//        int age=0;
//        try {
//            age = inputAge();
//        } catch (AgeException e) {
//            e.printStackTrace();
//        }
//        System.out.println(age);

    }
    public static void method(){
        Scanner scanner = new Scanner(System.in);
        int[] arr = {10,20,30,40};
        System.out.println(" nhập vào index");
        boolean flag=true;
        while (flag){
            flag =false;
            try {
                int i = Integer.parseInt(scanner.nextLine());
                System.out.println("giá trị của mảng láy ra" + arr[i]);
            }catch (NumberFormatException e){
//                 code xủ lý
                flag=true;
                System.out.println("lỗi do nhập chuỗi");
                System.out.println("nhập lại");
            }catch (ArrayIndexOutOfBoundsException e){
                flag=true;
                System.out.println("lỗi do nhập index ngoài mảng");
                System.out.println("nhập lại");
            }
        }

        System.out.println("kết thúc chương triìn");
    }

    public static void readFile(String pathFile) {
        File file = new File(pathFile);
        // xử lý tại chỗ
        try {
            FileReader fileReader = new FileReader(file);
            System.out.println("đang đọc file");
            // đọc file
        }catch (FileNotFoundException e){
            System.out.println(" file không đúng");
        }

        System.out.println(" kết thúc chương trình xong");
    }
    public static void readFile1(String pathFile) throws FileNotFoundException{ // ném Exception ra ngoài method khác xly
        File file = new File(pathFile);
            FileReader fileReader = new FileReader(file);
            System.out.println("đang đọc file");
            // đọc fil
        System.out.println(" kết thúc chương trình xong");
    }

    public static int inputAge() throws AgeException   {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" nhập tuổi");
        int age = Integer.parseInt(scanner.nextLine());
        if (age < 18) {
            // ném ra exception tự định nghĩa
            throw new AgeException("Tuổi nhỏ hon 18");
        }else if (age>100){
            throw new AgeException("Tuoi lớn hơn 100");
        }
        return age;
    }


}
