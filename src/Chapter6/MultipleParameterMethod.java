package Chapter6;

import java.util.Scanner;

public class MultipleParameterMethod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three floating-point values separated by spaces");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();

        //double result = Math.max(Math.max(num1, num2), num3);
        double result = max(num1, num2, num3);
        System.out.println("Maximum number is:" + result);

    }
    public static double max(double x, double y, double z){
        double maxValue = x;
        if (y > maxValue){
            maxValue=y;
        }
        if (z > maxValue){
            maxValue = z;
        }
        return maxValue;
    }
}
