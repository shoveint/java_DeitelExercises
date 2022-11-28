package Chapter7;

public class LengthOfArray{
public static void main(String[]args){
int Array_Length = 10;
        int[] array = new int[Array_Length];
for (int counter =0; counter < array.length; counter++) {
        array[counter] = 2 + 2 * counter;

}
System.out.printf("%s%8s%n", "Index", "Value");
for (int counter = 0; counter < array.length; counter++){
        System.out.printf("%5d%8d%n", counter, array[counter]);
}
}

        }
