package ss3_array_method.thuc_hanh;

import java.util.Scanner;

public class thucode {
    public static void main(String[] args) {
        //Bước 3: Khai báo các biến, nhập và kiểm tra kích thước mảng
        //Bước 4: Nhập giá trị cho các phần tử của mảng

        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("en ter size");
            size = scanner.nextInt();
           if (size > 20)
                System.out.println("Size does not exceed 20");
        } while (size>20);
        //Bước 4: Nhập giá trị cho các phần tử của mảng
        array = new int[size];
        System.out.println(array.length);
        int i = 0;
         while (i< array.length){
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
             i++;
        }
//        for (int i = 0; i < array.length; i++) {
//            System.out.print("Enter element " + (i + 1) + ": ");
//
//            array[i] = scanner.nextInt();
//
//        }
        //System.out.println(array);
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j]);
        }
        for (int j = 0; j < array.length/2; j++) {
            int temp = array[j];
            array[j]= array[array.length-1-j];
            array[array.length-1-j]= temp;
        }
        System.out.printf("\n%-20s%s", "Reverse array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }



    }
}
