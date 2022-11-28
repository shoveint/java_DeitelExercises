package Chapter4;

public class Calculator {
    public static long factorial(int number){
        long result =number;
        for (int i = number - 1; i > 0; i --){
            result = result * i;
        }
        return result;

    }
}
