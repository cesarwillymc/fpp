import com.sun.tools.javac.Main;

public class main {
    public static void main(String[] args) {
        main m = new main();
        int bigNum = m.hashCode();
       int  index = m.hash(bigNum);
        System.out.println(bigNum);
        System.out.println(index);
    }

    private int hash(int bigNum) {
        return (int)bigNum % 10; }
    @Override
    public int hashCode() {
        int result = 7;
        result += 11 * result + 1;
        return result;
    }
}
