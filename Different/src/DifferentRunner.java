
public class DifferentRunner {

	public static void main(String[] args) {
		
		Byke b = new Byke();
		
		// b.addByke();
		
		
		try {
			int sum = 0;
			Integer currentElement;
			for (int i = 0;i<args.length;i++) {
				System.out.println(i + " " + args[i]);
				currentElement = Integer.parseInt(args[i]);
				sum += currentElement;
				
			}	
			
			System.out.println("sum: " + sum);
			
			
			
		} catch (Exception e){
			System.out.println("exception handled: " +  e.toString());
			throw new IndexOutOfBoundsException();
		}
		

	}
	
	public static void temp1 () {
		int a = 10;
		Integer b = 20;
		b = Integer.parseInt("50");
		b = new Integer(a);
		
		Integer c;
		c = new Integer(10);
		

		// Integer d = 10; // autoboxing
		//		Integer d = new Integer (10); // without autoboxing
		
		Integer e;
		//e = new Integer();		
	}

}
