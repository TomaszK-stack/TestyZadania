public class QuadraticEquationResult {
    private double x1;
    private double x2;
    private boolean real;

    public QuadraticEquationResult(double x1, double x2) {
        this.x1 = x1;
        this.x2 = x2;
        this.real = true;
    }

    public QuadraticEquationResult(double x) {
        this.x1 = x;
        this.real = true;
    }

    public QuadraticEquationResult() {
        this.real = false;
    }

    public double getX1() {
        return x1;
    }

    public double getX2() {
        return x2;
    }

    public boolean hasRealSolution() {
        return real;
    }
}
