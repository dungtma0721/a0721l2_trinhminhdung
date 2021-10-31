package demo_subkey_lt.demmm;

import java.util.ArrayList;
import java.util.Scanner;

public class Manageproduct1 {
    ArrayList<Product> arrayList;

    public Manageproduct1() {
        this.arrayList = new ArrayList<>();
    }

    public Manageproduct1(ArrayList<Product> arrayList) {
        this.arrayList = arrayList;
    }
    /////////////////////////////
    Scanner scanner = new Scanner(System.in);
    public void add(){
        System.out.println("Them san pam");
        System.out.println("Nhap id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("ten");
        String name = scanner.nextLine();
        System.out.println("gia");
        int price = scanner.nextInt();

        Product product = new Product(id, name, price);
        arrayList.add(product);
    }
    public void display(){
        for (Product product: arrayList) {
            System.out.println(product);
        }
    }
    public void delete(){
        System.out.println("Xoa san pam theo id:");
        int id = Integer.parseInt(scanner.nextLine());
        Product product = new Product(id);
        arrayList.remove(product);


    }


}
