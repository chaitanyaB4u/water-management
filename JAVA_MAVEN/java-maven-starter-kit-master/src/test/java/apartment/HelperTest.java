package apartment;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class HelperTest {
    @Test
    void testConstructor() {
        assertEquals(0, (new Helper(1, 1, 1)).ratio());
    }

    @Test
    void testRatio() {
        assertEquals(0, (new Helper(1, 1, 1)).ratio());
        assertThrows(ArithmeticException.class, () -> (new Helper(-1, 1, 1)).ratio());
    }

    @Test
    void testTotalConsumeCorporateWater() {
        assertEquals(0, (new Helper(1, 1, 1)).totalConsumeCorporateWater());
        assertThrows(ArithmeticException.class, () -> (new Helper(-1, 1, 1)).totalConsumeCorporateWater());
    }

    @Test
    void testTotalConsumeBorewellWater() {
        assertEquals(0, (new Helper(1, 1, 1)).totalConsumeBorewellWater());
        assertThrows(ArithmeticException.class, () -> (new Helper(-1, 1, 1)).totalConsumeBorewellWater());
    }

    @Test
    void testTotalWaterConsume() {
        assertEquals(0, (new Helper(1, 1, 1)).totalWaterConsume());
        assertThrows(ArithmeticException.class, () -> (new Helper(-1, 1, 1)).totalWaterConsume());
    }

    @Test
    void testTotalBill() {
        assertEquals(0, (new Helper(1, 1, 1)).totalBill());
        assertThrows(ArithmeticException.class, () -> (new Helper(-1, 1, 1)).totalBill());
    }
}

