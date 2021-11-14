package demo_chanhtran.demo_manager_student.IO_1.service;

import demo_chanhtran.demo_manager_student.IO_1.model.Teacher;

import java.util.Scanner;

public class TeacherService implements IService{
    private Scanner scanner = new Scanner(System.in);
    public static Teacher[] studentList = new Teacher[100];
    static {

    }

    @Override
    public void add() {

    }

    @Override
    public void display() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void edit() {

    }

    // them, sưa, xóa, hien thi thông tin student
    public void chamDiem(){
        System.out.println("chấm điẻm");
    }

}
