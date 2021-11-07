package demo_subkey_lt.arrays;
//https://www.geeksforgeeks.org/arrays-tostring-in-java-with-examples/
import java.util.Arrays;

public class ToString {
    public static void main(String[] args) {
        int[] arrSoNguyen = new int[10];
        String content = Arrays.toString(arrSoNguyen);
        System.out.println(content);
        System.out.println(Arrays.toString(arrSoNguyen));

        // Let us create different types of arrays and
        // print their contents using Arrays.toString()
        boolean[] boolArr = new boolean[]{true, true, false, true};
        byte[] byteArr = new byte[]{10, 20, 30};
        char[] charArr = new char[]{'g', 'e', 'e', 'k', 's'};
        double[] dblArr = new double[]{1, 2, 3, 4};
        float[] floatArr = new float[]{1, 2, 3, 4};
        int[] intArr = new int[]{1, 2, 3, 4};
        long[] lomgArr = new long[]{1, 2, 3, 4};
        Object[] objArr = new Object[]{1, 2, 3, 4};
        short[] shortArr = new short[]{1, 2, 4, 3};

        Arrays.sort(shortArr);
//        System.out.println(Arrays.toString(boolArr));
//        System.out.println(Arrays.toString(byteArr));
//        System.out.println(Arrays.toString(charArr));
//        System.out.println(Arrays.toString(dblArr));
//        System.out.println(Arrays.toString(floatArr));
//        System.out.println(Arrays.toString(intArr));
//        System.out.println(Arrays.toString(lomgArr));
//        System.out.println(Arrays.toString(objArr));
        System.out.println(Arrays.toString(shortArr));

    }
}
