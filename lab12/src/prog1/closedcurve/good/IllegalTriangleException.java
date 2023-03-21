package prog1.closedcurve.good;

public class IllegalTriangleException extends IllegalClosedCurveException {
    IllegalTriangleException(){
        super();
    }

    IllegalTriangleException(String msn) {
        super(msn);
    }

    IllegalTriangleException(Throwable throwable) {
        super(throwable);
    }
}