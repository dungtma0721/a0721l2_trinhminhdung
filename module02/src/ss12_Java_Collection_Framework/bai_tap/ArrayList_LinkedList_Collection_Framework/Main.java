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
                    "\n2.display" +
                    "\n3.edit" +
                    "\n4.delete"+
                    "\n5.Exit");
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
                    //code
                    productManager.display();
                    break;
                case 3:
                    System.out.println("chức năng update");
                    //code
                    break;
                case 4:
                    System.out.println("chức năng delete");
                    //productManager.delete();
                    break;
                default:
                    flag=false;
            }
        }while (flag);

    }
}
