package demo_x.arl.o;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        StudentService studentService = new StudentService();
        while (true){
            System.out.println("Menu");
            System.out.println("1: them");
            System.out.println("2: tim");
            System.out.println("3: in");
            System.out.println("4: thoat");
            String chose = scanner.nextLine();
            switch (chose){
                case "1": {
                    studentService.add();
                    break;
                }
                case "2":{
                    System.out.println("tim ten");
                    String name = scanner.nextLine();
                    studentService.search(name).forEach(Student ->{
                        System.out.println(Student.toString());
                    });
                    break;

                }
                case "3":{
                    System.out.println("in");
                    studentService.display();
                    break;

                }
                case "4":{
                    System.out.println("thoat");
                    break;


                }
            }
        }
    }
}
