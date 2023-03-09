package prog4;

public class Circle implements Shape{
    final private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double computeArea()
    {
        return Math.PI * radius * radius;
    }
}
