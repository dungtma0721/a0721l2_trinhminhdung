package ss16_IO_Text_File.thuc_hanh.tong_so_trong_file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class SumFile {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap duwowng dan:");
        String path= scanner.nextLine();
        File file = new File(path);
        if (!file.exists()){
            throw new FileNotFoundException();
        }
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line="";
            int sum = 0;
            while (true){
                line = bufferedReader.readLine();
                if (line== null){
                    break;
                }
                int n = Integer.parseInt(line);
                sum +=n;
            }
            bufferedReader.close();
            System.out.println(sum);
        }
        catch (Exception e){
            System.out.println("ER");
        }
    }
}
