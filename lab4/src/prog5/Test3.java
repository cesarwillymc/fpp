package prog5;

public class Test3 {

    public static void main(String[] args) {

        Polygon[] objects = {
                new Rectangle(3, 4),
                new Triangle(4, 5, 6),
                new Square(3)
        };
        //compute areas
        for (Polygon cc : objects) {
            System.out.println("For this  " + cc.getClass().getSimpleName());
            System.out.println("\tPerimeter= " + cc.computePerimeter());
        }

    }

}