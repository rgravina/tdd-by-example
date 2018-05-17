import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DollarTests {
    @Test
    void testMultiplication() {
       Dollar five = new Dollar(5);
       assertEquals(10, five.times(2).amount);
    }

    @Test
    void testMultiplicationMultipleTimes() {
        Dollar five = new Dollar(5);
        assertEquals(10, five.times(2).amount);
        assertEquals(15, five.times(3).amount);
    }
}