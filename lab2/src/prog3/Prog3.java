package prog3;

public class Prog3 {
    public static void main(String[] args) {
        float a = 1.27f;
        float b = 3.881f;
        float c = 9.6f;

        int result1 = (int) a + (int) b + (int) c;
        int result2 = Math.round(a) + Math.round(b) + Math.round(c);
        System.out.println(result1);
        System.out.println(result2);
    }
}
