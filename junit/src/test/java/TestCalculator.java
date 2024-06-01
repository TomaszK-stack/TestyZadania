import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

public class TestCalculator {

    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testAdd() {
        assertEquals(3, calculator.add(1, 2));
        assertEquals(0, calculator.add(-1, 1));
        assertEquals(-2, calculator.add(-1, -1));
    }

    @Test
    public void testSubtract() {
        assertEquals(5, calculator.subtract(10, 5));
        assertEquals(-2, calculator.subtract(-1, 1));
        assertEquals(0, calculator.subtract(-1, -1));
    }

    @Test
    public void testMultiply() {
        assertEquals(21, calculator.multiply(3, 7));
        assertEquals(-1, calculator.multiply(-1, 1));
        assertEquals(1, calculator.multiply(-1, -1));
    }

    @Test
    public void testDivide() {
        assertEquals(5, calculator.divide(10, 2), 0);
        assertEquals(-5, calculator.divide(-10, 2), 0);
        assertEquals(5, calculator.divide(-10, -2), 0);


        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(10, 0);
        });

        assertEquals("Cannot divide by zero.", exception.getMessage());
    }
}
