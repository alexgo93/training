
public class CoordinateEngine {
	Coordinate firstPoint;
	Coordinate secondPoint;

	public Double calc() {
		double result;
		double a = firstPoint.xCoordinate - secondPoint.xCoordinate;
		double b = firstPoint.yCoordinate - secondPoint.yCoordinate;
		result = Math.sqrt(Math.pow(a, 2.0) + Math.pow(b, 2.0));
		return result;
	}
}
