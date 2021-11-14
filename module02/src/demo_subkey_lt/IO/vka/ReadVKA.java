package demo_subkey_lt.IO.vka;


import java.io.*;

public class ReadVKA {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        //khai bao 1 doi tuong file
        File file = new File("src/demo_subkey_lt/IO/vka/vk_text.txt");
        //tao 1 dong ket noi voi file
        InputStream inputStream = new FileInputStream(file);
        // tao 1 doi tuong doc file voi dong tren
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        // tao 1 doi tuong bo dem
        BufferedReader reader = new BufferedReader(inputStreamReader);
        String line = "";
        while ((line = reader.readLine())!=null){
            System.out.println(line);
        }

    }

}
