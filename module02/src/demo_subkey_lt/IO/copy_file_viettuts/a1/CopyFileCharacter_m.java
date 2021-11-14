package demo_subkey_lt.IO.copy_file_viettuts.a1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFileCharacter_m {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("src/demo_subkey_lt/IO/copy_file_viettuts/a1/input.txt");
            FileWriter fileWriter = new FileWriter("src/demo_subkey_lt/IO/copy_file_viettuts/a1/output.txt");
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
    /**
     *package ss16_IO_Text_File.bai_tap.copy_file_text;
     *
     * import java.io.FileReader;
     * import java.io.FileWriter;
     * import java.io.IOException;
     *
     * public class CopyFileCharacter {
     *     public static void main(String [] args) throws IOException {
     *         FileReader in = null;
     *         FileWriter out = null;
     *
     *         try {
     *             in = new FileReader("src/ss16_IO_Text_File/bai_tap/copy_file_text/inStream.txt");
     *             out = new FileWriter("src/ss16_IO_Text_File/bai_tap/copy_file_text/output.txt");
     *
     *             int c;
     *             while ((c = in.read()) != -1) {
     *                 out.write(c);
     *             }
     *         }finally {
     *             if (in != null) {
     *                 in.close();
     *             }
     *             if (out != null) {
     *                 out.close();
     *             }
     *         }
     *     }
     * }
     */
}
