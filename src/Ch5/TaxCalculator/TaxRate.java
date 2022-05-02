package Ch5.TaxCalculator;

import java.math.BigDecimal;

public class TaxRate {
    private static final double TAX_RATE = 0.10;
    final BigDecimal value;

    private TaxRate() {
        value =  BigDecimal.valueOf(1.00 + TAX_RATE);
    }

    public static TaxRate taxRate() {
        return new TaxRate();
    }

}
