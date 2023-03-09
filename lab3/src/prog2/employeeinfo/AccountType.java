package prog2.employeeinfo;

public enum AccountType {
    CHECKING("checking"),
    SAVINGS("savings"),
    RETIREMENT("retirement");
    private final String value;

    AccountType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public boolean isEqualsTo(String value) {
        return this.name().equals(value) || this.value.equals(value);
    }
}
