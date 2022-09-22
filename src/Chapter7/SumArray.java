package Chapter7;

public class SumArray {
    public static void main(String[] args) {
        int [] Array = {5,6,4,10,17,7,18,20,33,44,55,};
        int Sum = 0;

        for (int Counter = 0; Counter < Array.length; Counter ++) {
            Sum = Sum + Array[Counter];

        }
        System.out.println("the Sum of Array is: " + Sum);
    }

}
