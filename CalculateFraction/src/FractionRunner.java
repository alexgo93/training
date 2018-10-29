
public class FractionRunner {

	public static void main(String[] args) {
		if (args.length == 5) {
			try {
				//Integer numenator1 = Integer.parseInt(args[0]);
				// Integer denominator1 = Integer.parseInt(args[1]);
				//Integer numenator2 = Integer.parseInt(args[2]);
				//Integer denominator2 = Integer.parseInt(args[3]);
			
				Fraction fractionOne = new Fraction();
				fractionOne.setNumerator(args[0]);
				fractionOne.setDenominator(args[1]);
				
				System.out.println(fractionOne.describe());
				System.out.println(fractionOne.decimalValue());
				
				
				
				Fraction fractionTwo = new Fraction();
				fractionTwo.setNumerator(args[2]);
				fractionTwo.setDenominator(args[3]);
				
				System.out.println(fractionTwo.describe());
				System.out.println(fractionTwo.decimalValue());
				
				
				FractionEngine fEngine = new FractionEngine();
				fEngine.firstFraction = fractionOne;
				fEngine.secondFraction = fractionTwo;
				
				Fraction result = fEngine.processesOperator(args[4]);
				
				if (result != null) {
					System.out.println(result.describe());
					System.out.println(result.decimalValue());
					
				}
					
				
			} catch (NumberFormatException ne) {
				System.out.println("You've entered wrong argument: " + ne.getMessage() + ne.);
			} catch (Exception e){
				e.
			}
				

			
			
		} else {
			System.out.println("You must enter 5 arguments");
		}

	}

}
