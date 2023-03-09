package prog3.employeeinfo;

public class CheckingAccount extends Account {
    CheckingAccount(double balance) {
        super(balance);
    }

    CheckingAccount() {
        super();
    }

    @Override
    public double getBalance() {
        setBalance(super.getBalance() - 5);
        return super.getBalance();
    }

    @Override
    public AccountType getAcctType() {
        return AccountType.CHECKING;
    }
}
