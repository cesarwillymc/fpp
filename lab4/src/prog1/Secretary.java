package prog1;

public class Secretary extends DeptEmployee {
    private double overtimeHours;

    public Secretary(String name, double salary, int day, int month, int year, double overtimeHours) {
        super(name, salary, day, month, year);
        this.overtimeHours = overtimeHours;
    }

    public double getOvertimeHours() {
        return overtimeHours;
    }

    public void setOvertimeHours(double overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    @Override
    public double computeSalary() {
        return super.computeSalary() + (12 * getOvertimeHours());
    }
}
