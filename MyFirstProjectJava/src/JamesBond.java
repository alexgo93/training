
public class JamesBond {

	public static void main(String[] args) {
		JamesBondCar JamesCar = new JamesBondCar();
		JamesCar.start();
		int JamesLength;
		JamesLength = JamesCar.drive(10);
		System.out.println("Машина Джеймса Бонда проехала " + JamesLength);
		JamesCar.stop();
	}

}
