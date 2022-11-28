package Assignments;

public class ReverseArray {

    private void reverse(int[] a, int love) {
        int[] b = new int[love];
        int j = love;
        for (int i = 0; i < love; i++) {
            b[j - 1] = a[i];
            j = j - 1;
        }
        System.out.println("Reversed array is: \n ");
        for (int k = 0; k < love; k++) {
            System.out.println(b[k]);
            break;
        }
    }

    public void main(String[] args) {
        int [] arr = {1,2,3,3,4,5,7,8,9,10};
        reverse(arr, arr.length);
    }
}
