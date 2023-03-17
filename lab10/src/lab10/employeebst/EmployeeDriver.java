package lab10.employeebst;

import lab10.bst.EmployeeBST;

public class EmployeeDriver {

    public static void main(String[] args) {
        new EmployeeDriver();

    }

    public EmployeeDriver() {
        NameComparator nameComp = new NameComparator();
        EmployeeBST bst = new EmployeeBST(nameComp);

        bst.insert(new Employee("George", 40000, 1996, 11, 5));
        bst.insert(new Employee("Dave", 50000, 2000, 1, 3));
        bst.insert(new Employee("Sally", 45000, 2001, 2, 7));
        bst.insert(new Employee("Jorge", 45000, 2001, 2, 7));
        bst.insert(new Employee("Cesar", 45000, 2001, 2, 7));
        bst.insert(new Employee("Willy", 45000, 2001, 2, 7));
        bst.insert(new Employee("Mmani", 45000, 2001, 2, 7));
        bst.insert(new Employee("Canaza", 45000, 2001, 2, 7));
        bst.insert(new Employee("Hirayda", 45000, 2001, 2, 7));
        bst.insert(new Employee("Richard", 80000, 1986, 3, 23));

        bst.insert(new Employee("Edison", 80000, 1986, 3, 23));
        bst.insert(new Employee("Casandra", 80000, 1986, 3, 23));
        bst.insert(new Employee("Elias", 80000, 1986, 3, 23));


      /*
        bst.insert(new Employee("Hirayda", 40000, 1996, 11, 5));
        bst.insert(new Employee("Me", 50000, 2000, 1, 3));
        bst.insert(new Employee("Haces", 45000, 2001, 2, 7));
        bst.insert(new Employee("Renegar", 45000, 2001, 2, 7));
        bst.insert(new Employee("Full", 45000, 2001, 2, 7));
        bst.insert(new Employee("No", 45000, 2001, 2, 7));
        bst.insert(new Employee("Se ", 45000, 2001, 2, 7));
        bst.insert(new Employee("Por", 45000, 2001, 2, 7));
        bst.insert(new Employee("que", 45000, 2001, 2, 7));
       */

        bst.printTree();
        bst.printAsDiagram();

    }
}
