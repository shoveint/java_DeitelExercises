package Assignments;

import java.util.Scanner;

public class MeanOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first integer");
        int firstInt = input.nextInt();
        System.out.println("Enter second integer");
        int secondInt = input.nextInt();
        System.out.println("Enter third integer");
        int thirdInt = input.nextInt();

        int sum = firstInt + secondInt + thirdInt;
        int mean = sum/3;
        System.out.println("the mean of the 3 integers is: " +mean);
    }

}
