package Chapter4;

import Chapter3.Student;

public class StudentTest {
    public static void main(String[] args) {
        Student account1 = new Student("Shola", 97.0);
        Student account2 = new Student("Justin", 89.0);
        Student account3 = new Student("Justice", 56.6);

        System.out.printf("%s's Letter grade is: %s%n", account1.getName(), account1.getLetterGrade());
        System.out.printf("%s's Letter grade is: %s%n", account2.getName(), account2.getLetterGrade());
        System.out.printf("%s's Letter grade is: %s%n", account3.getName(), account3.getLetterGrade());
    }
}
