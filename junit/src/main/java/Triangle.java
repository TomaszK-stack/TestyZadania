public class Triangle {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        if (!isValidTriangle(a, b, c)) {
            throw new IllegalArgumentException("The provided sides do not form a valid triangle.");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getArea() {
        double s = (a + b + c) / 2; // Semiperimeter
        return Math.sqrt(s * (s - a) * (s - b) * (s - c)); // Heron's formula
    }

    private boolean isValidTriangle(double a, double b, double c) {
        // Triangle inequality theorem
        return a + b > c && a + c > b && b + c > a;
    }
}
