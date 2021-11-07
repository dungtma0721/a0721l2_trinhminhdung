package demo_subkey_lt.compare.comp2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<HocSinh> listHS = new ArrayList<>();
        HocSinh hs1 = new HocSinh("Thanh", 23);
        HocSinh hs2 = new HocSinh("Lan", 22);
        HocSinh hs3 = new HocSinh("Huong", 19);
        listHS.add(hs1);
        listHS.add(hs2);
        listHS.add(hs3);
        System.out.println(listHS.size());
        // tao doi tuong de tim kiem
        HocSinh hsTiemkiem = new HocSinh("Lan");
        int position = listHS.indexOf(hsTiemkiem);
        System.out.println(position);
        System.out.println(listHS.toString());
    }
}
