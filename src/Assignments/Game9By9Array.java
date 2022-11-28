package Assignments;

import java.io.OptionalDataException;

public class Game9By9Array {
    public static void main(String[] args) {
        int array[][] = new int[9][10];
        //int[] first = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        //int[] second = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};


        for (int index = 1; index < array.length; index++) {
            for (int index2 = 0; index2 < array.length; index2++) {
                if (index + index2 > 9) {
                    System.out.print((index + index2) % 9 + " ");
                } else {
                    System.out.print(index + index2 + " ");
                }
            }
            System.out.println();
        }
    }
}
