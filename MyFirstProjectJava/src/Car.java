
public class Car {
	public String color;
	public int weight;
	
	
	public Car () {
		//color = "unknown";
	}
	
	
	public Car (String color) {
		this.color = color;
	}
	
	
	public void start() {
		System.out.println("brrrr(car started ) weight = " + this.weight);
	}
	public void stop() {
		System.out.println("phphph(car stopped) color " + color);
	}
	public int drive(int howLong) {
		int distance;
		color = "yellow";
		distance = howLong*60;
		return distance;
	}
}
