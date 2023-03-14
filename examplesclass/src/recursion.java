import java.util.Arrays;

public class recursion {
    static int sumArray(int[] numbers) {
        if (numbers.length == 1)
            return numbers[0];
        return sumArray(Arrays.copyOfRange(numbers, 1, numbers.length)) + numbers[0];
    }


    static int sumArray(int[] numbers, int min, int max) {
        if (min > max) // zero elements in subarray
            return 0;
        else if (min == max) // one element in subarray
            return numbers[min];
        else {
            int mid = (min + max) / 2;
            return sumArray(numbers, min, mid) + sumArray(numbers, mid + 1, max);
        }
    }

    static int fib(int n) {
        if (n == 0 || n == 1)
            return n;
        int current = 0;
        int next = 1;
        for (int index = 0; index < n; index++) {
            int temp = current;
            current = next;
            next = temp + next;
        }
        return current;
    }


    public static void main(String[] args) {
        System.out.println(fib(20));
    }
}
