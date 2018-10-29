public class Fish extends Pet implements Swimmable {
	int currentDepth=0;
	/*
	public int dive(int howDeep){
		currentDepth=currentDepth + howDeep;
		System.out.println("Ќыр€ю на глубину "
		+ howDeep + " футов");
		System.out.println("я на глубине "
		+ currentDepth + " футов ниже уровн€ мор€");
		return currentDepth;
	}
	*/
	
	public String say(String something){
		return "“ы чЄ не знаешь, что рыбы не разговаривают?";
	}
	
	public String sayme () {
		return "sadfgfdfa";
	}
	
	
	public void sweam (int numberOfMeters) {
		
	}
	public void dive (int howDeap) {
		
	}
}