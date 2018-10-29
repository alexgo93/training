package discriminant;

public class discr_calc {
	double a,b,c;

	public static String calc(double a, double c, double b) {
		String discr_result;
		double d;
		double x1,x2;
		d = Math.pow(b, 2) - (4 * a * c);
		if(d>0) {
			x1 = ((-1) * b + Math.sqrt(d)) / 2 * a;
			x2 = ((-1) * b - Math.sqrt(d)) / 2 * a;
			discr_result = "x1= "+x1 + " x2= " +x2;
		} else if(d==0) {
			x1 = (-1) * b;
			discr_result = "x1, x2 = " + x1;
		} else {
			discr_result = "ошибка";
		}
		return discr_result;
	}
}
