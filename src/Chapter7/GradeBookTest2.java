package Chapter7;

public class GradeBookTest2 {
    public static void main(String[] args) {
        int[][] gradeArray = {{87, 97, 70}, {68, 87, 90}, {94, 100, 90}, {100, 81, 82}, {83, 65, 85}, {78, 87, 65},
                {85, 75, 83}, {91, 94, 100}, {76, 72, 84}, {87, 93, 73}

        };
        GradeBook2 myGradeBook = new GradeBook2(
                "CS101 Introduction to Java Programming", gradeArray
        );
        System.out.printf("Welcome to the grade book for%n%s%n%n", myGradeBook.getCourseName());
        myGradeBook.processGrade();
    }
}

