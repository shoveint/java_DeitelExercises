package Chapter2;

import java.util.Objects;

public class ComparisonOperator {
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 5;

        if (4 == 5){
            System.out.println("num1 == num2");
        }
        if (4 != 5){
            System.out.println("4 != 5");
        }
        if (4 < 5){
            System.out.println("4 < 5");
        }
        if (4 > 5){
            System.out.println("4 > 5");
        }
        if (4 <= 5) {
            System.out.println("4 <= 5");
        }
        if ((num1 == 4) && (num2 == 5)) {
            System.out.println("num is equal to 4 AND num2 is equal to 5");
        }
        if ((num1 == 4)||(num2 == 4)){
            System.out.println("num1 is equal to 4 OR num2 is equal to 4");
        }




    }
}
