package prog6.case3;

import java.util.GregorianCalendar;

public class PersonWithJob {
    private double salary;
    private Person person;

    PersonWithJob(String name, GregorianCalendar dob, double salary) {
        person = new Person(name, dob);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public boolean equals(Object ob) {
        if (ob == null) return false;
        if ((ob instanceof PersonWithJob)) return false;
        PersonWithJob p = (PersonWithJob) ob;
        return p.person.equals(person) && p.getSalary() == getSalary();
    }
}
