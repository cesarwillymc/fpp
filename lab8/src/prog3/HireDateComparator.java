package prog3;

import java.util.Comparator;

public class HireDateComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        if(o1.getHireDate().before(o2.getHireDate())){
            return -1;
        }else if (o1.getHireDate().after(o2.getHireDate())){
            return 1;
        }else{
            return 0;
        }
    }
}
