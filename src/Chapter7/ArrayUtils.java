package Chapter7;

public class ArrayUtils {
    public static int[] reverse(int[] userArray) {
        int[] reversedArray = new int[userArray.length];
        int backwardCounter = userArray.length - 1;
        int forwardCounter = 0;

        while (backwardCounter != -1) {
            reversedArray[forwardCounter++] = userArray[backwardCounter--];
        }
        return reversedArray;
    }

    public static String reverse(String userString) {
        String reversedString = "";
        int backwardCounter = userString.length() - 1;
        while (backwardCounter != -1) {
            reversedString += userString.charAt(backwardCounter--);
        }
        return reversedString;
    }
}

   /*public static String sentenceCAse(String userString){
        String upperCase = "";
        String firstCapitalCase = "adeleke";
        while (userString.charAt()){
            char word= userString.charAt(sentenceCAse());
            upperCase += Character.toUpperCase(word.charAt(0)) + word.substring(1);
        }
        return upperCase;
    }
}
*/