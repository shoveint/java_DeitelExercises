import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tdd.ArithmeticSmallAndLargest;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArithmeticSmallAndLargestTest {
    ArithmeticSmallAndLargest arithmeticSmallAndLargest;

    public ArithmeticSmallAndLargestTest(int sum) {
    }
    @BeforeEach
    public void startAllTestWith(){

        arithmeticSmallAndLargest = new ArithmeticSmallAndLargest();
    }

    @Test
    public void sum() {
        assertEquals(15, ArithmeticSmallAndLargest.sum(3,7,5));

    }
@Test
    public void average(){
        assertEquals(5, ArithmeticSmallAndLargest.average(3,7,5));

}
}
