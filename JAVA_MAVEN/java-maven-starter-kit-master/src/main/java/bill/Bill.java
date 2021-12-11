package bill;

import apartment.Apartment;
import guests.Guests;

public class Bill {
    private final Apartment bhk;
    private final Guests guests;

    public Bill(Apartment bhk, Guests guests) {
        this.bhk = bhk;
        this.guests = guests;
    }

    public int totalLiters() {
        return bhk.totalWaterConsume() + guests.totalLiterConsume();
    }

    public int totalCost() {
        return guests.totalCost() + bhk.totalBill();
    }
}
