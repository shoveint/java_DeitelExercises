package Assignments;


public class Task2InArray {
    public static void main(String[] args) {


        char[][] elements = {{'x', 'o', 'x'}, {'o', 'x', 'x'}, {'x', 'x', 'o'}};
        for (char[] element : elements) {
            for (char shove : element) {
                System.out.printf("%2s", shove);
            }
            System.out.println();

            //System.out.println((Arrays.deepToString(element)));
        }
    }
}
