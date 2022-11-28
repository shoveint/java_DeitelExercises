package tdd;

import java.util.Scanner;

public class StudentGrades {
    //(Student Grades) A group of five students earned the following grades:
    //Student 1, ‘A’;
    // student 2, C’;
    // student 3, ‘B’;
    // student 4, ‘A’
    // and student 5, ‘B’.
    // Write an application that reads a series
    //of pairs of numbers as follows:
    //a) student name
    //b) student letter grade
    private static int grade;
    private  static String studentName;
    private static int score;
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        input.nextInt();
        input.nextInt();
        String student1 = String.valueOf('A');
        String student2 = String.valueOf('C');
        String student3 = String.valueOf('c');
        String student4 = String.valueOf('A');
        String student5 = String.valueOf('B');

        System.out.println("Enter student name: ");
        System.out.println("Enter student grade: ");
        System.out.println("Enter student scores: ");
        int score = input.nextInt();

        if(score == 2){
            System.out.println("Student grade");
        }

    }
    public static final int  grade() {
        StudentGrades studentGrades = new StudentGrades();
        int score = 20 + grade();
        return score;

    }
}
