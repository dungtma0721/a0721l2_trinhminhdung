package demo_manager_student.controler;

import demo_manager_student.model.Student;

import java.util.HashSet;

public class DemoHashSet {
    public static void main(String[] args) {
        HashSet<Student> studentHashSet = new HashSet<>();
        studentHashSet.add(new Student(1,"chanh7",253,"DN",5,"Toán"));
        studentHashSet.add(new Student(2,"chanh2",253,"DN",5,"Toán"));
        studentHashSet.add(new Student(1,"chanh1",523,"DN",5,"Toán"));
        studentHashSet.add(new Student(4,"chanh4",23,"DN",5,"Toán"));
        studentHashSet.add(new Student(1,"chanh1",255,"DN",5,"Toán"));

        for (Student student: studentHashSet) {
            System.out.println(student +"- "+student.hashCode());
        }
    }
}
