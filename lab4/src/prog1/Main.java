package prog1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Prof1", 200, 7, 11, 1998, 10);
        Professor professor2 = new Professor("Prof2", 400, 8, 11, 2000, 10);
        Professor professor3 = new Professor("Prof3", 600, 10, 11, 1900, 10);
        Secretary secretary1 = new Secretary("secretary1", 50, 11, 1, 1992, 200);
        Secretary secretary2 = new Secretary("secretary2", 100, 1, 1, 1991, 200);

        DeptEmployee[] employees = {professor1, professor2, professor3, secretary1, secretary2};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to see the sum of the salaries of the employees?: ");
        String answer = scanner.next();
        if (answer.equals("Y") || answer.equals("y")) {
            double sumOfSalaries = 0;
            for (DeptEmployee employee : employees) {
                System.out.println("For " + employee.getName() + " his salary is: " + employee.computeSalary());
                sumOfSalaries += employee.computeSalary();
            }
            System.out.println("**********************************");
            System.out.println("The sum of the salaries is: " + sumOfSalaries);
        } else {
            System.out.println("Close the program");
        }
    }
}
