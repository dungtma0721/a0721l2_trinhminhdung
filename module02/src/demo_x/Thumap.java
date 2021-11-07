package demo_x;

import java.util.HashMap;
import java.util.Map;

public class Thumap {
    public static void main(String[] args) {
        Map<Integer, String> a = new HashMap<>();
        Map<String, Integer> b = new HashMap<>();
        a.put(1,"long");
        a.put(1,"thanh");
        a.put(2,"nhat");
        b.put("quang", 3);
        b.put("minh", 4);
        b.put("minh", 5);
        System.out.println(a.get(1));
        System.out.println(b.get("minh"));

    }
}
