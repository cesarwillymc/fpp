public class ArraySearch {
    public static void main(String[] args) {
        System.out.println(search(new int[]{1,2,3},2));
    }
    public static int search(int arr[], int target){
        for(int index =0;index<arr.length;index++){
            if(arr[index]==target) return index;
        }
        return -1;
    }
}