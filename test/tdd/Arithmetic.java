package tdd;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int number1 = input.nextInt();

        System.out.print("Enter second integer: ");
        int number2 = input.nextInt();

        int Square = number1 * number1;


        System.out.printf("Square is %d%n", Square);

        int Square2 = number1 * number2;
        System.out.printf("Square is %d%n", Square2);

        int Sum = Square + Square2;
        System.out.printf("Sum is %d%n", Sum);

        int Minus = Square - Square2;
        System.out.printf("Minus is %d%n", Minus);
    }
}
