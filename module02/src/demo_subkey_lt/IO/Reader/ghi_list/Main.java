package demo_subkey_lt.IO.Reader.ghi_list;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(1,"a","111");
        Student student2 = new Student(2,"b","112");
        List <Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        try {
            FileWriter fileWriter =new FileWriter("data_Ob", true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Student student : studentList ) {
                bufferedWriter.write(student.toString());
                bufferedWriter.newLine();
            }

            bufferedWriter.close();
            fileWriter.close();
        }
        catch (Exception e){
            System.out.println("ER");
        }
    }
}
