package prog2;

public class OverdrawnAccountException extends  Exception{
    public OverdrawnAccountException() {
    }

    public OverdrawnAccountException(String message) {
        super(message);
    }

    public OverdrawnAccountException(Throwable cause) {
        super(cause);
    }
}
