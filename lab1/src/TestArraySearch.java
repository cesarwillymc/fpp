
import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class TestArraySearch {
    @Test
    /*The target is the first element in the array */
    public void testSearch1() {
        int[] testArray = {8, 2, 8};
        int target = 8;
        int result = ArraySearch.search(testArray, target);
        int expected = 0;
        assertEquals(expected, result);
    }

    @Test
    /*. The target is the last element in the array. */
    public void testSearch2() {
        int[] testArray = {1, 2, 3};
        int target = 3;
        int result = ArraySearch.search(testArray, target);
        int expected = 2;
        assertEquals(expected, result);
    }

    @Test
    /* The target is somewhere in the middle.*/
    public void testSearch3() {
        int[] testArray = {1, 2, 3,4,5};
        int target = 3;
        int result = ArraySearch.search(testArray, target);
        int expected = 2;
        assertEquals(expected, result);
    }

    @Test
    /* The target element is not in the array.*/
    public void testSearch4() {
        int[] testArray = {1, 2, 3};
        int target = 4;
        int result = ArraySearch.search(testArray, target);
        int expected = -1;
        assertEquals(expected, result);
    }

    @Test
    /* There is more than one occurrence of the target element and we find the first occurrence.*/
    public void testSearch5() {
        int[] testArray = {1, 2, 3,4,6,1,2};
        int target = 2;
        int result = ArraySearch.search(testArray, target);
        int expected = 1;
        assertEquals(expected, result);
    }

    @Test
    /* The array has only one element and it is not the target.*/
    public void testSearch6() {
        int[] testArray = {1};
        int target = 4;
        int result = ArraySearch.search(testArray, target);
        int expected = -1;
        assertEquals(expected, result);
    }

    @Test
    /*  The array has only one element and it is the target.*/
    public void testSearch7() {
        int[] testArray = {1};
        int target = 1;
        int result = ArraySearch.search(testArray, target);
        int expected = 0;
        assertEquals(expected, result);
    }

    @Test
    /* The array has no elements. */
    public void testSearch8() {
        int[] testArray = {};
        int target = 1;
        int result = ArraySearch.search(testArray, target);
        int expected = -1;
        assertEquals(expected, result);
    }
}
