package prog2;

import java.util.HashSet;

public class Util {
    public static String reverse(String word) {
        if (word.length()==0) {
            return "";
        }
        return  reverse(word.substring(1))+word.charAt(0) ;
    }

    public static String removeDuplicate(String word) {
        HashSet<Character> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (!set.contains(c)) {
                set.add(c);
                sb.append(c);
            }
        }

        return sb.toString();
    }

    public static int counterLetter(String word) {
        return word.length();
    }
}
