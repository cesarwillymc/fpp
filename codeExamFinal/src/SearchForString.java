
/**
 * Fully implement the methods in the SearchForString class, shown below.
 * The class SearchForString has one instance variable String[] arr,
 * one constructor with signature
 * SearchForString(String[] arr)
 * and one instance method
 *                public boolean search(String s)
 * The constructor should set its value in the instance variable of the class.
 * The method search should be a recursive implementation of a search for the input argument s in the array arr;
 * if s is found, the method should return true; false otherwise.
 * The method must implement the following recursive strategy:
 * Compare s to arr[len-1] (where len is the length of arr). If they are equal, return true. Otherwise,
 * (recursively) search for s in the rest of the array.
 * You may safely assume that arr contains only non-null Strings and that the argument s passed in to search is never null.
 * You must not assume that the Strings in arr are in sorted order.
 * To complete the problem, complete the work in the class SearchForString that has already been partially coded.
 * A private instance method recurSearch, having two arguments
 * (s and an integer argument upperIndex) has been included in SearchForString;
 * you must make use of this method to do the actual recursion.
 */
public class SearchForString {
    private String[] arr;

    public SearchForString(String[] arr) {
        this.arr = arr;
    }

    public boolean search(String s) {
        return recurSearch(s, arr.length - 1);
    }

    private boolean recurSearch(String s, int upperIndex) {
        if (upperIndex < 0) {
            return false;
        } else if (s.equals(arr[upperIndex])) {
            return true;
        } else {
            return recurSearch(s, upperIndex - 1);
        }
    }
}