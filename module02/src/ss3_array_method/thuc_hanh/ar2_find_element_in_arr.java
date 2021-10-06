package ss3_array_method.thuc_hanh;

import java.util.Scanner;

public class ar2_find_element_in_arr {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya",
                "Connor", "Zachariah", "Mallory", "Zoe", "Emily","Zoe",};
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a name’s student:");
        String input_name = input.nextLine();
        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(input_name)) {
                System.out.println("Position of the students in the list " + input_name + " is: " + i);
                isExist = true;
//                break;
            }
        }
        if (!isExist) { //isExist==false
            System.out.println("Not found" + input_name + " in the list.");
        }
    }
}
