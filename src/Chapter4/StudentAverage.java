package Chapter4;

import java.util.Scanner;

public class StudentAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int total = 0;
        int gradeCounter = 0;


        System.out.println("Enter first grade or Enter -1 to quit:");
        int grade = input.nextInt();

        while (grade != -1 ){
            total = total + grade;
            gradeCounter =gradeCounter + 1;

            System.out.println("Enter first grade or Enter -1 to quit:");
            grade = input.nextInt();


        }
        if (gradeCounter != -1){
            double average = (double) total / gradeCounter;
            System.out.println("The to total of the grade enter is:" + gradeCounter + total);
            System.out.println("The total average of the class is: " + average);
        }
        else {
            System.out.println("No grade were entered!");
        }
    }
}
