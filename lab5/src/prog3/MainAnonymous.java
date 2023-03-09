package prog3;

import java.util.Arrays;
import java.util.Comparator;

public class MainAnonymous {

    public static void main(String[] args) {
        Comparator<String> anonymous = new Comparator<String>() {
            boolean ascending= false;
            @Override
            public int compare(String o1, String o2) {
                return ascending ? (o1.length() - o2.length())   :
                        (o2.length() - o1.length());
            }
        }  ;

        String[] testStrings = { "andy", "mike", "joe", "allen", "stephan" };
        new StringSort(anonymous).stringSort(testStrings);

        System.out.println(Arrays.asList(testStrings));
    }
}
