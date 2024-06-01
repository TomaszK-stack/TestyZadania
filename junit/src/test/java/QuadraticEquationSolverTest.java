import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuadraticEquationSolverTest {

    @Test
    public void testTwoRealSolutions() {
        QuadraticEquationResult result = QuadraticEquationSolver.solve(1, -3, 2);
        assertTrue(result.hasRealSolution());
        assertEquals(2.0, result.getX1(), 0.0001);
        assertEquals(1.0, result.getX2(), 0.0001);
    }

    @Test
    public void testOneRealSolution() {
        QuadraticEquationResult result = QuadraticEquationSolver.solve(1, -2, 1);
        assertTrue(result.hasRealSolution());
        assertEquals(1.0, result.getX1(), 0.0001);
        assertEquals(1.0, result.getX2(), 0.0001);
    }

    @Test
    public void testNoRealSolution() {
        QuadraticEquationResult result = QuadraticEquationSolver.solve(1, 2, 3);
        assertFalse(result.hasRealSolution());
    }

    @Test
    public void testZeroA() {
        QuadraticEquationResult result = QuadraticEquationSolver.solve(0, 2, 3);
        assertTrue(result.hasRealSolution());
        assertEquals(-1.5, result.getX1(), 0.0001);
    }

    @Test
    public void testZeroAAndB() {
        QuadraticEquationResult result = QuadraticEquationSolver.solve(0, 0, 3);
        assertFalse(result.hasRealSolution());
    }
}
