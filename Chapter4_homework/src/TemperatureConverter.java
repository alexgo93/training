
public class TemperatureConverter {
	/*
	public String convertTemp (int temperature, char convertTo) {
		String tempResult;
		if(convertTo=='C') {
			tempResult = "����������� = " + temperature;
		}else {
			tempResult="����������� = " + (temperature+70);
		}
		return tempResult;
	}
	*/
	
	public static String convertTemp (int temperature, char convertTo) {
		String tempResult;
		if(convertTo=='C') {
			tempResult = "����������� = " + temperature;
		}else {
			tempResult="����������� = " + (temperature+70);
		}
		return tempResult;
	}
}
