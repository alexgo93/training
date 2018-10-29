
public class CoordinateRunner {

	public static void main(String[] args) {
		Coordinate firstCord = new Coordinate();
		firstCord.setXCord(args[0]);
		firstCord.setYCord(args[1]);
		Coordinate secondCord = new Coordinate();
		secondCord.setXCord (args[2]);
		secondCord.setYCord(args[3]);
		
		
		CoordinateEngine cEngine = new CoordinateEngine();
		cEngine.firstPoint = firstCord;
		cEngine.secondPoint = secondCord;
		System.out.println(cEngine.calc());
	}

}
