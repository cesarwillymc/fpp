package prog4;

public class Prog4 {
    public static void main(String[] args) {
        String myData = Data.records;

        String[] columns= myData.split(":");
        for(String column: columns){
            String[] rows = column.split(",");
            System.out.println(rows[0]);
        }
    }
}
