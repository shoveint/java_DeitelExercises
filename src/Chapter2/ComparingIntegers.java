package Chapter2;

import java.util.Scanner;
//Write an application that asks the user to enter one integer, obtains
//it from the user and displays whether the number and its square are greater than, equal to, not equal
//to, or less than the number 100.

public class ComparingIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1 = 0;
        switch (number1) {
            case 1:
                System.out.println("Enter first integer: ");
                break;
        }
        number1 = input.nextInt();
        int number2 = 0;
        switch (number2) {
            case 1:
                System.out.println("Enter Second integer: ");
                break;
        }

        number2 = input.nextInt();
        switch (number2) {
            case 1:
                System.out.println("Print sum of the number");
                break;
        }
        int Square = number1 * number1;
                switch (Square) {
                    case 1:
                    System.out.printf("Square is %d%n", Square);
                }
                int Square2 = number1 * number2;
                switch (Square2){
                    case 1:
                System.out.printf("Square is %d%n", Square2);

                int Sum = Square + Square2;
                switch (Sum) {
                    case 1:
                        System.out.printf("Sum is %d%n", Sum);
                }
                if (number1 > number2)
                    System.out.printf("%d>%d%n", number1, number2);
                if (Square > Square2)
                    System.out.printf("%d>%d%n", Square, Square2);
                if (number1 != number2) {
                    System.out.printf("%d!=%n");
                    break;
                }

        }
    }
}