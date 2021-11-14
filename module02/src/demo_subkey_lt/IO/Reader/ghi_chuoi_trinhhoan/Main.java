package demo_subkey_lt.IO.Reader.ghi_chuoi_trinhhoan;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {
        String text = "nguyen van A";
        String[] arr = {"1","2","3","4","5"};
        //Integer[] arr = {1,2,3,4,5,6,7,8,9};
        try {
            //FileWriter fileWriter= new FileWriter("data.txt");
            FileWriter fileWriter= new FileWriter("data.txt",true);
            BufferedWriter bufferedWriter= new BufferedWriter(fileWriter);
            //bufferedWriter.write(text);
            for (String s: arr) {
                bufferedWriter.write(s);
                bufferedWriter.newLine();

            }
            bufferedWriter.close();
            fileWriter.close();
        }
        catch (Exception e){
            System.out.println("loi");
        }

    }
}
