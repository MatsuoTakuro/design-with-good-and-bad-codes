package Ch6.HotelRates;

public class Money {
    final int amount;

    Money(final int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount is not more than 0.");
        }

        this.amount = amount;
    }

    Money add(final Money other) {
        final int added = amount + other.amount;
        return new Money(added);
    }
}
