package prog3.employeeinfo;

public class RetirementAccount extends  Account{
    RetirementAccount(  double balance) {
        super( balance);
    }

    RetirementAccount() {
        super();
    }

    @Override
    public AccountType getAcctType() {
        return AccountType.RETIREMENT;
    }

    @Override
    public boolean makeWithdrawal(double amount) {
        boolean wasPossibleWithdraw;
        double currentBalance = getBalance();
        double penalty = (currentBalance - (currentBalance * 0.02));
        wasPossibleWithdraw = super.makeWithdrawal(amount + penalty);
        if (!wasPossibleWithdraw) {
            System.out.println("It's not possible to do withdraw");
        }
        return wasPossibleWithdraw;
    }
}
