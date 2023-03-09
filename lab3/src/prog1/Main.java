package prog1;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Cesar","Will",3200,1998,7,11);
        Account accountChecking = new Account(employee,AccountType.CHECKING,300);
        Account accountSaving = new Account(employee,AccountType.SAVINGS,300);
        Account accountRetirement= new Account(employee,AccountType.RETIREMENT,300);
        Account[] accounts = {accountChecking,accountSaving,accountRetirement};
        for (Account index: accounts) {
            System.out.println(index.toString());
        }
    }
}
