package demo_subkey_lt.demo_fx.as1;

import java.util.Random;
import java.util.Scanner;

public class Main {

    static int luckyNumber, totalGames = 0, totalGuess = 0, bestGame = 0; //Các biến hiển thị kết quả
    static final int MAX = 100; //Số giới hạn lớn nhất tìm ngẫu nhiên

    public static void main(String[] args) {
	// write your code here
        play();
        report();
    }


    //Phương thức play
    public static void play(){
        boolean check1 = true;
        while (check1) {
            Random random = new Random(); //Khai báo Random
            Scanner scanner = new Scanner(System.in);
            luckyNumber = random.nextInt(MAX + 1); //gán biến luckyNumber random
            boolean check = true; //biến xử lí dừng chương trình
            int min = 0; //biến xử lí bestgame
            int count = 0;
            System.out.println("I'm thinking of a number between 0 and " + MAX + "...");

            //Vòng lặp chạy chương trình
            while (check) {
                //Khai báo các biến
                int guess;
                System.out.printf("Your guess? ");
                guess = scanner.nextInt();
                totalGuess++;
                count++;
                min++;

                //So sánh số đoán với số may mắn
                if (guess < luckyNumber) {
                    System.out.println("It's higher");
                    continue;
                } else if (guess > luckyNumber) {
                    System.out.println("It's lower");
                    continue;
                } else {
                    if (totalGames == 0)
                        bestGame = min;
                    else if (bestGame > min)
                        bestGame = min;
                    String choose;
                    System.out.println(String.format("You got it right in %d guesses", count));
                    String str = scanner.nextLine();
                    System.out.printf("Do you want to play again? ");
                    choose = scanner.nextLine();
                    totalGames++;
                    if (choose.matches("([yY][e][s])|([Y][E][S])|([yY])")) {
                        check = false;
                        check1 = true;
                        count = 0;
                        System.out.printf("\n");
                    } else{
                        check = false;
                        check1 = false;
                    }
                }
            }
        }
    }

    //Phương thức report
    public static void report(){
        System.out.println();
        System.out.println("Overall results:");
        System.out.println("Total Games: " + totalGames); //Tổng lượt chơi
        System.out.println("Total Guess: " + totalGuess); //Tổng lần đoán
        System.out.println("Guesses/Games: " + ((double)totalGuess / totalGames)); //Trung bình lần đoán mỗi lượt
        System.out.println("Best game: " + bestGame); //Số lần đoán ít nhất
    }
}
