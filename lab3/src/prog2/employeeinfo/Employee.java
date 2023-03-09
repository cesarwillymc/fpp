package prog2.employeeinfo;


import java.time.LocalDate;

public class Employee {

    private Account savingsAcct;
    private Account checkingAcct;
    private Account retirementAcct;
    private String name;
    private LocalDate hireDate;

    public Employee(String name, int yearOfHire, int monthOfHire, int dayOfHire) {
        this.name = name;
        hireDate = LocalDate.of(yearOfHire, monthOfHire, dayOfHire);
    }


    public void createNewChecking(double startAmount) {
        checkingAcct = new Account(this, AccountType.CHECKING, startAmount);
    }

    public void createNewSavings(double startAmount) {
        // implement
        savingsAcct = new Account(this, AccountType.SAVINGS, startAmount);
    }

    public void createNewRetirement(double startAmount) {
        // implement
        retirementAcct = new Account(this, AccountType.RETIREMENT, startAmount);
    }

    public String getFormattedAcctInfo() {
        // implement
        String info = String.format("%nACCOUNT INFO FOR %s: %n", name);

        if (checkingAcct != null) {
            info += checkingAcct.toString();
        }

        if (savingsAcct != null) {
            info += savingsAcct.toString();
        }

        if (retirementAcct != null) {
            info += retirementAcct.toString();
        }
        return info;
    }

    public void deposit(String acctType, double amt) {
        if (savingsAcct.getAcctType().isEqualsTo(acctType)) {
            savingsAcct.makeDeposit(amt);
        } else if (retirementAcct.getAcctType().isEqualsTo(acctType)) {
            retirementAcct.makeDeposit(amt);
        } else if (checkingAcct.getAcctType().isEqualsTo(acctType)) {
            checkingAcct.makeDeposit(amt);
        }
    }

    public boolean withdraw(String acctType, double amt) {
        // implement
        if (AccountType.SAVINGS.isEqualsTo(acctType)) {
            return savingsAcct.makeWithdrawal(amt);
        } else if (AccountType.RETIREMENT.isEqualsTo(acctType)) {
            return retirementAcct.makeWithdrawal(amt);
        } else if (AccountType.CHECKING.isEqualsTo(acctType)) {
            return checkingAcct.makeWithdrawal(amt);
        } else {
            return false;
        }
    }

    public String getName() {
        return name;
    }


    public LocalDate getHireDate() {
        return hireDate;
    }
}
