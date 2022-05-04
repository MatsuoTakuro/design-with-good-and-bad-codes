package Ch6.HotelRates;

public class RegularRates implements HotelRates {
    public Money fee() {
        return new Money(7000);
    }

    public Money busySeasonFee() {
        return fee().add(new Money(3000));
    }
}
