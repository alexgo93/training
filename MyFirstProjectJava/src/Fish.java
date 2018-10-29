
public class Fish extends Pet {
	int currentDepth = 0;
	public int dive(int howDeep) {
		currentDepth += howDeep;
		if (currentDepth>100) {
			System.out.println("я маленька€ рыбка и не могу плавать на глубине больше 100 метров");
			currentDepth -= howDeep;
		}else {
			System.out.println("Ќыр€ю на глубину " + howDeep + " метров");
			System.out.println("я на глубине " + currentDepth + " метров");
		}
		
		return currentDepth;	
	}
	public String say(String something) {
		return "–ыбы не говор€т!!Ѕуль-Ѕуль!";
	}
	
}
