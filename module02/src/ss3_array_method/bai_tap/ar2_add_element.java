package ss3_array_method.bai_tap;

import java.util.Scanner;

public class ar2_add_element {
    public static void main(String[] args) {
        int array[] = {5,9,7,6,11,85,47,21,39,58};
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap phan tu muon them");
        int n = sc.nextInt();
        System.out.println("Nhap vij tri");
        int index = sc.nextInt();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if(i == index){
                for (int j = array.length-1; j >i ; j--) {
                    array[j] = array[j-1];
                }
                array[i] = n;
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }
}
