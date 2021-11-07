package demo_x.arl.lv1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentService {
    private List<Student> studentList;

    public StudentService() {
        this.studentList = new ArrayList<>();
    }

//    public StudentService(List<Student> studentList) {
//        this.studentList = studentList;
//    }
    public void add(Student student){
        this.studentList.add(student);
    }
    public List<Student> search(String name){// RETURN !!
        return this.studentList.stream().filter(o -> o.getName().contains(name)).collect(Collectors.toList());
    }

    /**
     * public void timSinhVien(String ten) { /RETURN !!
     *         for (Student sinhVien : studentList) {
     *             if(sinhVien.getHoVaTen().indexOf(ten)>=0) {
     *                 System.out.println(sinhVien);
     *             }
     *         }
     *     }
     */
    public void display(){
        this.studentList.forEach(o -> System.out.println(o.toString()));
    }

}
