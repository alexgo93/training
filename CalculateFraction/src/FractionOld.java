
public class FractionOld {
	public String FractionAdd(int nom1,int denom1,int nom2,int denom2) {
		int AddCommonDenom = denom1 * denom2;
		int AddCommonNom = (AddCommonDenom * nom1) + (AddCommonDenom * nom2);
		if(AddCommonNom>AddCommonDenom) {
			int i = Math.floorDiv(AddCommonNom, AddCommonDenom);
			int newNom = AddCommonNom % AddCommonDenom;
			return "i " + "newNom" + "/" + "AddCommonDenom";
		} else {
			return "AddCommonNom" + "/" + "AddCommonDenom";
		}
	}
	public String FractionSubstraction(int nom1,int denom1,int nom2,int denom2) {
		int SubstractionCommonDenom = denom1 * denom2;
		int SubstractionCommonNom = (SubstractionCommonDenom * nom1) - (SubstractionCommonDenom * nom2);
		if(SubstractionCommonNom>SubstractionCommonDenom) {
			int i = Math.floorDiv(SubstractionCommonNom, SubstractionCommonDenom);
			int newNom = SubstractionCommonNom % SubstractionCommonDenom;
			return "i " + "newNom" + "/" + "SubstractionCommonDenom";
		} else {
			return "SubstractionCommonNom" + "/" + "SubstractionCommonDenom";
		}
	}
	public String FractionMultiplication(int nom1,int denom1,int nom2,int denom2) {
		int MultiplicationCommonDenom = denom1 * denom2;
		int MultiplicationCommonNom = nom1 * nom2;
		if(MultiplicationCommonNom>MultiplicationCommonDenom) {
			int i = Math.floorDiv(MultiplicationCommonNom, MultiplicationCommonDenom);
			int newNom = MultiplicationCommonNom % MultiplicationCommonDenom;
			return "i " + "newNom" + "/" + "MultiplicationCommonDenom";
		} else {
			return "MultiplicationCommonNom" + "/" + "MultiplicationCommonDenom";
		}
	}
	public String FractionDivision(int nom1,int denom1,int nom2,int denom2) {
		int DivisionCommonDenom = denom1 * nom2;
		int DivisionCommonNom = nom1 * denom2;
		if(DivisionCommonNom>DivisionCommonDenom) {
			int i = Math.floorDiv(DivisionCommonNom, DivisionCommonDenom);
			int newNom = DivisionCommonNom % DivisionCommonDenom;
			return "i " + "newNom" + "/" + "DivisionCommonDenom";
		} else {
			return "DivisionCommonNom" + "/" + "DivisionCommonDenom";
		}
	}
	
}
