package Chapter4;

import java.util.Scanner;

public class StudentScores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

            int passes = 0;
            int failure = 0;
            int studentCounter = 1;



            while (studentCounter <= 10){
                System.out.println("Enter the exam result:");
                int studentResult = input.nextInt();

                if (studentResult == 1){
                    passes++;
                }
                else {
                    failure++;
                }
                studentCounter = studentCounter + 1;
            }
            System.out.println("number of passes are:" + passes);
            System.out.println("number of fail students are: " + failure);

            if (passes >= 8){
                System.out.println("Teacher has bonus");
            }
    }
}
