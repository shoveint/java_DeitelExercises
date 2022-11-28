package Assignments;

import java.util.ArrayList;

public class ArrayTask {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();

        strings.add("G-strings");
        strings.add("E-string");

        for (String string: strings) {
            System.out.println(string);
        }
    }
}
