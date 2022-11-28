package Assignments;

import java.util.Arrays;

public class MaximumList {
    public static void main(String[] args) {
        int[] array  = {1, 56, 6, 45, 101, 566, 700, 34, 67, 89};
        int maximum = array[0];
        int minimum = array[0];
        //int secondMax = array[0];
        int getMax;
        int getMinimum = 0;
        for (getMax = 0; getMax < array.length; getMax++){
            if (array[getMax]>maximum){
                maximum = array[getMax];
            } else if (array[minimum]< minimum) {
                minimum = array[getMinimum];





            }
        }
        System.out.println("The maximum is:" + maximum);
        System.out.println("The minimum number is: " + minimum);
    }
}
