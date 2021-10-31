package demo_subkey_lt.demo_fx.library.comp;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        HocSinh[] arrHS =new HocSinh[3];
        arrHS[0] = new HocSinh("Thanh", 23);
        arrHS[1] = new HocSinh("Lan", 18);
        arrHS[2] = new HocSinh("Huong", 20);
        Arrays.sort(arrHS);
        System.out.println(Arrays.toString(arrHS));
    }
}
