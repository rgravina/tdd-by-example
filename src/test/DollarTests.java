import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


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

    @Test
    void testEquality() {
        assertEquals(new Dollar(5), new Dollar(5));
        assertNotEquals(new Dollar(5), new Dollar(6));
    }
}