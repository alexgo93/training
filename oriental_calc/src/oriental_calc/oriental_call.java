package oriental_calc;

public class oriental_call {

		public static void main(String[] args) {
			Integer s = Integer.parseInt(args[0]);
			
			

				String year_result1;
				if(s%12==0){
					year_result1 = s + " year of pig";
				}else if(s%12==1) {
					year_result1 = s + " year of rat";
				}else if(s%12==2){
					year_result1 = s + " year of bull";
				}else if(s%12==3){
					year_result1 = s + " year of tiger";
				}else if(s%12==4){
					year_result1 = s + " year of rabbit";
				}else if(s%12==5){
					year_result1 = s + " year of dragon";
				}else if(s%12==6){
					year_result1 = s + " year of snake";
				}else if(s%12==7){
					year_result1 = s + " year of horse";
				}else if(s%12==8){
					year_result1 = s + " year of goat";
				}else if(s%12==9){
					year_result1 = s + " year of monkey";
				}else if(s%12==10){
					year_result1 = s + " year of cock";
				}else if(s%12==11){
					year_result1 = s + " year of dog";
				}else {
					year_result1 = "i dont know";
				}
				System.out.println(year_result1);


		}
}
