package ss16_IO_Text_File.bai_tap.read_file_csv;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main2 {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("src/ss16_IO_Text_File/bai_tap/bt2/countries.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line="";
            while (true){
                line = bufferedReader.readLine();
                if (line==null){
                    break;
                }
            }
            bufferedReader.close();
        }
        catch (Exception e){
            System.out.println("ERRR");
        }

    }
}
