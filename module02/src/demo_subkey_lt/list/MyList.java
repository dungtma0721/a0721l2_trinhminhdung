package demo_subkey_lt.list;

import java.util.ArrayList;
import java.util.List;

public class MyList {
    public static void main(String[] args) {
        List<String> myList1 = new ArrayList<>();

        //add
        myList1.add("a");
        myList1.add("b");
        myList1.add("c");
        //size
        System.out.println(myList1.size());
        //addAll
        List<String> myList2 = new ArrayList<>();
        myList2.add("e");
        myList2.add("f");
        myList1.addAll(myList2);
        //get
        System.out.println(myList1.get(0));
        //set gia tri moi thay the cu
        myList1.set(0, "newelement");
        //indexOf
        System.out.println(myList1.indexOf("b"));
        //lastIndexOf
        myList1.add("b");
        System.out.println(myList1.lastIndexOf("b"));
        //clear
        //myList1.clear();
        //contain
        System.out.println(myList1.contains("z"));
        //sublist
        List<String> newList = myList1.subList(1,4);
        //toArray
        //asList

        for (String element: myList1) {
            System.out.print(element + "\t");
        }
        System.out.println();
        for (String element: newList) {
            System.out.print(element + "\t");
        }

    }


}
