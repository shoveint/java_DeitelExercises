package Assignments;

import java.util.Arrays;

public class IdentifyTheNumbers{
    public void stringOfCharacters(){

        String mixUp = "a1b2c3d4";
        System.out.println(mixUp);
        CharSequence hello = "";
        String ignoreFirstChar = hello.charAt(0) +
                hello.toString().replaceAll("[^a -zA-Z]",  "").toLowerCase();
        System.out.println(ignoreFirstChar);


    }
}
