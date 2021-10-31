package demo_subkey_lt.lecture_ss4;

public class Test {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Chanh1", "DN", "BK");
        //student.school="CodeGym";
        Student student2 = new Student(2, "Chanh2", "DN", "Supham");
        //student.school="CodeGym";
        Student[] studentList= new Student[2];
        studentList[0]=student1;
        studentList[1]=student2;
//        for (int i = 0; i < studentList.length; i++) {
//            studentList[i].school="CodeGym";
//        }
        // truy cap vao thuoc tinh thong qua class hoac doituong
        Student.school="CodeGym";
       // student1.school= "CodeGym";
        //truy cap vao pt static thong qua class hoac doituong
        Student.registerSubject();

        for (Student s : studentList) {
            System.out.println(s.name+" "+ s.school);
        }
        //tao cac class tien ich
        //Arrays.toString();
        //Math.random();


    }
}
