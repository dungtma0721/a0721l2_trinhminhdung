package ss16_IO_Text_File.bai_tap.copy_file_text;

import java.io.*;
import java.util.Scanner;

public class CopyFileCharacter {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap file nguon: \"src/ss16_IO_Text_File/bai_tap/copy_file_text/input.txt\"");
        String inPath = scanner.nextLine();
        System.out.println("Nhap file dich:\"src/ss16_IO_Text_File/bai_tap/copy_file_text/output.txt\"");
        String outPath = scanner.nextLine();

        File file = new File(inPath);
        if (!file.exists()){
            throw new FileNotFoundException();
        }
        try {
            FileReader fileReader = new FileReader(file);
            FileWriter fileWriter = new FileWriter(outPath);
            int c;
            while ((c =fileReader.read())!=-1){
                fileWriter.write(c);
            }
            fileWriter.close();
            fileReader.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
