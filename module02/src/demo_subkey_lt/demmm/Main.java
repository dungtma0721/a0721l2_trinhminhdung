package demo_subkey_lt.demmm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Manageproduct1 manageproduct1 =new Manageproduct1();
        boolean flag = true;
        do {
            System.out.println("Menu:");
            System.out.println("1: add");
            System.out.println("2: display");
            System.out.println("3: edit");
            int choose = 0;
            System.out.println("Chon");
            choose = scanner.nextInt();
            switch (choose){
                case 1:
                    System.out.println("add");
                    manageproduct1.add();
                    break;
                case 2:
                    System.out.println("them");
                    manageproduct1.display();
                    break;
                case 3:
                    System.out.println("xoa");
                    break;
            }
        }
        while (flag);
    }
}
