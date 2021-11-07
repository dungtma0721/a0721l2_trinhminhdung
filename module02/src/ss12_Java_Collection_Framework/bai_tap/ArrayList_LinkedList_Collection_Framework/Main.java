package ss12_Java_Collection_Framework.bai_tap.ArrayList_LinkedList_Collection_Framework;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Scanner scanner = new Scanner(System.in);

        boolean flag =true;
        do {
            System.out.println("Chọn chức năng cần thực hiên" +
                    "\n1.add" +
                    "\n2.edit" +
                    "\n3.delete" +
                    "\n4.display"+
                    "\n5.search"+
                    "\n6.sort"+
                    "\n7.Exit");
            //Scanner scanner = new Scanner(System.in);
            int chooseMenu = scanner.nextInt();
            switch (chooseMenu){
                case 1:
                    System.out.println("Chuc nang them moi");
                    productManager.add();
                    //studentService.
                    //code
                    break;
                case 2:
                    System.out.println("Chuc nang sua");
                    //productManager.edit();
                    //studentService.
                    //code
                    break;
                case 3:
                    System.out.println("Chuc nang xoa");
                    //productManager.delete();
                    //studentService.
                    //code
                    break;

                case 4:
                    //code
                    productManager.display();
                    break;
                case 5:
                    System.out.println("chức năng search");
                    //code
                    productManager.search();
                    break;
                case 6:
                    System.out.println("chức năng sap xep");
                    //productManager.sort();
                    break;
                default:
                    flag=false;
            }
        }while (flag);

    }
}
