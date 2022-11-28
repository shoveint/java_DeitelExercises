package Assignments;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //int number = input.nextInt();


//        int number1 = input.nextInt();
//        System.out.println("Enter second number: ");
//
//        int number2 = input.nextInt();
//        System.out.println("Enter the forth number: ");
//
//        int number3 = input.nextInt();
//        System.out.println("enter the forth number: ");
//
//        int number4 = input.nextInt();
//        System.out.println("Enter the fifth number: ");
//
        //int[] arrayNumber = new int[0];
        //int minimum = arrayNumber[0];

        int[] arrayNumber = new int[5];

        int max = arrayNumber[0];

        int count;
        for (count = 0; count < arrayNumber.length; count++) {
            System.out.println("Enter 5 number of your choice between (0 - 100): ");
             arrayNumber[count] = input.nextInt();
            //max = arrayNumber[0];
            if (arrayNumber[count] > 0 && arrayNumber[count] < 100) {
                if (arrayNumber[count] > max) {
                    max = arrayNumber[count];
                }
            }
            int minimum = arrayNumber[0];
            for (int j : arrayNumber) {
                if (j < minimum) {
                    minimum = j;

                } else {
                    count -= 1;
                    System.out.println("enter a valid number");


                    System.out.println("The maximum number is: " + max);
                    System.out.println("The minimum number is: " + minimum);

                }
            }
        }
    }
}