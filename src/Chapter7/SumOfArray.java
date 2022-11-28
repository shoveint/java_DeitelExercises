package Chapter7;

public class SumOfArray {
    public static void main(String[] args) {
        int[] array = {56,56,34,32,67,23,100,105,107,190,200};
        int total = 0;
        for (int counter = 0; counter < array.length; counter++){
            total += array[counter];
        }
        System.out.printf("Total of the elements: %d%n", total);
    }
}
