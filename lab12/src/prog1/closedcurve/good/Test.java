package prog1.closedcurve.good;

public class Test {

    public static void main(String[] args) {

        ClosedCurve[] objects;
        try {
            objects = new ClosedCurve[]{new Triangle(4, 4, 6),
                    new Square(3),
                    new Rectangle(-3, 7),
                    new Circle(3)};
            //compute areas
            for (ClosedCurve cc : objects) {
                String nameOfCurve = getClassNameNoPackage(cc.getClass());

                System.out.println("The area of this " +
                        nameOfCurve +
                        " is " +
                        cc.computeArea());

            }
        } catch (IllegalClosedCurveException e) {
            String[] nameClass = e.getStackTrace()[0].getClassName().split("\\.");
            System.out.println("An " + getClassNameNoPackage(e.getClass()) + " was thrown in a " + nameClass[nameClass.length - 1] + " instance.");
        }
    }

    public static String getClassNameNoPackage(Class aClass) {
        String fullClassName = aClass.getName();
        int index = fullClassName.lastIndexOf('.');
        String className = null;
        String packageName = null;


        //in this case, there is no package name
        if (index == -1) {
            return fullClassName;
        } else {
            //for other apps, may be useful to have this
            packageName = fullClassName.substring(0, index);

            className = fullClassName.substring(index + 1);
            return className;
        }


    }

}
