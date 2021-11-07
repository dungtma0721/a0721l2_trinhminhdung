package demo_chanhtran.ss15_exception;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
       int[] array ={1,3,4,2,4,5};
       for (int i =0; i<array.length;i++){
           if (i ==20){
               System.out.println("ok");
           }
       }
    }

    public static void method1() {
        Scanner scanner = new Scanner(System.in);
        int[] array = {10, 20, 30, 40};
        boolean flag = true;
        while (flag) {
            flag = false;
            try {
                System.out.println("nhâp vị trí mảng cần lấy ra");
                int index = Integer.parseInt(scanner.nextLine());
                System.out.println("Phần tử bạn cần lấy ra: " + array[index]);
            } catch (NumberFormatException e) {
                System.out.println("lỗi nhập không phải số nguyên");
                e.printStackTrace();
                System.out.println("nhập lại");
                flag = true;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("truy cập ngoài phần tử mảng");
                e.printStackTrace();
                System.out.println("nhập lại");
                flag = true;
            }

        }
        System.out.println("Kết thúc chương trìn");
    }

    public static void readFile(String pathFile) {
        File file = new File(pathFile);
        try {
            FileReader fileReader = new FileReader(pathFile);
            BufferedReader bufferedReader =new BufferedReader(fileReader);
            String string =bufferedReader.readLine();
            System.out.println(string);
            // code dọc file
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

        }

        System.out.println("Kết thúc chương trình");
    }

    public static int inputAge() throws AgeException {
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        if (age < 18) {
            throw new AgeException("Tuoi nhỏ hơn 18");
        }else if (age>100){
            throw new AgeException("Tuoi lớn hơn 100");
        }
        return age;
    }
    public static void errorMethod(){
        System.out.println("error");
        errorMethod();
    }

}
