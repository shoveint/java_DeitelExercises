package Assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddArrayList {
    public static void main(String[] args) {

        String list1 = "a,b,c";
        int[] list2 = {1, 2, 3};
        List<Integer>list = new ArrayList<Integer>();

        System.out.println(list1 + Arrays.toString(list2));
    }
}