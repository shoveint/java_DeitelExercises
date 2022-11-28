package Chapter4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @BeforeEach
    public void setUp(){

    }
        @Test
    public void getFactorial(){
        int factorial = (int) Calculator.factorial(5);
        }
}
