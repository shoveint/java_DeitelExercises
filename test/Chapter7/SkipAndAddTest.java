package Chapter7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SkipAndAddTest {

    @Test
    public void addNumber() {
        int[] array ={5,2,3,1,4};
        int[] addNumber = SkipAndAdd.addNumber(array);
        assertEquals(10, addNumber);
    }
}