package prog1;

public class Exponential {
    static int power(int x, int n) {
        if (n < 0) return 0;
        if (n == 1)
            return x;
        return power(x, n - 1) * x;
    }

    public static void main(String[] args) {
        System.out.println(power(2, 0));
    }
}
