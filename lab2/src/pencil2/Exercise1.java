package pencil2;

/**
 * 1. Consider the following if…then logic:
 * if(age > 65) socialSecurityStatus = "eligible";
 * else socialSecurityStatus = "ineligible";
 * Rewrite this (pseudo) code using the Java ternary operator.
 */
public class Exercise1 {
    public static void main(String[] args) {
        int age=22;
        String socialSecurityStatus = (age>65)?"eligible":"ineligible";;
    }
}
