package pencil2;

/**
 * 2. Suppose a String s is initialized by
 * String s = "a friendly face";
 *
 * a. Compute the value of the expression
 *  -- s.charAt(2) = f
 *
 * b. What is the value of
 *  -- s.length() = 15
 *
 * c. What is the value of
 *
 *  -- s.substring(2,9) = friendl
 *  -- s.substring(4) = iendly face
 */
public class Exercise2 {
    public static void main(String[] args) {
        String s = "a friendly face";
        s.charAt(2); // f
        s.length(); // 15
        s.substring(2,9) ; // friendl
        s.substring(4); // iendly face
    }
}
