package prog4;

public class Test2 {

    public static void main(String[] args) {

        Polygon[] objects = {
                new Rectangle(3, 4),
                new Triangle(4, 5, 6),
                new Square(3)
        };
        //compute areas
        for (Polygon cc : objects) {
            System.out.println("The this  " + cc.getClass().getSimpleName());
            System.out.println("\tNumber of sides= " + cc.getNumberOfSides());
            System.out.println("\tPerimeter= " + cc.computePerimeter());
        }

    }

}