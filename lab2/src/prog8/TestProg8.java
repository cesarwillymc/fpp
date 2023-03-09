package prog8;

import org.junit.Assert;
import org.junit.Test;

public class TestProg8 {
    @Test
    public void testMin() {
        int[] arr = new int[]{2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22};
        int expect = -22;
        int result = Prog8.min(arr);
        Assert.assertEquals(expect, result);
    }
}
