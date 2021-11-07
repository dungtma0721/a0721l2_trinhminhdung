package demo_x.arl.lv2_titv;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentService {
    private List<Student> studentList;

    public StudentService() {

        this.studentList = new ArrayList<Student>();
    }

    public StudentService(ArrayList<Student> danhSach)
    {
        this.studentList = danhSach;
    }

    // 1.	Thêm sinh viên vào danh sách.
    public void themSinhVien(Student sv) {
        this.studentList.add(sv);
    }

    //		2.	In danh sách sinh viên ra màn hình.
    public void inDanhSachSinhVien() {
        for (Student sinhVien : studentList) {
            System.out.println(sinhVien);
        }
    }

    //		3.	Kiểm tra danh sách có rỗng hay không.
    public boolean kiemTraDanhSachRong() {
        return this.studentList.isEmpty();
    }

    //		4.	Lấy ra số lượng sinh viên trong danh sách.
    public int laySoLuongSinhVien() {
        return this.studentList.size();
    }

    //		5.	Làm rỗng danh sách sinh viên.
    public void lamRongDanhSach() {
        this.studentList.removeAll(studentList);
    }

    //		6.	Kiểm tra sinh viên có tồn tại trong danh sách hay không, dựa trên mã sinh viên.
    public boolean kiemTraTonTai(Student sv) {
        return this.studentList.contains(sv);
    }

    //		7.	Xóa một sinh viên ra khỏi danh sách dựa trên mã sinh viên.
    public boolean xoaSinhVien(Student sv) {
        return this.studentList.remove(sv);
    }

    //		8.	Tìm kiếm tất cả sinh viên dựa trên Tên được nhập từ bàn phím.
    public void timSinhVien(String ten) {
        for (Student sinhVien : studentList) {
            if(sinhVien.getHoVaTen().indexOf(ten)>=0) {
                System.out.println(sinhVien);
            }
        }
    }
    //		9.	Xuất ra danh sách sinh viên có điểm từ cao đến thấp.
    public void sapXepSinhVienGiamDanTheoDiem() {
        Collections.sort(this.studentList, new Comparator<Student>() {
            @Override
            public int compare(Student sv1, Student sv2) {
                if(sv1.getDiemTrungBinh()<sv2.getDiemTrungBinh()) {
                    return 1;
                }else if(sv1.getDiemTrungBinh()>sv2.getDiemTrungBinh()) {
                    return -1;
                }else {
                    return 0;
                }
            }
        });
    }
}
