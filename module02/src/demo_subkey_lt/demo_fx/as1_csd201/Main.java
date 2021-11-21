package demo_subkey_lt.demo_fx.as1_csd201;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here
        menu();
    }


    /*
    Method menu
     */
    public static void menu() throws IOException {
        double a[] = new double[0];
        Scanner scanner = new Scanner(System.in);
        boolean isEmpty = false;
        //Run
        while (true){
        System.out.println("+-------------------Menu------------------+");
        System.out.println(String.format("%-10s%-32s%s", "|", "1.Input", "|"));
        System.out.println(String.format("%-10s%-32s%s", "|", "2.Output", "|"));
        System.out.println(String.format("%-10s%-32s%s", "|", "3.Bubble sort", "|"));
        System.out.println(String.format("%-10s%-32s%s", "|", "4.Selection sort", "|"));
        System.out.println(String.format("%-10s%-32s%s", "|", "5.Insertion sort", "|"));
        System.out.println(String.format("%-10s%-32s%s", "|", "6.Search > value", "|"));
        System.out.println(String.format("%-10s%-32s%s", "|", "7.Search = value", "|"));
        System.out.println(String.format("%-10s%-32s%s", "|", "0.Exit", "|"));
        System.out.println("+-----------------------------------------+");
        System.out.printf("Choice: ");
        int num = scanner.nextInt();
        switch (num){

            //Exit
            case 0:{
                System.out.println("Thanks!!!");
                System.exit(0);
            }

            //Input
            case 1 :{
                while (true){
                int n;
                while (true) {
                    System.out.println();
                    System.out.printf("Input number of elements: ");
                    n = scanner.nextInt();
                    if(n > 0){
                        break;
                    }
                }
                a = new double[n];
                double b[] = new double[n];
                for(int i = 0; i < a.length; i++){
                    System.out.printf(String.format("Element %d: ", i + 1));
                    b[i] = scanner.nextDouble();
                }
                MainAlgorithm.writeFile(b);
                //Continue
                int cont = 0;
                while (cont != 1 && cont != 2){
                System.out.print("Continue(1.yes 2.no):");
                cont = scanner.nextInt();
                }
                if(cont == 2){
                    break;
                }
                }
            }
            break;

            //Output
            case 2:{
                System.out.println();
                //check array empty
                while (true) {
                    if (a.length == 0) {
                        System.out.println("Array is empty");
                        break;
                    }
                    else {
                        int i = 0;
                        Scanner scan = new Scanner(Paths.get("src/demo_subkey_lt/demo_fx/as1_csd201/INPUT.txt"));
                        while (scan.hasNext()) {
                            double x = scan.nextDouble();
                            a[i] = x;
                            i++;
                        }
                        isEmpty = true;
                        MainAlgorithm.readFile(a, a.length);
                    }
                    //Continue
                    int cont = 0;
                    while (cont != 1 && cont != 2){
                        System.out.print("Continue(1.yes 2.no):");
                        cont = scanner.nextInt();
                    }
                    if(cont == 2){
                        break;
                    }
                }
            }
            break;

            //Bubble sort
            case 3:{
                System.out.println();
                //check array empty
                while (true) {
                    if (isEmpty == false) {
                        System.out.println("Array is empty");
                        break;
                    }
                    else {
                        //run Bubble sort
                        double b[] = new double[a.length];
                        int j = 0;
                        for(double x : a){
                            b[j] = x;
                            j++;
                        }
                        MainAlgorithm.BubbleSort(b);
                    }
                    //Continue
                    int cont = 0;
                    while (cont != 1 && cont != 2) {
                        System.out.print("Continue(1.yes 2.no):");
                        cont = scanner.nextInt();
                    }
                    if (cont == 2) {
                        break;
                    }
                }
            }
            break;

            //Selection sort
            case 4:{
                System.out.println();
                //check array empty
                while (true) {
                    if (isEmpty == false) {
                        System.out.println("Array is empty");
                        break;
                    }
                    else {
                        //run Selection sort
                        double b[] = new double[a.length];
                        int j = 0;
                        for(double x : a){
                            b[j] = x;
                            j++;
                        }
                        MainAlgorithm.SelectionSort(b);
                    }
                    //Continue
                    int cont = 0;
                    while (cont != 1 && cont != 2) {
                        System.out.print("Continue(1.yes 2.no):");
                        cont = scanner.nextInt();
                    }
                    if (cont == 2) {
                        break;
                    }
                }
            }
            break;

            //Insertion sort
            case 5:{
                System.out.println();
                //check array empty
                while (true) {
                    if (isEmpty == false) {
                        System.out.println("Array is empty");
                        break;
                    }
                    else {
                        //run Insertion sort
                        double b[] = new double[a.length];
                        int j = 0;
                        for(double x : a){
                            b[j] = x;
                            j++;
                        }
                        MainAlgorithm.InsertionSort(b);
                    }
                    //Continue
                    int cont = 0;
                    while (cont != 1 && cont != 2) {
                        System.out.print("Continue(1.yes 2.no):");
                        cont = scanner.nextInt();
                    }
                    if (cont == 2) {
                        break;
                    }
                }
            }
            break;

            //Search > value
            case 6:{
                System.out.println();
                //check array empty
                while (true) {
                    if (isEmpty == false) {
                        System.out.println("Array is empty");
                        break;
                    }
                    else {
                        //run Search > value
                        System.out.print("Input value: ");
                        int value = scanner.nextInt();
                        double b[] = new double[a.length];
                        int j = 0;
                        for(double x : a){
                            b[j] = x;
                            j++;
                        }
                        MainAlgorithm.Search(b, value);
                    }
                    //Continue
                    int cont = 0;
                    while (cont != 1 && cont != 2) {
                        System.out.print("Continue(1.yes 2.no):");
                        cont = scanner.nextInt();
                    }
                    if (cont == 2) {
                        break;
                    }
                }
            }
            break;

            //Search = value
            case 7:{
                System.out.println();
                //check array empty
                while (true){
                if(isEmpty == false){
                    System.out.println("Array is empty");
                    break;
                }
                else{
                    //run Search = value
                    double b[] = new double[a.length];
                    int j = 0;
                    for(double x : a){
                        b[j] = x;
                        j++;
                    }
                    System.out.print("Input value: ");
                    int value = scanner.nextInt();
                    System.out.print("Index of fist element: " +
                            MainAlgorithm.binarySearch(b, 0, a.length - 1, value));
                    System.out.println();
                }
                //Continue
                int cont = 0;
                while (cont != 1 && cont != 2){
                    System.out.print("Continue(1.yes 2.no):");
                    cont = scanner.nextInt();
                }
                if(cont == 2){
                    break;
                }
                }
            }
            break;

            default:{
                System.out.println();
                System.out.print("Your choose not exist");
                break;
            }
        }
        }
    }
}
