package Assignments;

import java.util.Scanner;

public class FactorOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integer: ");

        int number = scanner.nextInt();

        int sum = 0;

        for(int counter = 1; counter < number; counter++  )
        {
            if (number % counter == 0){
                System.out.println("Factors of " + number + " is " + counter + "\n");
                sum = sum + counter;
            }
        }
        System.out.println("The sum of the factors is: " + sum);
    }
}
