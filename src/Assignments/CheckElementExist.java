package Assignments;

public class CheckElementExist {
    public static void main(String[] args) {
        int[] array = {1, 56, 6, 45, 101, 566, 700, 34, 67, 89};
        //int element = array[0];
        int check;
        for (check = 0; check < array.length; check++){
            if (array[check] == 550 ){
                System.out.println(true);
            }
            else {
                System.out.println(false);
            }
        }
    }
}
