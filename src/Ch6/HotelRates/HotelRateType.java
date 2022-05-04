package Ch6.HotelRates;

public enum HotelRateType {
    REGULAR(new RegularRates()),
    PREMIUM(new PremiumRates());

    private final HotelRates hotelRates;

    HotelRateType(HotelRates hotelRates) {
        this.hotelRates = hotelRates;
    }

    public Money fee() {
        return hotelRates.fee();
    }

    public Money busySeasonFee() {
        return hotelRates.busySeasonFee();
    }
}
