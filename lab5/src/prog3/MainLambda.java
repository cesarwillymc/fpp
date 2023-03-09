package prog3;

import java.util.Arrays;

public class MainLambda {
    public static void main(String[] args) {

        boolean ascending = false;
        String[] testStrings = {"andy", "mike", "joe", "allen", "stephan"};
        new StringSort((o1, o2) -> ascending ? (o1.length() - o2.length()) :
                (o2.length() - o1.length())).stringSort(testStrings);

        System.out.println(Arrays.asList(testStrings));
    }
}
