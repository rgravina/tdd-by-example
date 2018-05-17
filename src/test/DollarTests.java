import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DollarTests {
    @Test
    void testMultiplication() {
       Dollar five = new Dollar(5);
       assertEquals(10, five.times(2));
    }

    @Test
    void testMultiplicationMultipleTimes() {
        Dollar five = new Dollar(5);
        assertEquals(10, five.times(2));
        assertEquals(15, five.times(3));
    }
}