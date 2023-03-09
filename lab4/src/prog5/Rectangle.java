package prog5;

public class Rectangle extends ClosedCurve implements Polygon {
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    double computeArea() {
        return getLength() * getWidth();
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double[] getArrayOfSides() {
        return new double[]{width,width,length,length};
    }
}
