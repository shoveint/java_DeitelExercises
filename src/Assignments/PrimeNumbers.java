package Assignments;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        int i = 1;
        int x = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number and determine if its prime number");
        int i1 = scanner.nextInt();
        for (i = 1; i <= x; i++) {
            int remainder = x % i;
            int numberOfFactors = 0;
            if (remainder == 0){
                numberOfFactors++;
            }

            if (numberOfFactors > 2) {
                System.out.println("The number is not a prim factor");
            }
        }
    }
}