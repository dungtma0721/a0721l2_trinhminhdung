package demo_subkey_lt.demo_fx.as1_csd201;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.nio.file.Paths;
import java.util.Scanner;

public class MainAlgorithm {


    /*
    Method write data form array to file
     */
    public static void writeFile(double a[]) throws FileNotFoundException {
        PrintWriter printWriter = new PrintWriter("src/demo_subkey_lt/demo_fx/as1_csd201/INPUT.txt");
        for(double x : a){
            printWriter.print(x + " ");
        }
        printWriter.close();
        System.out.println("Write file Success");
    }




    /*
    Method read data from file to array
     */
    public static void readFile(double a[], int size) throws IOException {
        System.out.print("Array a:");
        for(double x : a){
            System.out.print(x + " ");
        }
        System.out.println();
    }




    /*
    Method sort by Bubble Sort
     */
    public static void BubbleSort(double a[]) throws FileNotFoundException {
        System.out.println("Bubble sort");
        for(int i = 0; i < a.length - 1; i++){
            for(int j = a.length - 1; j > i; j--){
                if(a[j] < a[j - 1]){
                    double temp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;
                }
            }
            //print array in line
            for(double x : a){
                System.out.printf(String.format("%.1f ", x));
            }
            System.out.println();
        }
        //write in file OUTPUT1.TXT
        PrintWriter printWriter = new PrintWriter("src/demo_subkey_lt/demo_fx/as1_csd201/OUTPUT1.txt");
        for(double x : a){
            printWriter.printf(x + " ");
        }
        printWriter.close();
        System.out.println("Write file Success");
    }




    /*
    Sort bay Selection Sort
     */
    public static void SelectionSort(double a[]) throws FileNotFoundException {
        System.out.println("Selection Sort");
        for(int i = 0; i < a.length; i++){
            int k = i;
            for(int j = i; j < a.length; j++){
                if(a[k] > a[j]){
                    k = j;
                }
            }
            double temp = a[i];
            a[i] = a[k];
            a[k] = temp;
            //print array in line
            for(double x : a){
                System.out.printf(String.format("%.1f ", x));
            }
            System.out.println();
        }
        //write in file OUTPUT2.TXT
        PrintWriter printWriter = new PrintWriter("src/demo_subkey_lt/demo_fx/as1_csd201/OUTPUT2.txt");
        for(double x : a){
            printWriter.printf(x + " ");
        }
        printWriter.close();
        System.out.println("Write file Success");
    }




    /*
    Sort by Insertion Sort
     */
    public static void InsertionSort(double a[]) throws FileNotFoundException {
        System.out.println("Insertion Sort");
        for(int i = 1; i < a.length; i++){
            int j = i - 1;
            double key = a[i];
            while (j >= 0 && a[j] > key){
                a[j + 1] = a[j];
                j -= 1;
            }
            a[j + 1] = key;
            //print array in line
            for(double x : a){
                System.out.printf(String.format("%.1f ", x));
            }
            System.out.println();
        }
        //write in file OUTPUT3.TXT
        PrintWriter printWriter = new PrintWriter("src/demo_subkey_lt/demo_fx/as1_csd201/OUTPUT3.txt");
        for(double x : a){
            printWriter.printf(x + " ");
        }
        printWriter.close();
        System.out.println("Write file Success");
    }



    /*
    Search by Linear Search algorithm
     */
    public static void Search(double a[], double value) throws FileNotFoundException {
        PrintWriter printWriter = new PrintWriter("src/demo_subkey_lt/demo_fx/as1_csd201/OUTPUT4.txt");
        System.out.printf("Index of element:");
        for(int i = 0; i < a.length; i++){
            if(a[i] > value){
                printWriter.printf(i + " ");
                System.out.printf(i + " ");
            }
        }
        printWriter.close();
        System.out.println();
        System.out.println("Write file Success");
    }




    /*
    Search by binary Search algorithm
     */
    public static int binarySearch(double a[], int l, int  r, double x){
        //sort array
        for(int i = 0; i < a.length - 1; i++){
            for(int j = a.length - 1; j > i; j--){
                if(a[j] < a[j - 1]){
                    double temp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;
                }
            }
        }
        //fix
        //search array
        int num = -1;
        while (l <= r){
            int mid = (r + l) / 2;
            if(a[mid] == x){
                num = mid;
                break;
            }
            if(x < a[mid]){
                r = mid - 1;
            }
            if(x > a[mid]){
                l = mid + 1;
            }
        }
        return num;
    }
}
