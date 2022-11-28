package Chapter7;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;


public class SwapArray {
    public static void main(String[] args) {
        String[] arrayFirst = {"a, b"};
        String swap = arrayFirst[0];
        System.out.println("Before swapping is : "+ Arrays.toString(arrayFirst));
        //List<String> now = Arrays.asList(arrayFirst);
        arrayFirst[0] = String.valueOf(arrayFirst);
        arrayFirst[1] = swap;
        System.out.println(Arrays.toString(arrayFirst));

    }
    public  static int[] swap(int[]number){
        return new int[]{number[1], number[0]};

    }
}


