package ss3_array_method.thuc_hanh;

public class TestMax {
    public static void main(String[] args) {
        int i = 5;
        int j = 2;
        int k = max(i, j);
        System.out.println("The maximum of " + i + " and " + j + " is " + k);
        System.out.println("The maximum of " + i + " and " + j + " is " + max1(i,j));
    }

    public static int max(int num1, int num2) {
        int result;
        if (num1 > num2) {
            result = num1;
        } else {
            result = num2;
        }
        return result;
    }


    public  static int max1(int a, int b){
        int c;
        if (a>b){
            c=a;
        }else {
            c=b;
        }
        return c;
    }



}
