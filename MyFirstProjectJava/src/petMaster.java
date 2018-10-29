
public class petMaster {

	public static void main(String[] args) {
		String petReaction;
		Pet myPet = new Pet();
		myPet.eat();
		petReaction = myPet.say("Gav!Gav!");
		System.out.println(petReaction);
		myPet.sleep();
		

	}

}
