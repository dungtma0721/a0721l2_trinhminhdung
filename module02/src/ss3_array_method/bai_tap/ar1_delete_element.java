package ss3_array_method.bai_tap;

import java.util.Scanner;

public class ar1_delete_element {
    public static void main(String[] args) {
        int array[]= {5,9,7,6,11,85,47,21,39,58,12};
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so can xoa");
        int n = sc.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (array[i]==n){
                for (int j = i; j <array.length-1 ; j++) {
                    array[j]=array[j+1];
                }
            }
        }
        for (int i = 0; i < array.length-1; i++) {
            System.out.println(array[i] );
        }
    }
}
