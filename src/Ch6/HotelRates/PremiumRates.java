package Ch6.HotelRates;

public class PremiumRates implements HotelRates {
    public Money fee() {
        return new Money(12000);
    }

    public Money busySeasonFee() {
        return fee().add(new Money(5000));
    }
}
