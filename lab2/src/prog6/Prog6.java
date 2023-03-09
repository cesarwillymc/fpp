package prog6;

import java.util.Arrays;

public class Prog6 {
    public static void main(String[] args) {

    }

    public static String[] removeDups(String[] arr) {
        String[] newArr = new String[arr.length];
        int count = 0;
        for (String str : arr) {
            if (!contains(newArr, str)) {
                newArr[count] = str;
                count++;
            }
        }
        String[] result = new String[count];

        for (int index = 0; index < count; index++) {
            result[index] = newArr[index];
        }
        System.out.println(count);
        return result;
    }

    public static boolean contains(String[] arr, String str) {
        for (String s : arr) {
            if (s != null && s.equals(str)) {
                return true;
            }
        }
        return false;
    }
   /*
    static String[] removeDups(String[] arr){
        List<String> data = new ArrayList<>();
        for (String value: arr) {
            if(!data.contains(value)){
                data.add(value);
            }
        }
        return data.toArray(new String[0]);
    }
    */
}
