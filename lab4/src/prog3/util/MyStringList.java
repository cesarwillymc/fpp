package prog3.util;

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

}
