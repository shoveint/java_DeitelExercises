package Assignments;

import java.util.Scanner;

public class EnterScore {
    public static void main(String[] args) {
        int scoreCount = 0;
        Scanner scanner = new Scanner(System.in);
        int totalScore = 0;
        while (scoreCount != 10){
            System.out.println("Enter a score " + (scoreCount + 1));
            int score = scanner.nextInt();

            if (score >= 0 && score <= 100){
                totalScore += score;
                scoreCount++;
            }
        }
        System.out.println("Total score is " + totalScore);
    }
}
