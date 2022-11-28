package Chapter7;

public class ArrayReverseSwap {
    public static void reverse(int[] userArray, int n) {
        int count1, count2, count3;
        for (count1 = 0; count1 < n / 2; count1++) {
            count3 = userArray[count1];
            userArray[count1] = userArray[n - count1 - 1];
            userArray[n - count1 - 1] = count3;
        }
        System.out.print("Reverse array is: \n");
            for (count2 = 0; count2 < n; count2++){
                System.out.println(userArray [count2]);
        }

    }

    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 60};
        reverse(array, array.length);
    }
}

