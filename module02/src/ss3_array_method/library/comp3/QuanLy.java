package ss3_array_method.library.comp3;

import java.util.ArrayList;

public class QuanLy {
//    private ArrayList<HocSinh> listHs;
//
//    public QuanLy() {
//        this.listHs = new ArrayList<>();
//    }
    ArrayList<HocSinh> listHs =new ArrayList<>();

    public void themHS(String ten, int tuoi){
        listHs.add(new HocSinh(ten,tuoi));
    }
    public void inTenHS(){
        for (int i = 0; i < listHs.size(); i++) {
            HocSinh hs = listHs.get(i);
            System.out.println("Ten hoc sinh thu " + i + ":"+ hs.getTen());
            //System.out.println(hs);
        }
    }

}
