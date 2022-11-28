package Chapter7;

public class TotalOfArray {

    public static int arrayNumber(int[] size) {
        int total = 0;
        for (int counter = 0; counter < size.length; counter++) {
            total += size[counter];
        }
        System.out.println(total);
        return total;
    }

    static int arrayMinimum(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
        }

        return min;
    }
    static int arrayMaximum(int[] array){
        int max = array[0];
        for (int i : array) {
            max = i;
        }
        return max;
    }
}