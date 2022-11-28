package Chapter7;

public class ReversArray {
    public static void reverse(int[] a, int n) {
        int[] forwardArray = new int[n];
        int backwardArray = n;
        for (int num = 0; num < n; num++) {
            forwardArray[backwardArray - 1] = a[num];
            backwardArray = backwardArray - 1;
        }
        System.out.print("The reverse array is: \n ");
        for (int m = 0; m < n; m++) {
            System.out.print(forwardArray[m]);
        }
    }

    public static void main(String[] args) {
        int [] arr = {1, 2, 4, 5, 6, 7};
        //{1, 2, 3, 4, 5};
        reverse(arr, arr.length);
    }
}

