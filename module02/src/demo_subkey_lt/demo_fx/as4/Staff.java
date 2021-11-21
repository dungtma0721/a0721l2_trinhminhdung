package demo_subkey_lt.demo_fx.as4;

public abstract class Staff {

    //Khai báo các thuộc tính
    private String maNv, ten, ngayVaoLam, boPhan;
    private int tuoi, ngayPhep;
    private double heSoLuong;

    //Các constructor
    public Staff(){
        this.maNv = "";
        this.ten = "";
        this.ngayVaoLam = "";
        this.boPhan = "";
        this.tuoi = 0;
        this.ngayPhep = 0;
        this.heSoLuong = 0;
    }

    public Staff(String ten, double heSoLuong) {
        this.ten = ten;
        this.heSoLuong = heSoLuong;
    }

    public Staff(String maNv, String ten, String boPhan, double heSoLuong) {
        this.maNv = maNv;
        this.ten = ten;
        this.boPhan = boPhan;
        this.heSoLuong = heSoLuong;
    }

    public Staff(String maNv, String ten, String ngayVaoLam, String boPhan,
                 int tuoi, int ngayPhep, double heSoLuong) {
        this.maNv = maNv;
        this.ten = ten;
        this.ngayVaoLam = ngayVaoLam;
        this.boPhan = boPhan;
        this.tuoi = tuoi;
        this.ngayPhep = ngayPhep;
        this.heSoLuong = heSoLuong;
    }


    //Phương thức xuất thông tin
    public abstract String toString();


    //Các phương thức get set
    public String getMaNv() {
        return maNv;
    }

    public void setMaNv(String maNv) {
        this.maNv = maNv;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNgayVaoLam() {
        return ngayVaoLam;
    }

    public void setNgayVaoLam(String ngayVaoLam) {
        this.ngayVaoLam = ngayVaoLam;
    }

    public String getBoPhan() {
        return boPhan;
    }

    public void setBoPhan(String boPhan) {
        this.boPhan = boPhan;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public int getNgayPhep() {
        return ngayPhep;
    }

    public void setNgayPhep(int ngayPhep) {
        this.ngayPhep = ngayPhep;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public double calculateSalary() {
        return 0;
    }
}
