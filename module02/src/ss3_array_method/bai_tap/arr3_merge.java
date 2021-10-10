package ss3_array_method.bai_tap;

public class arr3_merge {
    public static void main(String[] args) {
        int arr1[]= {1,2,3,4,5,6};
        int arr2[]= {7,8,9};
        int arr3[];
        int a = arr1.length+arr2.length;
        arr3= new int[a];
        System.out.println(arr3.length);
        for (int i = 0; i < arr1.length; i++) {
            arr3[i]= arr1[i];
        }
        for (int i = 0; i <arr2.length ; i++) {
            arr3[i+arr1.length]= arr2[i];
        }
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i]+ " ");
        }
    }
}
