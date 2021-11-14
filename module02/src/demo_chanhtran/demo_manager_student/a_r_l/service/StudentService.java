package demo_chanhtran.demo_manager_student.a_r_l.service;

import demo_chanhtran.demo_manager_student.a_r_l.model.Student;

import java.util.LinkedList;
import java.util.Scanner;

public class StudentService implements IService {
    private Scanner scanner = new Scanner(System.in);
    //public static Student[] studentList = new Student[10];

    public static LinkedList<Student> studentList = new LinkedList<>();

    //static {
      //  studentList.add(new Student(1,"chanh1",23,"DN",5,"Toán"));
        //studentList.add(new Student(2,"chanh2",23,"DN",5,"Toán"));
        //studentList.add(new Student(3,"chanh3",23,"DN",5,"Toán"));
        //studentList.add(new Student(4,"chanh4",23,"DN",5,"Toán"));
        //studentList.add(1,new Student(5,"chanh4",23,"DN",5,"Toán"));
//        studentList[0]=new Student(1,"chanh1",23,"DN",5,"Toán");
//        studentList[1]=new Student(2,"chanh2",23,"DN",6,"Văn");
//        studentList[2]=new Student(3,"chanh3",23,"DN",7,"Anh");
    //}

    // them, sưa, xóa, hien thi thông tin student
    @Override
    public void add(){
        /// code thêm mới

        System.out.println("nhập id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập tên");
        String name = scanner.nextLine();
        System.out.println("nhập tuổi");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập địa chỉ");
        String address = scanner.nextLine();
        System.out.println("nhập môn học");
        String subject = scanner.nextLine();
        System.out.println("nhập điểm");
        int point = Integer.parseInt(scanner.nextLine());

        Student student = new Student(id,name,age,address,point,subject);
        studentList.add(student); // ud theo bai arraylist

//        for (int i=0;i<studentList.length;i++){
//            if (studentList[i]==null){
//                studentList[i]=student;
//                break;
//            }
//        }
    }
    @Override
    public void display(){
        System.out.println("hiên thi ra danh sách");
//        for (Student student: studentList) {
//            if (student !=null){
//                System.out.println(student); //student.toString()
//            }else {
//                break;
//            }
//        }
        for (int i=0;i<studentList.size();i++){
            System.out.println(studentList.get(i));
        }
        //code

    }
    @Override
    public void delete(){
        System.out.println("nhập vào id cần xóa");
        int  id = Integer.parseInt(scanner.nextLine());
//        for (int i=0;i<studentList.length;i++){
//            if (id == studentList[i].getId()){
//                for (int j=i;j<studentList.length-1;j++){
//                    studentList[j]=studentList[j+1];
//                }
//                break;
//            }
//
//        }

        // code delete
        display();

    }
    public void edit(){
        // code sửa
    }
}
