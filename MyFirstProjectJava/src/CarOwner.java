
public class CarOwner {

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.color = "black";
		myCar.start();
		myCar.stop();
		
		System.out.println(myCar.drive(20));
		
		
		Car mySecondCar = new Car();
		mySecondCar.color = "blak0";
		
		myCar = new Car();
		
	}

}
