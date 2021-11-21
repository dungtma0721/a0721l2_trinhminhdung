package demo_subkey_lt.demo_fx.as2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static double midtermScore, finalScore, homeworkScore;
    static int weightSum = 0;

    public static void main(String[] args) {
	// write your code here
      boolean isLoop = true;
      Begin();
      do{
          midterm();
          finalTerm();
          homework();
          if(weightSum != 100){
              weightSum = 0;
          }
          else if(weightSum == 100){
              isLoop = false;
          }
      }while (isLoop);
      report();
    }



    //Phương thức xử lí số sau dấu phẩy
    public static double convert(double x){
        return (Math.floor(x * 100) / 100);
    }



    //Phương thức hiển thị thông điệp chào mừng.
    public static void Begin(){
        System.out.println("This program reads exam/homework scores" +
                "and reports your overall course grade");
    }



    //Phương thức  nhập và tính toán điểm thi giữa kỳ.
    public static void midterm(){
        Scanner scanner = new Scanner(System.in);
        int weight, scoreEarned, scoresShifted = 0, choose = 0, totalScore;
        boolean check = true;

        System.out.println("Midterm:");
        System.out.printf("Weight (0-100): "); //Nhập  trọng số của điểm thi giữa kỳ
        weight = scanner.nextInt();
        weightSum += weight;
        System.out.printf("Score earned: "); //Nhập điểm số mà người dùng đã đạt được
        scoreEarned = scanner.nextInt();

        //Kiểm tra xem điểm thi có được tăng không
        while (check){
            System.out.printf("Were scores shifted (1 = yes, 2=no): ");
            choose = scanner.nextInt();
            if (choose == 1 || choose == 2)
                check = false;
        }
        if(choose == 1){
            System.out.printf("Shift amount: "); //Nhập  điểm thi được tăng
            scoresShifted = scanner.nextInt();
        }
        if(scoreEarned + scoresShifted > 100)
            totalScore = 100;
        else
            totalScore = scoreEarned + scoresShifted;

        System.out.println(String.format("Total points = %d / 100", totalScore)); //Tổng điểm
        midtermScore = convert((totalScore / 100.0) * weight);
        System.out.println(String.format("Weighted score = %.1f / %d", midtermScore, weight)); //Điểm thi giữa kì
        System.out.println();
    }



    //Phương thức  nhập và tính toán điểm thi cuối kỳ.
    public static void finalTerm(){
        Scanner scanner = new Scanner(System.in);
        int weight, scoreEarned, scoresShifted = 0, choose = 0, totalScore;
        boolean check = true;

        System.out.println("FinalTerm:");
        System.out.printf("Weight (0-100): "); //Nhập  trọng số của điểm thi cuối kỳ
        weight = scanner.nextInt();
        weightSum += weight;
        System.out.printf("Score earned: "); //Nhập điểm số mà người dùng đã đạt được
        scoreEarned = scanner.nextInt();

        //Kiểm tra xem điểm thi có được tăng không
        while (check){
            System.out.printf("Were scores shifted (1 = yes, 2=no): ");
            choose = scanner.nextInt();
            if (choose == 1 || choose == 2)
                check = false;
        }
        if(choose == 1){
            System.out.printf("Shift amount: "); //Nhập  điểm thi được tăng
            scoresShifted = scanner.nextInt();
        }
        if(scoreEarned + scoresShifted > 100)
            totalScore = 100;
        else
            totalScore = scoreEarned + scoresShifted;

        System.out.println(String.format("Total points = %d / 100", totalScore)); //Tổng điểm
        finalScore = convert((totalScore / 100.0) * weight);
        System.out.println(String.format("Weighted score = %.1f / %d", finalScore, weight)); //Điểm thi cuối kì
        System.out.println();
    }



    //Phương thức nhập và tính toán điểm homework;
    public static void homework(){
        Scanner scanner = new Scanner(System.in);
        int weight, num, section, score = 0, max = 0;
        ArrayList<String> arrayList = new ArrayList<>();

        System.out.println("Homework:");
        System.out.printf("Weight (0-100): "); //Nhập  trọng số của homework
        weight = scanner.nextInt();
        weightSum += weight;
        System.out.printf("Number of assignments: "); //Nhập số lượng bài assignment
        num = scanner.nextInt();
        String s = scanner.nextLine();

        //Thêm điểm từng bài assigment
        for (int i = 0;i < num; i++){
            System.out.printf(String.format("Assignment %d score and max: ", i + 1));
            String str = scanner.nextLine();
            arrayList.add(str);
        }
        System.out.printf("How many sections did you attend: "); //nhập số buổi điểm danh
        section = scanner.nextInt();
        System.out.println("Section points = " + section * 5 + "/30");
        if(section * 5 > 30) //kiểm tra điểm điểm danh có vượt quá 30
            section = 30;
        else
            section *= 5;
        score += section;
        max += 30;

        for (int i = 0;i < num; i++){
            int a = Integer.parseInt(arrayList.get(i).substring(0, arrayList.get(i).indexOf(" ")));
            //arrayList.get(i).substring(0, arrayList.get(i).indexOf(" "))
            int b = Integer.parseInt(arrayList.get(i).substring(arrayList.get(i).indexOf(" ") + 1, 5));
            score += a;
            max += b;
        }

        if(max > 150) //kiểm tra tổng điểm có vượt quá 150
            max = 150;

        System.out.println(String.format("Total points %d/%d", score, max));

        homeworkScore = convert((double) score / max * weight);

        System.out.println(String.format("Weighted score = %.1f/%d", homeworkScore, weight));
        System.out.println();
    }



    //Phương thức tính toán về hiển thị kết quả GPA;
    public static void report(){
        double grade = midtermScore + finalScore + homeworkScore;
        System.out.println(String.format("Overall percentage: %.1f", grade));
        if(grade > 85)
            System.out.println("Your grade will be at least: 3.0");
        else if(grade <= 84.99 && grade >= 75)
            System.out.println("Your grade will be at least: 2.0");
        else if(grade <= 84.99 && grade >= 75)
            System.out.println("Your grade will be at least: 2.0");
        else if(grade <= 74.99 && grade >= 60)
            System.out.println("Your grade will be at least: 0.7");
        else
            System.out.println("Your grade will be at least: 0");
        System.out.println("<< Your custom grade massage here >>");
    }


}
