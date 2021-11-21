package demo_subkey_lt.demo_fx.as4;

public class Department extends Staff{

    //Khai báo các thuộc tính
    String maBoPhan, tenBoPhan;
    int soLuongNhanVien;


    //Các constructor
    public Department() {
        this.maBoPhan = "";
        this.tenBoPhan = "";
        this.soLuongNhanVien = 0;
    }

    public Department(String maBoPhan, String tenBoPhan, int soLuongNhanVien) {
        this.maBoPhan = maBoPhan;
        this.tenBoPhan = tenBoPhan;
        this.soLuongNhanVien = soLuongNhanVien;
    }


    //Phương thức xuất bộ phận
    @Override
    public String toString() {
        return String.format("%-20s%-20s%-20d", this.maBoPhan, this.tenBoPhan, this.soLuongNhanVien);
    }


    //Phương thức get set
    public String getMaBoPhan() {
        return maBoPhan;
    }

    public void setMaBoPhan(String maBoPhan) {
        this.maBoPhan = maBoPhan;
    }

    public String getTenBoPhan() {
        return tenBoPhan;
    }

    public void setTenBoPhan(String tenBoPhan) {
        this.tenBoPhan = tenBoPhan;
    }

    public int getSoLuongNhanVien() {
        return soLuongNhanVien;
    }

    public void setSoLuongNhanVien() {
        this.soLuongNhanVien += 1;
    }
}
