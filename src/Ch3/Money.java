package Ch3;

import java.util.Currency;

public class Money {
    final int amount;
    final Currency currency;

    Money(final int amount, final Currency currency) {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount is not more than 0.");
        }
        if (currency == null) {
            throw new NullPointerException("Please specify currency");
        }

        this.amount = amount;
        this.currency = currency;
    }

    Money add(final int other) {
        final int added = amount + other;
        return new Money(added, currency);
    }


}
