package prog3.util;

import prog3.employeeinfo.Account;

import java.util.StringJoiner;

public class AccountList {
    private final int INITIAL_LENGTH = 1;
    private Account[] strArray;
    private int size;

    public AccountList() {
        strArray = new Account[INITIAL_LENGTH];
        size = 0;
    }
    public Account[] getStrArray(){
        return strArray;
    }
    public void add(Account s) {
        //implement
        if (size >= strArray.length)
            resize();
        strArray[size] = s;
        size++;
    }

    public Account get(int i) {
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

    public boolean find(Account s) {
        for (Account word : strArray) {
            if (word.equals(s))
                return true;
        }
        return false;
    }

    public boolean remove(Account s) {
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
        int newSize = size +1;
        Account[] temp = new Account[newSize];
        System.arraycopy(strArray, 0, temp, 0, size());
        strArray = temp;

    }

    public String toString() {
        StringJoiner joiner = new StringJoiner(",", "[", "]");
        //implement
        for (Account word : strArray) {
            if (word != null)
                joiner.add(word.toString());
        }
        return joiner.toString();
    }

    public int size() {
        return size;
    }

}