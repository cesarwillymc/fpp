package prog3.employeeinfo;


abstract public class Account {
    private final static double DEFAULT_BALANCE = 0.0;
    private double balance;

    Account(double balance) {
        this.balance = balance;
    }

    Account() {
        this(DEFAULT_BALANCE);
    }

    @Override
    public String toString() {
        return "\nType Account = " + getAcctType().name() + ", Type balance = " + balance;
    }

    public void makeDeposit(double deposit) {
        // implement
        balance += deposit;
    }

    public boolean makeWithdrawal(double amount) {
        if (amount > balance) {
            return false;
        }
        balance -= amount;
        return true;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    abstract public AccountType getAcctType();
}
