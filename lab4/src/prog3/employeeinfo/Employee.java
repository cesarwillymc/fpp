package prog3.employeeinfo;


import prog3.util.AccountList;
import prog3.util.MyStringList;

import java.time.LocalDate;

public class Employee {
    private final AccountList accountList;
    private final String name;
    private final LocalDate hireDate;


    public Employee(String name, int yearOfHire, int monthOfHire, int dayOfHire) {
        this.name = name;
        accountList = new AccountList();
        hireDate = LocalDate.of(yearOfHire, monthOfHire, dayOfHire);
    }


    public void createNewChecking(double startAmount) {
        accountList.add(new CheckingAccount(startAmount));
    }

    public void createNewSavings(double startAmount) {
        // implement
        accountList.add(new SavingsAccount(startAmount));
    }

    public void createNewRetirement(double startAmount) {
        // implement
        accountList.add(new RetirementAccount(startAmount));
    }

    public String getFormattedAcctInfo() {
        // implement
        StringBuilder info = new StringBuilder();
        info.append(String.format("%nACCOUNT INFO FOR %s: %n", name));
        for (Account acc : accountList.getStrArray()) {
            info.append(acc);
        }
        return info.toString();
    }

    public void deposit(int accountIndex, double amt) {
        Account select = accountList.get(accountIndex);
        select.makeDeposit(amt);
    }

    public boolean withdraw(int accountIndex, double amt) {
        // implement
        Account select = accountList.get(accountIndex);
        return select.makeWithdrawal(amt);
    }

    public String getName() {
        return name;
    }


    public LocalDate getHireDate() {
        return hireDate;
    }

    public MyStringList getNamesOfAccounts() {
        MyStringList lists = new MyStringList();
        for (Account acc : accountList.getStrArray()) {
            lists.add(acc.getAcctType().name().toLowerCase());
        }
        return lists;
    }
}
