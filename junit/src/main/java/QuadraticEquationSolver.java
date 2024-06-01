public class QuadraticEquationSolver {

    public static QuadraticEquationResult solve(double a, double b, double c) {
        double delta = b * b - 4 * a * c;

        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new QuadraticEquationResult(x1, x2);
        } else if (delta == 0) {
            double x = -b / (2 * a);
            return new QuadraticEquationResult(x);
        } else {
            return new QuadraticEquationResult();
        }
    }
}
