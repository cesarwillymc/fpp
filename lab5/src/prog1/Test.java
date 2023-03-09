package prog1;

import org.junit.Assert;

public class Test {
    public static void main(String[] args) {
        MySingleton s1=MySingleton.getInstance();
        MySingleton s2=MySingleton.getInstance();
        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode()==s2.hashCode());
    }
}
