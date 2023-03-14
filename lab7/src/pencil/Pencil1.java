package pencil;

import java.util.Random;

/**
 * if in the conditional add "|| s.equals("")" the return is null, but in this case the error is STACKOVERFLOW
 */
public class Pencil1 {
    public static void main(String[] args) {

        new Pencil1();
    }

    Pencil1() {
        System.out.println(recurse("Hello"));
     /*
        String word = "Hello";
        word=word.substring(0,word.length()/2);
        System.out.println(word);
        word=word.substring(0,word.length()/2);
        System.out.println(word);
        word=word.substring(0,word.length()/2);
        System.out.println(word);
      */
    }

    String recurse(String s) {
        if (s == null) return null;
        int r = new Random().nextInt(90) + 10;
        int n = s.length();
        if (r % 2 == 0) {
            return recurse(s.substring(0, n / 2));
        } else {
            return recurse(s.substring(n / 2, n));
        }
    }
}
