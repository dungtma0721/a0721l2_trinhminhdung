package ss10_DSA_arraylist_linkedlist.thuc_hanh.linkedlist_dongian;

public class TestMyLinkedList {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        System.out.println("LinkedList integer da nhap la: ");
        MyLinkedList<Integer> linkedList = new MyLinkedList<>();
        linkedList.addFirst(11);
        linkedList.addFirst(12);
        linkedList.addFirst(13);

        linkedList.add(4,9);
        linkedList.add(4,9);
        linkedList.printList();
    }
    }

