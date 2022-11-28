package Chapter7;

public class SkipAndAdd {
    public static int[] addNumber(int[] size) {
        int add = 0;
        int index = size[1];
        for (int counter = 1; counter <= size.length - 1; counter++) {
            for (index = 0; index <= size.length - 1; counter++) {
                if (index == counter) ;
                index = size[counter];
                continue;
            }

        }

        return size;
    }
}
