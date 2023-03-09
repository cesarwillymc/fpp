package prog5;

interface Polygon {
    default int getNumberOfSides() {
        return getArrayOfSides().length;
    }

    default double computePerimeter() {
        return sum(getArrayOfSides());
    }

    ;

    public double[] getArrayOfSides();

    static double sum(double[] arr) {
        double tempSum = 0;
        for (double value :
                arr) {
            tempSum += value;
        }
        return tempSum;
    }
}
