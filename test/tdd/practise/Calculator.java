package tdd.practise;

import java.util.Scanner;

public class Calculator {
    private Scanner input;

    public int addTwoNumbers(int num1, int num2) {
        return num1 + num2;
    }

    public int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public int divide(int num1, int num2) {
        return num1 / num2;
    }

    public double squareRoot(int num1) {
        return Math.sqrt(num1);
    }

    public int AddUserInput(int input1, int input2, int input3) {
        if (input1 <= 0) {
            System.out.println("Your input cant be that less !!!");
        } else if (input2 <= 0) {
            System.out.println("Ahh, wetin happen?");
        } else if (input3 <= 0) {
            System.out.println("I give up!!, God abegggg");
        }
        return input1 + input2 + input3;

    }

}
