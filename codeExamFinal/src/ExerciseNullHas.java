import java.util.HashMap;

public class ExerciseNullHas {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(201,190);
        map.put(210,199);
        map.put(206,180);
        map.put(203,190);
        map.put(209,20);
        map.put(null,null);
        for (Integer val :map.keySet()){
            System.out.println(map.get(val));
            if(val!=null)
            System.out.println("hash: "+ hash(val.hashCode())%16+" and key: "+val);
        }

        System.out.println("SIze: "+ map.size());
    }


    static public int hash(int key) {
        int result = 17;
        result += 31 * result + key;
        return result;
    }

   /*
    static final int hash(Integer key) {
        int h;
        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
    }
    */

}
