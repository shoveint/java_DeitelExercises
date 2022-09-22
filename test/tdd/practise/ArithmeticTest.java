package tdd.practise;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArithmeticTest {

    ArithmeticTest arithmetic;

    @BeforeEach
    void startAllObjectWith() {
        arithmetic = new ArithmeticTest();
    }

    @Test
    public void testThatObjectExist() {
        assertNotNull(arithmetic);
    }

    @Test
    public void square() {
        assertEquals(9, arithmetic.square(3, 3));
    }

    private int square(int num1, int num2) {
        return num1 * num2;
    }

    private int square(int num1) {
        return (num1)
        ;
    }
}