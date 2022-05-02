package Ch5.TaxCalculator;

import java.math.BigDecimal;

public class AmountIncludingTax {
    public final BigDecimal value;

    public AmountIncludingTax(final AmountExcludingTax amountExcludingTax, final TaxRate taxRate) {
        value = amountExcludingTax.value.multiply(taxRate.value);
    }
}
