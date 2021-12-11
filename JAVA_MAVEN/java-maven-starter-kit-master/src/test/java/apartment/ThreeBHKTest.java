package apartment;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ThreeBHKTest {
    @Test
    void testTotalWaterConsume() {
        assertEquals(1500, (new ThreeBHK(1, 1)).totalWaterConsume());
        assertEquals(1500, (new ThreeBHK(1, 1)).totalWaterConsume());
    }

    @Test
    void testTotalBill() {
        assertEquals(1875, (new ThreeBHK(1, 1)).totalBill());
    }
}

