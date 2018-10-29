
public class Pet {
	int age;
	float weight;
	float height;
	String color;
	public void sleep () {
		System.out.println("Good night! See you tomorrow");
	}
	public void eat () {
		System.out.println("I'm very hungry, let's have a snack with chips");
	}
	public String say(String aWord) {
		String petResponse = "Ok! " + aWord;
		return petResponse;
	}
}
