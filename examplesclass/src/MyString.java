import java.util.Arrays;
import java.util.Comparator;

/*public class MyString implements Comparable<MyString> {
    private String aString;

    MyString(String s) {
        aString = s;
    }


    public String toString() {
        return aString;
    }

    @Override
    public int compareTo(MyString s) {
        if (this.aString.length() < s.aString.length()) {
            return -1;
        } else if (this.aString.length() > s.aString.length()) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        MyString[] myStrings = {
                new MyString("Bob"),
                new MyString("Andrew"),
                new MyString("Charles")};

        Arrays.sort(myStrings);
        System.out.println(Arrays.toString(myStrings));
    }


}
*/

public class MyString implements Comparable<MyString> {
    private String aString;

    MyString(String s) {
        aString = s;
    }


    public String toString() {
        return aString;
    }

   /*
    @Override
    public int compareTo(MyString s) {
        return this.aString.compareTo(s.aString);
    }
    */
    @Override
    public int compareTo(MyString s){
        if (this.aString.length() < s.aString.length()) {
            return 0;
        } else if (this.aString.length() > s.aString.length()) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        MyString[] myStrings = {
                new MyString("Bob"),
                new MyString("Andrew"),
                new MyString("Charles")
        };

        Arrays.sort(myStrings);
        System.out.println(Arrays.toString(myStrings));
    }
}