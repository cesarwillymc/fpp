package prog1.closedcurve.good;

public class Square extends ClosedCurve {
	double side;
	public Square(Double side) throws IllegalClosedCurveException {
		this(side.doubleValue());
	}
	public Square(double side) throws IllegalClosedCurveException {
		if (side<0)
			throw new IllegalClosedCurveException("The parameters cannot be negative");
		this.side = side;
	}
	double computeArea() {
		return(side*side);
	}

}
