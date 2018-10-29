
public class Coordinate {
	public Double xCoordinate;
	public Double yCoordinate;
	public Double getXCord() {
		return xCoordinate;
	}
	public Double getYCord() {
		return yCoordinate;
	}
	public void setXCord(Double value) {
		xCoordinate = value;
	}
	public void setYCord(Double value) {
		yCoordinate = value;
	}
	public void setXCord(String value) {
		try {
			Double val = Double.parseDouble(value);
			xCoordinate = val;
		}
		catch (NumberFormatException e) {
			System.out.println("wrong input");
		}
	}
	public void setYCord(String value) {
		try {
			Double val = Double.parseDouble(value);
			yCoordinate = val;
		}
		catch (NumberFormatException e) {
			System.out.println("wrong input");
		}
	}

}
