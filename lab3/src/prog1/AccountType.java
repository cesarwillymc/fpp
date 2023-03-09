package prog1;

public enum AccountType {
    CHECKING("checking"),
    SAVINGS("savings"),
    RETIREMENT("retirement");
    private final String value;

    AccountType(String value){
        this.value=value;
    }
    public String getValue(){
        return value;
    }
}
