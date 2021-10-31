package demo_subkey_lt.demo_fx.library.comp;

public class HocSinh implements Comparable<HocSinh>{
    private String ten;
    private int tuoi;

    public HocSinh() {
    }

    public HocSinh(String ten, int tuoi) {
        this.ten = ten;
        this.tuoi = tuoi;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    @Override
    public String toString() {
        return ten +":"+ tuoi;
    }

    @Override
    public int compareTo(HocSinh hocSinh) {
        return tuoi - hocSinh.tuoi;
        //return this.getName().compareTo(student.getName());
        //return this.tuoi.compareTo(hocSinh.tuoi);
    }




}
