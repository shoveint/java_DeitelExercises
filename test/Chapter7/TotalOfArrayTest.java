package Chapter7;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TotalOfArrayTest {
    @Test
    public void testTotal() {
        int[] array = {1, 2, 3, 4, 5};
        int TotalOfArray = Chapter7.TotalOfArray.arrayNumber(array);
        assertEquals(15, TotalOfArray);

    }

    @Test
    public  void testMinimum(){
        int[]array = {1, 2, 3, 4, 5};
        int MinimumOfArray = Chapter7.TotalOfArray.arrayMinimum(array);
        assertEquals(1, MinimumOfArray);
    }

    @Test
    public void testMaximum(){
        int[] array ={1, 2 , 3, 4, 5};
        int MaximumOfArray = Chapter7.TotalOfArray.arrayMaximum(array);
        assertEquals(5,MaximumOfArray);
    }



}