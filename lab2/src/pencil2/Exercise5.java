package pencil2;

/**
 * 5. You are reviewing some old Java programs in your company's IT department and you
 * read the following assignment statement in some abandoned code:
 * int a = (b = 5);
 * Is the statement legal (i.e. would it compile)? If so, what value is assigned to the
 * variable a? Explain.
 */
public class Exercise5 {
    public static void main(String[] args) {
        int b =2;
        int a = (b = 5);
        System.out.println(a);

        // Its legal, for the OPERATOR PRECEDENCE,
        // first work the ""b = 5 "" because is into ""()"" and later the answer  is assigned to a ;
    }
}
