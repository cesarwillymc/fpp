package prog2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Schur {
    static boolean checkForSum(List<Integer> list, Integer z) {
        List<Integer> onlyNumbersNonDuplicates = removeDuplicates(list);
        int sumTotal = 0;
        for (int number : onlyNumbersNonDuplicates) {
            sumTotal += number;
        }
        return sumTotal == z;
    }

    static List<Integer> removeDuplicates(List<Integer> list) {
        HashMap<Integer, Integer> integerHashMap = new HashMap<>();
        list.forEach(number -> {
            if (!integerHashMap.containsKey(number)) {
                integerHashMap.put(number, number);
            }
        });
        return List.copyOf(integerHashMap.values());
    }

    public static void main(String[] args) {

        System.out.println(checkForSum(Arrays.asList(1, 2, 2, 3, 4, 5, 5), 15));
        System.out.println(checkForSum(Arrays.asList(1, 2, 2, 3, 4, 5, 5), 22));
    }
}
