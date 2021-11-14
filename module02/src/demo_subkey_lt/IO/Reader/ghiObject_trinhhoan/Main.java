package demo_subkey_lt.IO.Reader.ghiObject_trinhhoan;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(1,"a","111");
        Student student2 = new Student(2,"b","112");
        try {
            FileWriter fileWriter =new FileWriter("data_Ob");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(student1.toString());
            bufferedWriter.newLine();
            bufferedWriter.write(student2.toString());
            bufferedWriter.close();
            fileWriter.close();
        }
        catch (Exception e){
            System.out.println("ER");
        }
    }
}
