package ss3_array_method.library.comp2;

public class HocSinh {
    private String ten;
    private int tuoi;

    public HocSinh(String ten) {
        this.ten = ten;
    }

    public HocSinh(String ten, int tuoi) {
        this.ten = ten;
        this.tuoi = tuoi;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof HocSinh){
            HocSinh hs = (HocSinh) obj;
            return ten.equals(hs.ten);
        }
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "HocSinh{" +
                "ten='" + ten + '\'' +
                ", tuoi=" + tuoi +
                '}';
    }
}
