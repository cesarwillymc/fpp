package prog1;

import java.util.Date;
import java.util.GregorianCalendar;

public class DeptEmployee {
    private String name;
    private double salary;
    private Date hireDate;

    public DeptEmployee(String name, double salary, int day, int month, int year) {
        this.name = name;
        this.salary = salary;
        setHireDate(day, month, year);
    }

    public Date getHireDate() {
        return (Date) hireDate.clone();
    }

    public void setHireDate(int day, int month, int year) {
        this.hireDate = new GregorianCalendar(year, month, day).getTime();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double computeSalary() {
        return salary;
    }

    ;
}
