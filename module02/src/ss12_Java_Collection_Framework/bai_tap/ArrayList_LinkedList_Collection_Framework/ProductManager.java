package ss12_Java_Collection_Framework.bai_tap.ArrayList_LinkedList_Collection_Framework;


import java.util.ArrayList;
import java.util.Scanner;

public class ProductManager {
    private ArrayList<Product> arrayList;

    public ProductManager() { //constructor ko tham so
        this.arrayList = new ArrayList<>();
    }
    public ProductManager(ArrayList<Product> arrayList) {//constructor tham so
        this.arrayList = arrayList;
    }

    Scanner scanner = new Scanner(System.in);
    public void add(){
        System.out.println("Nhap id : ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap name : ");
        String name = scanner.nextLine();
        System.out.println("Nhap price : ");
        double price = Double.parseDouble(scanner.nextLine());

        Product product = new Product(id, name, price);
        arrayList.add(product);
    }
    public void display(){
        for (Product product:
             arrayList) {
            System.out.println(product);
        }
    }
//    public boolean delete(){
//        System.out.println("Xoa ten san pam");
//        String name = scanner.nextLine();
//        Product product = new Product(name);
//        System.out.println(arrayList.remove(product));
//    }


}
