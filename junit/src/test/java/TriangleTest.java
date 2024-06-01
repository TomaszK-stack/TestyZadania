import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TriangleTest {

    @Test
    public void testValidTriangle() {
        Triangle triangle = new Triangle(3, 4, 5);
        assertEquals(6.0, triangle.getArea(), 0.0001);
    }

    @Test
    public void testAnotherValidTriangle() {
        Triangle triangle = new Triangle(6, 8, 10);
        assertEquals(24.0, triangle.getArea(), 0.0001);
    }

    @Test
    public void testInvalidTriangle() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Triangle(1, 2, 3);
        });
        assertEquals("The provided sides do not form a valid triangle.", exception.getMessage());
    }

    @Test
    public void testAnotherInvalidTriangle() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Triangle(1, 1, 2);
        });
        assertEquals("The provided sides do not form a valid triangle.", exception.getMessage());
    }

    @Test
    public void testZeroSideLength() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Triangle(0, 4, 5);
        });
        assertEquals("The provided sides do not form a valid triangle.", exception.getMessage());
    }

    @Test
    public void testNegativeSideLength() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Triangle(-3, 4, 5);
        });
        assertEquals("The provided sides do not form a valid triangle.", exception.getMessage());
    }
}
