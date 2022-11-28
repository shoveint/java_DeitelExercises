package Chapter4;

import java.math.BigDecimal;

public class TaxCalculator {
    private static final  BigDecimal MINIMUM_EARNINGS = BigDecimal.valueOf(30000);
    private static final double BASE_TAX_RATE = 0.15;
    private static final double ADDITIONAL_RATE = 0.20;


    public static BigDecimal calculatorTax(Citizen citizen){
        BigDecimal taxAmount = BigDecimal.ZERO;
//        taxAmount = citizen.getEarnings().multiply(BigDecimal.valueOf(BASE_TAX_RATE));
      if (citizen.getEarnings().compareTo(MINIMUM_EARNINGS) < 1) {
            taxAmount = citizen.getEarnings().multiply(BigDecimal.valueOf(BASE_TAX_RATE));
        }
        else {
            BigDecimal miniEarns = citizen.getEarnings().subtract(BigDecimal.valueOf(ADDITIONAL_RATE));
            BigDecimal addTax = miniEarns.multiply(BigDecimal.valueOf(ADDITIONAL_RATE));
            BigDecimal baseTax = MINIMUM_EARNINGS.multiply(BigDecimal.valueOf(BASE_TAX_RATE));
            taxAmount = baseTax.add(addTax);
          }
        return taxAmount;
    }
}
