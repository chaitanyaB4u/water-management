package apartment;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TwoBHKTest {
    @Test
    void testTotalWaterConsume() {
        assertEquals(900, (new TwoBHK(1, 1)).totalWaterConsume());
    }

    @Test
    void testTotalBill() {
        assertEquals(1125, (new TwoBHK(1, 1)).totalBill());
    }
}

