package prog6.case2;

import java.util.GregorianCalendar;

public class PersonWithJob extends Person {
	private double salary;
	PersonWithJob(String name, GregorianCalendar dob, double salary) {
		super(name, dob);
		this.salary = salary;
	}
	public double getSalary() {
		return salary;
	}
	public boolean equals(Object ob) {
		if(ob == null) return false;
		if(!(ob instanceof PersonWithJob)) return false;
		PersonWithJob p = (PersonWithJob)ob;
		return p.getName().equals(getName()) && p.getDateOfBirth().equals(getDateOfBirth()) && p.getSalary() == getSalary();
	}
}
