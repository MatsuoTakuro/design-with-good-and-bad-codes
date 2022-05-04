package Ch6.HotelRates;

public class Main {
    public static void main(String[] args) {
        HotelRateType premium = HotelRateType.PREMIUM;
        System.out.println(premium.fee().amount);
        System.out.println(premium.busySeasonFee().amount);

        HotelRateType regular = HotelRateType.REGULAR;
        System.out.println(regular.fee().amount);
        System.out.println(regular.busySeasonFee().amount);
    }
}
