package demo_subkey_lt.IO.Reader.ghi_doc_trinhhoan;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public void writeToFile(List<Student> studentList){
        try {
            FileWriter fileWriter =new FileWriter("src/demo_subkey_lt/IO/ghi_doc_trinhhoan/data_Ob_ghi_doc.txt",true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            for (Student student: studentList){
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
    public List<Student> readFromFile(){
        List<Student> studentList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader("src/demo_subkey_lt/IO/ghi_doc_trinhhoan/data_Ob_ghi_doc.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while (true){
                line = bufferedReader.readLine();
                if (line==null){
                    break;
                }
                String[] txt = line.split(",");
                int id = Integer.parseInt(txt[0]);
                String name = txt[1];
                String address = txt[2];
                Student student = new Student(id, name, address);
                studentList.add(student);
            }
        }
        catch (Exception e){
            System.out.println("ERRR");
        }
        return studentList;
    }
    public static void main(String[] args) {
//        Student student1 = new Student(1,"a","111");
//        Student student2 = new Student(2,"b","112");
//        List<Student> studentList = new ArrayList<>();
//        studentList.add(student1);
//        studentList.add(student2);
        Main main = new Main();
        //main.writeToFile(studentList);
        List<Student> list = main.readFromFile();
        for (Student student: list){
            System.out.println(student);
        }
    }
}
