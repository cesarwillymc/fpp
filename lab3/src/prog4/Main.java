package prog4;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(4, 6);
        System.out.println("Area of Triangle is " + triangle.computeArea());

        Rectangle rectangle = new Rectangle(5, 5);
        System.out.println("Area of Rectangle is " + rectangle.computeArea());

        Circle circle = new Circle(10);
        System.out.println("Area of Circle is " + circle.computeArea());
    }
}
