package prog2;

public class MinSort {
    String sort(String s) {
        if (s.length() < 2) {
            return s;
        }
        int index = 0;
        char minLetter = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            char current = s.charAt(i);
            if (current < minLetter) {
                minLetter = current;
                index = i;
            }
        }


        return minLetter + sort(s.substring(0, index) + s.substring(index + 1));
    }
    public static void main(String[] args) {
        MinSort ms = new MinSort();
        String result = ms.sort("zwxuabfkafutbbbb");
        System.out.println(result);
    }
}
