package Chapter7;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ArrayUtilsTest {

    @Test
    public void reverseStringTest(){
        String input = "Adeleke";
        String output = ArrayUtils.reverse(input);
        assertEquals("ekeledA", output);
    }

    @Test
    public void returnSentenceCaseTest() {
        String input = "adeleke";
        String upperCase = "Adeleke";
        assertEquals("Adeleke", upperCase);
    }

    @Test
    public void reverseArrayTest() {
        int[] array = {1,2,3,4,5};
        int[] reversedArray = ArrayUtils.reverse(array);
        assertArrayEquals(new int[]{5,4,3,2,1}, reversedArray);
        System.out.print(Arrays.toString(reversedArray));
    }
}