package prog1.closedcurve.good;

class IllegalClosedCurveException extends Exception{
    IllegalClosedCurveException(){
        super();
    }
    IllegalClosedCurveException(String msn){
        super(msn);
    }
    IllegalClosedCurveException(Throwable throwable){
        super(throwable);
    }
}
