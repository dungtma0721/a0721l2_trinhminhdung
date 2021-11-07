package ss12_Java_Collection_Framework.bai_tap.ArrayList_LinkedList_Collection_Framework;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    private List<Product> productList;

    public ProductManager() { //constructor ko tham so
        this.productList = new ArrayList<>();
    }
    public ProductManager(ArrayList<Product> arrayList) {//constructor tham so
        this.productList = arrayList;
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
        productList.add(product);
    }







    public void display(){
        for (Product product:
                productList) {
            System.out.println(product);
        }
    }
    public void search(){
        System.out.println("Nhap ten can tim");
        String nameS = scanner.nextLine();
        for (Product product: productList) {
            if (product.getName().indexOf(nameS)>=0){
                System.out.println(product);
            }
        }
    }


//    public boolean delete(){
//        System.out.println("Xoa ten san pam");
//        String name = scanner.nextLine();
//        Product product = new Product(name);
//        System.out.println(arrayList.remove(product));
//    }


}
