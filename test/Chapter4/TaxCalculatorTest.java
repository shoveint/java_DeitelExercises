package Chapter4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;


public class TaxCalculatorTest {
    private TaxCalculator calculator;
    private Citizen mathias;
    private Citizen shola;
    private Citizen adewumi;

    @BeforeEach
    public void setUp() {
        mathias = new Citizen();
        mathias.setFirstName("Mathias");
        mathias.setSurname("Momodu");
        BigDecimal salary = new BigDecimal(17000);
        mathias.setEarnings(salary);

        adewumi = new Citizen("Adewumi", "Adegunwa");
        adewumi.setEarnings(BigDecimal.valueOf(25000));

        shola = new Citizen("Adeshola", "Ademoney");
        shola.setEarnings(BigDecimal.valueOf(45000));


    }

    @Test
    public void calculatorTax() {
        BigDecimal mathiasTax = TaxCalculator.calculatorTax(mathias);
        assertEquals(2550, mathiasTax.intValue());

        BigDecimal adewumiTax = TaxCalculator.calculatorTax(adewumi);
        assertEquals(3750, adewumiTax.intValue());
    }


    @Test
    public void calculateBigRate() {
        BigDecimal sholaTax = TaxCalculator.calculatorTax(shola);
        assertEquals(7500, sholaTax.intValue());

    }
}