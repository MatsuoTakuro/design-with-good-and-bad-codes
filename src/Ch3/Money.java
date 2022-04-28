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

    Money add(final Money other) {
        if (!currency.equals(other.currency)) {
            throw new IllegalArgumentException("Currency units are different.");
        }

        final int added = amount + other.amount;
        return new Money(added, currency);
    }


}
