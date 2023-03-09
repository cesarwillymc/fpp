package prog3;

import java.util.Arrays;
import java.util.StringJoiner;

public class MyStringList {
    private final int INITIAL_LENGTH = 2;
    private String[] strArray;
    private int size;

    public MyStringList() {
        strArray = new String[INITIAL_LENGTH];
        size = 0;
    }

    public void add(String s) {
        //implement
        if (size >= strArray.length)
            resize();
        strArray[size] = s;
        size++;
    }

    public String get(int i) {
        //implement
        for (int index = 0, counterNull = 0; index < strArray.length; index++) {
            if (strArray[index] == null) {
                counterNull++;
            }
            if ((index - counterNull) == i && strArray[index] != null) {
                return strArray[index];
            }
        }
        return null;
    }

    public boolean find(String s) {
        for (String word : strArray) {
            if (word.equals(s))
                return true;
        }
        return false;
    }

    public boolean remove(String s) {
        boolean result = find(s);
        if (result) {
            size--;
            for (int index = 0; index <= strArray.length; index++) {
                if (strArray[index].equals(s)) {
                    strArray[index] = null;
                    break;
                }
            }
        }
        return result;
    }


    private void resize() {
        System.out.println("Resizing...");
        //implement
        int newSize = size * 2;
        String[] temp = new String[newSize];
        System.arraycopy(strArray, 0, temp, 0, size());
        strArray = temp;

    }

    public String toString() {
        StringJoiner joiner = new StringJoiner(",", "[", "]");
        //implement
        for (String word : strArray) {
            if (word != null)
                joiner.add(word);
        }
        return joiner.toString();
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {
        MyStringList l = new MyStringList();
        l.add("Bob");
        System.out.println("The list of size " + l.get(1) + " is " + l);
        l.add("Steve");
        System.out.println("The list of size " + l.size() + " is " + l);
        l.add("Susan");
        System.out.println("The list of size " + l.size() + " is " + l);
        l.add("Mark");
        System.out.println("The list of size " + l.size() + " is " + l);
        l.add("Dave");
        System.out.println("The list of size " + l.size() + " is " + l);
        l.remove("Mark");
        System.out.println("The list of size " + l.size() + " is " + l);
        l.remove("Bob");
        System.out.println("The list of size " + l.get(2) + " is " + l);
    }

}

/*
private final int INITIAL_LENGTH = 1;
    private String[] strArray;
    private int size;

    public MyStringList() {
        strArray = new String[INITIAL_LENGTH];
        size = 0;
    }

    public void add(String s) {
        //implement
        if (size >= strArray.length)
            resize();
        strArray[size] = s;
        size++;
    }

    public String get(int i) {
        //implement
        return strArray[i];
    }

    public boolean find(String s) {
        for (String word : strArray) {
            if (word.equals(s))
                return true;
        }
        return false;
    }

    public boolean remove(String s) {
        boolean result = find(s);
        if (result) {
            size--;
            String[] tempArr = new String[size];
            for (int index = 0, add = 0; index < strArray.length; index++) {
                if (!strArray[index].equals(s)) {
                    tempArr[add] = strArray[index];
                    add++;
                }
            }
            strArray = tempArr;
        }
        return result;
    }

    private void resize() {
        System.out.println("Resizing...");
        //implement
        int newSize = size + 1;
        String[] temp = new String[newSize];
        System.arraycopy(strArray, 0, temp, 0, size());
        strArray = temp;

    }

    public String toString() {
        StringJoiner joiner = new StringJoiner(",", "[", "]");
        //implement
        for (String word : strArray) {
            joiner.add(word);
        }
        return joiner.toString();
    }

    public int size() {
        return size;
    }
 */
/*
private final int INITIAL_LENGTH = 2;
    private String[] strArray;
    private int size;

    public MyStringList() {
        strArray = new String[INITIAL_LENGTH];
        size = 0;
    }

    public void add(String s) {
        //implement
        if (size >= strArray.length)
            resize();
        strArray[size] = s;
        size++;
    }

    public String get(int i) {
        //implement
        for (int index = 0, counterNull =0; index < strArray.length; index++) {
            if( strArray[index] == null){
                counterNull++;
            }
            if ((index-counterNull) == i && strArray[index] != null) {
                return strArray[index];
            }
        }
        return null;
    }

    public boolean find(String s) {
        for (String word : strArray) {
            if (word.equals(s))
                return true;
        }
        return false;
    }

    public boolean remove(String s) {
        boolean result = find(s);
        if (result) {
            size--;
            for (int index = 0; index <= strArray.length; index++) {
                if (strArray[index].equals(s)) {
                    strArray[index] = null;
                    break;
                }
            }
        }
        return result;
    }


    private void resize() {
        System.out.println("Resizing...");
        //implement
        int newSize = size * 2;
        String[] temp = new String[newSize];
        System.arraycopy(strArray, 0, temp, 0, size());
        strArray = temp;

    }

    public String toString() {
        StringJoiner joiner = new StringJoiner(",", "[", "]");
        //implement
        for (String word : strArray) {

                joiner.add(word);
        }
        return joiner.toString();
    }

    public int size() {
        return size;
    }

 */