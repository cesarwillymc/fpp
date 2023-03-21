package prog1.closedcurve.good;

public class Circle extends ClosedCurve {
    double radius;

    public Circle(Double radius) throws IllegalClosedCurveException {
        this(radius.doubleValue());
    }

    public Circle(double radius) throws IllegalClosedCurveException {
        if (radius < 0)
            throw new IllegalClosedCurveException("The parameters cannot be negative");
        this.radius = radius;
    }

    double computeArea() {
        return (Math.PI * radius * radius);
    }
}
