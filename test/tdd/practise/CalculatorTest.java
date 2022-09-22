package tdd.practise;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CalculatorTest {
    Calculator calculator;
    @BeforeEach
        public void startAllTestWith(){
        calculator = new Calculator();
    }
    @Test
    void testThatObjectExists(){

        assertNotNull(calculator);
    }
    @Test
    public void sum(){

        assertEquals(5,calculator.addTwoNumbers(2,3));
    }
    @Test
    public void subtract() {
        assertEquals(6,calculator.subtract(12,6));


    }
    @Test
    public void multiply() {
        assertEquals(8, calculator.multiply(2,4));
    }
    @Test
    public void divide() {
        assertEquals(5,calculator.divide(10,2));
    }
    @Test
    public void squareRoot(){
        assertEquals(3,calculator.squareRoot(9));
    }
    @Test
    public void AddUserInput(){
        assertEquals(6, calculator.AddUserInput(3,2,1));
    }
}
