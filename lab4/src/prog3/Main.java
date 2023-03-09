package prog3;


import prog3.employeeinfo.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    Employee[] emps ;

    public static void main(String[] args) {
        new Main();
    }

    Main() {
        emps = new Employee[3];
        emps[0] = new Employee("Jim Daley", 2000, 9, 4);
        emps[1] = new Employee("Bob Reuben", 1998, 1, 5);
        emps[2] = new Employee("Susan Randolph", 1997, 2, 13);

        emps[0].createNewChecking(10500);
        emps[0].createNewSavings(1000);
        emps[0].createNewRetirement(9300);
        emps[1].createNewChecking(34000);
        emps[1].createNewSavings(27000);
        emps[2].createNewChecking(10038);
        emps[2].createNewSavings(12600);
        emps[2].createNewRetirement(9000);


        Scanner sc = new Scanner(System.in);
        String answer;

        do {
            System.out.println("A. See a report of all accounts.");
            System.out.println("B. Make a deposit.");
            System.out.println("C. Make a withdrawal.");
            System.out.print("Make a selection (A/B/C): ");
            answer = sc.next().toUpperCase(Locale.ROOT);
            switch (answer) {
                case "A":
                    String info = getFormattedAccountInfo();
                    System.out.println(info);
                    break;
                case "B":
                    for (int index = 0; index < emps.length; index++) {
                        System.out.println(index + ". " + emps[index].getName());
                    }
                    int indexEmployee;
                    do {
                        System.out.print("Select an employee: (type aa number): ");
                        indexEmployee = sc.nextInt();
                    } while (indexEmployee < 0 || indexEmployee >= emps.length);
                    Employee currentEmployee = emps[indexEmployee];
                    for (int index = 0; index < currentEmployee.getNamesOfAccounts().size(); index++) {
                        System.out.println(index + ". " + currentEmployee.getNamesOfAccounts().get(index));
                    }
                    int indexAccount;
                    do {
                        System.out.print("Select an account: (type a number): ");
                        indexAccount = sc.nextInt();
                    } while (indexAccount < 0 || indexAccount >= currentEmployee.getNamesOfAccounts().size());
                    System.out.print("Deposit amount: ");
                    double amount = sc.nextDouble();
                    if (amount > 0) {
                        currentEmployee.deposit(indexAccount, amount);
                        System.out.println("$" + amount + " has been deposited in the savings account of " + currentEmployee.getName());
                    } else {
                        System.out.println("Error amount incorrect");
                    }
                    break;
                case "C":
                    System.out.println("Not available");
                    break;
            }
        } while (!answer.equals("S"));
        sc.close();

    }

    String getFormattedAccountInfo() {
        //loop through employees array and get formatted
        //account info for each employee, and assemble into a string
        String result = "";

        for (Employee tempEmp : emps) {
            result += tempEmp.getFormattedAcctInfo() + "\n";
        }


        return result;
    }
}
