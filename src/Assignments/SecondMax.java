package Assignments;

public class SecondMax {
    public static void twoMax() {
        int[] array = new int[]{23, 24, 25, 26, 27, 28, 17, 20, 16, 19,};
        int maximum = 0;
       // int max2 = 0;
        for (int value : array) {
            if (value > maximum) {
               // maximum = max2;
                maximum = value;
            }
        }
    }
}