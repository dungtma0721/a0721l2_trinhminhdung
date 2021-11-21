package demo_subkey_lt.demo_fx.as4;

public class Employee extends Staff implements ICalculator {

    //Khai báo các thuộc tính
    private int gioLamThem;

    //Các constructor
    public Employee() {
        super();
        this.gioLamThem = 0;
    }

    public Employee(String maNv, String ten, String ngayVaoLam, String boPhan,
                    int tuoi, int ngayPhep, double heSoLuong, int gioLamThem) {
        super(maNv, ten, ngayVaoLam, boPhan, tuoi, ngayPhep, heSoLuong);
        this.gioLamThem = gioLamThem;
    }

    //Phương thức tính lương
    @Override
    public double calculateSalary() {
        return this.getHeSoLuong() * 3000000 + this.gioLamThem * 200000;
    }

    //Phương thức xuất thông tin
    @Override
    public String toString() {
        return String.format("%-10s%-15s%-15s%-15.1f%-10d%-10d%-20s",
                this.getMaNv(), this.getTen(),
                this.getBoPhan(), this.getHeSoLuong(),
                this.getTuoi(), this.getNgayPhep(),
                this.getNgayVaoLam());
    }


    //Các phương thức get set
    public int getGioLamThem() {
        return gioLamThem;
    }

    public void setGioLamThem(int gioLamThem) {
        this.gioLamThem = gioLamThem;
    }


}
