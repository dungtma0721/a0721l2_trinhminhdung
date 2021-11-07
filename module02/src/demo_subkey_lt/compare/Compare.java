package demo_subkey_lt.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Compare implements Comparable<Compare>{
     public int id;
     public String name;
     public int age;

    public Compare(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Compare{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        ArrayList<Compare> arrayList = new ArrayList();
        arrayList.add(new Compare(1, "ngocanh", 25));
        arrayList.add(new Compare(2, "khanh", 23));
        arrayList.add(new Compare(3, "kim", 21));
        Comparator<Compare> compareComparator = new Comparator<Compare>() {


            @Override
            public int compare(Compare o1, Compare o2) {
                if (o1.age> o2.age) return 1;
                if (o1.age< o2.age) return -1;
                return 0;
            }
        };
//        arrayList.sort(compareComparator);
//        System.out.println(arrayList);
        Collections.sort(arrayList);
        System.out.println(arrayList);
    }

    @Override
    public int compareTo(Compare o) {
        if (this.age>o.age) return 1;
        if (this.age<o.age) return -1;
        return 0;
    }
}
