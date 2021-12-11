package bill;

import static org.junit.jupiter.api.Assertions.assertEquals;

import apartment.ThreeBHK;
import guests.Guests;
import org.junit.jupiter.api.Test;

class BillTest {


    @Test
    void testTotalLiters() {
        ThreeBHK bhk = new ThreeBHK(1, 1);

        assertEquals(1800, (new Bill(bhk, new Guests(1))).totalLiters());
    }

    @Test
    void testTotalCost() {
        ThreeBHK bhk = new ThreeBHK(1, 1);

        assertEquals(2475, (new Bill(bhk, new Guests(1))).totalCost());
    }

    @Test
    void testTotalCost2() {
        ThreeBHK bhk = new ThreeBHK(1, 1);

        assertEquals(3175, (new Bill(bhk, new Guests(2))).totalCost());
    }

    @Test
    void testTotalCost3() {
        ThreeBHK bhk = new ThreeBHK(1, 1);

        assertEquals(13375, (new Bill(bhk, new Guests(10))).totalCost());
    }

    @Test
    void testTotalCost4() {
        ThreeBHK bhk = new ThreeBHK(1, 1);

        assertEquals(61375, (new Bill(bhk, new Guests(30))).totalCost());
    }
}

