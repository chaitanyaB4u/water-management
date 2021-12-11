package guests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class GuestsTest {


    @Test
    void testTotalCost() {
        assertEquals(600, (new Guests(1)).totalCost());
        assertEquals(1187500, (new Guests(500)).totalCost());
        assertEquals(1300, (new Guests(2)).totalCost());
        assertEquals(11500, (new Guests(10)).totalCost());
    }

    @Test
    void testTotalLiterConsume() {
        assertEquals(300, (new Guests(1)).totalLiterConsume());
    }
}

