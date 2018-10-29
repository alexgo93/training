
public class FishMaster {

	public static void main(String[] args) {
		Fish myFish = new Fish();
		myFish.dive(5);
		myFish.dive(95);
		myFish.dive(5);
		myFish.sleep();
		System.out.println(myFish.say("Hello!"));
	}

}
