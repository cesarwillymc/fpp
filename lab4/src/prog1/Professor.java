package prog1;

public class Professor extends DeptEmployee {
    private int numberOfPublications;

    public Professor(String name, double salary, int day, int month, int year, int numberOfPublications) {
        super(name, salary, day, month, year);
        this.numberOfPublications = numberOfPublications;
    }

    public int getNumberOfPublications() {
        return numberOfPublications;
    }

    public void setNumberOfPublications(int numberOfPublications) {
        this.numberOfPublications = numberOfPublications;
    }
}
