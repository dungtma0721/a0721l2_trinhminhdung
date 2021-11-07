package ss10_DSA_arraylist_linkedlist.thuc_hanh.list_dongian;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<Integer>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(4);
        listInteger.add(5);
        listInteger.add(6);
        listInteger.add(7);
        listInteger.add(8);
        listInteger.add(9);
        listInteger.add(10);
        listInteger.add(11);// pan tu > 10, nen tang kt 2.

        System.out.println("element 4: "+listInteger.get(4));//4
        System.out.println("element 1: "+listInteger.get(1));//2
        System.out.println("element 2: "+listInteger.get(2));//3
        System.out.println("element 2: "+listInteger.get(12));// chay Exception
        System.out.println(listInteger.toString());

    }
}
