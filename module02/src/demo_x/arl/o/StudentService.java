package demo_x.arl.o;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StudentService {
    private List<Student> studentList;

    public StudentService() {
        this.studentList = new ArrayList<>();
    }

//    public StudentService(List<Student> studentList) {
//        this.studentList = studentList;
//    }
    Scanner scanner = new Scanner(System.in);
    public void add(){
        System.out.println("them");
        System.out.println("ten:");
        String name = scanner.nextLine();
        System.out.println("tuoi");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("dia chi");
        String address = scanner.nextLine();

        Student student = new Student(name,age,address);
        studentList.add(student);
    }
    public List<Student> search(String name){
        return this.studentList.stream().filter(o -> o.getName().contains(name)).collect(Collectors.toList());
    }
    public void display(){
        this.studentList.forEach(o -> System.out.println(o.toString()));
    }

}
