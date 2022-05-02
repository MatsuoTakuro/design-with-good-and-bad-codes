package Ch5.TaxCalculator;

import java.math.BigDecimal;

public class AmountExcludingTax {
    private static final int MIN_POINT = 0;
    final BigDecimal value;

    public AmountExcludingTax(final int value) {
        if ( value < MIN_POINT) {
            throw new IllegalArgumentException("amount is not more than 0.");
        }

        this.value = BigDecimal.valueOf(value);
    }
}
