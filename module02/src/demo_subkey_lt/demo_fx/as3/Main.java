package demo_subkey_lt.demo_fx.as3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Book> listBook = new ArrayList<>();
    static boolean check = true;

    public static void main(String[] args) {
	// write your code here

        Scanner scanner = new Scanner(System.in);

        //Thêm thông tin vào danh sách
        listBook.add(new Book("hw1", "hello", "author1", "false"));
        listBook.add(new Book("hw2", "python", "author2", "false"));
        listBook.add(new Book("hw3", "funix", "author3", "false"));
        listBook.add(new Book("hw4", "java", "author4", "false"));

        System.out.println("Welcome to the online book library");

        //Vòng lặp thực hiện chương trình
        while (check){
        menu();
        System.out.printf("Your choice:");
        int choose = scanner.nextInt();
        String s = scanner.nextLine();
        switch (choose){
            case 1: addNewBook();
            break;
            case 2:
                System.out.printf("Enter book title to search:");
                String str = scanner.nextLine();
                search(str);
            break;
            case 3: display();
            break;
            case 4:
                System.out.printf("Enter book id to borrow:");
                String str1 = scanner.nextLine();
                borrowed(str1);
            break;
            case 5: exit();
            break;
            default: System.out.println("Your choose not found");
        }
        }
    }



    //Phương thức hiển thị menu chọn
    public static void menu(){
        System.out.println("-----------------------------");
        System.out.println("1. Enter a new book");
        System.out.println("2. Search a book by book title");
        System.out.println("3. Display books");
        System.out.println("4. Borrow a book by book id");
        System.out.println("5. Exit");
    }



    //Phương thức thêm thông tin một cuốn sách mới
    public static void addNewBook(){
        String borrow = "false";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter information for the new book:");
        System.out.printf("Id:"); //Nhập thông tin id
        String id = scanner.nextLine();
        System.out.printf("Title:"); //Nhập thông tin tiêu đề sách
        String title = scanner.nextLine();
        System.out.printf("Author:"); //Nhập thông tin tác giả
        String author = scanner.nextLine();
        System.out.printf("Is borrowed (1 = yes,2 = no):"); //Chọn trạng thái sách
        int choose = scanner.nextInt();
        if(choose == 1)
            borrow = "true";
        listBook.add(new Book(id, title, author, borrow));
        System.out.println("A new book has been added");
    }


    //Phương thức tìm kiếm sách
    public static void search(String str){
        System.out.println("Id        Title           Author        Is borrowed");
        for (int i = 0;i < listBook.size(); i++){
            if(listBook.get(i).getTitle().compareToIgnoreCase(str) == 0){
                System.out.println(String.format("%s       %s         %s         %s",
                        listBook.get(i).getId(),
                        listBook.get(i).getAuthor(),
                        listBook.get(i).getTitle(),
                        listBook.get(i).isBorrow()));
            }
        }
    }



    //Phương thức hiển thị danh sách thông tin sách
    public static void display(){
        System.out.println("Id        Title           Author        Is borrowed");
        for (int i = 0;i < listBook.size(); i++){
            System.out.println(String.format("%s       %s         %s         %s",
                    listBook.get(i).getId(),
                    listBook.get(i).getTitle(),
                    listBook.get(i).getAuthor(),
                    listBook.get(i).isBorrow()));
        }
    }



    //Phương thức cấp cho mượn sách theo id
    public static void borrowed(String str){
        boolean isExist = false;
        for (int i = 0;i < listBook.size(); i++){
           if(listBook.get(i).getId().equalsIgnoreCase(str)){
               if(listBook.get(i).isBorrow().equals("true")){
                   System.out.println("This has borrowed");}
               else{
                   System.out.println("Book has been borrowed");
                   listBook.get(i).setBorrow("true");}
               isExist = true;
               break;
           }
        }

        if(isExist == false){
            System.out.println("Id not exist in library");
        }
    }



    //Thoát chương trình
    public static void exit(){
        check = false;
    }
}
