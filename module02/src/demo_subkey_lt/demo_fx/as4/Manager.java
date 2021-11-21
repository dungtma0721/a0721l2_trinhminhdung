package demo_subkey_lt.demo_fx.as4;

public class Manager extends Staff implements ICalculator {

    //Khai báo các thuộc tính
    private String chucDanh;

    //Các constructor
    public Manager() {
        super();
        this.chucDanh = "";
    }

    public Manager(String maNv, String ten, String ngayVaoLam, String boPhan, int tuoi,
                   int ngayPhep, double heSoLuong, String chucDanh) {
        super(maNv, ten, ngayVaoLam, boPhan, tuoi, ngayPhep, heSoLuong);
        this.chucDanh = chucDanh;
    }


    //Phương thức tính lương
    @Override
    public double calculateSalary() {
        double luong = this.getHeSoLuong() * 5000000;
        if(this.chucDanh.equalsIgnoreCase("Business Leader"))
            luong += 8000000;
        else if(this.chucDanh.equalsIgnoreCase("Project Leader"))
            luong += 5000000;
        else if(this.chucDanh.equalsIgnoreCase("Technical Leader"))
            luong += 6000000;
        return luong;
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
    public String getChucDanh() {
        return chucDanh;
    }

    public void setChucDanh(String chucDanh) {
        this.chucDanh = chucDanh;
    }

}
