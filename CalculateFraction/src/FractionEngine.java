
public class FractionEngine {
	Fraction firstFraction;
	Fraction secondFraction;
	
	
	public Fraction add () {
		Fraction result = new Fraction();
		result.setDenominator(firstFraction.getDenominator() * secondFraction.getDenominator());
		result.numerator = firstFraction.numerator * secondFraction.getDenominator()
							+ secondFraction.numerator * firstFraction.getDenominator() ;
		
		return result;
	}
	
	public Fraction multiply () {
		Fraction result = new Fraction();
		result.setDenominator(firstFraction.getDenominator() * secondFraction.getDenominator());
		result.numerator = firstFraction.numerator * secondFraction.numerator;
		return result;
	}
	
	public Fraction divide () {
		Fraction result = new Fraction();
		result.setDenominator(firstFraction.getDenominator() * secondFraction.numerator);
		result.numerator = firstFraction.numerator * secondFraction.getDenominator();
		return result;
	}
	
	public Fraction subtract () {
		Fraction result = new Fraction();
		result.setDenominator(firstFraction.getDenominator() * secondFraction.getDenominator());
		result.numerator = firstFraction.numerator * secondFraction.getDenominator()
							- secondFraction.numerator * firstFraction.getDenominator() ;
		
		return result;
	}
	
	public Fraction processesOperator (String operator) {
		Fraction result = null;
		if (operator.length()==1) {
			switch(operator) {
				case "+":
					result = add();
					break;
				case "-":
					result = subtract();
					break;
				case "/":
					result = divide();
					break;
				case "*" :
					result = multiply();
					break;
				default:
					System.out.println("You must enter right opearton");
			}
		}
		return result;
	}
	
	
}
