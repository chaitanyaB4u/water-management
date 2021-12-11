package guests;

public class Guests {
    private final int guestLitersConsume;

    public Guests(int noOfGuests) {
        this.guestLitersConsume = noOfGuests * 10 * 30;
    }

    public int totalCost() {
        if (guestLitersConsume <= 500) {
            return guestLitersConsume * 2;
        } else if (guestLitersConsume <= 1500) {
            return 500 * 2 + (guestLitersConsume - 500) * 3;
        } else if (guestLitersConsume <= 3000) {
            return 500 * 2 + 1000 * 3 + (guestLitersConsume - 1500) * 5;
        } else {
            return 500 * 2 + 1000 * 3 + 1500 *5+(guestLitersConsume - 3000) * 8;
        }
    }

    public  int totalLiterConsume(){
        return guestLitersConsume;
    }


}
