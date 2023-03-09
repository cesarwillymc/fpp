package prog8;

public class Prog8 {
    public static void main(String[] args) {

    }

    public static int min(int[] arrayOfInts) {
        int minValue = arrayOfInts[0];
        for (int number : arrayOfInts) {
            if (number < minValue) minValue = number;
        }
        return minValue;
    }
}
