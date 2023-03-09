package prog3.employeeinfo;

public class SavingsAccount extends Account {
    SavingsAccount( double balance) {
        super(balance);
    }

    SavingsAccount() {
        super();
    }

    @Override
    public double getBalance() {
        setBalance(super.getBalance() + (super.getBalance() * 0.0025));
        return super.getBalance();
    }

    @Override
    public AccountType getAcctType() {
        return AccountType.SAVINGS;
    }
}
