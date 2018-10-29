public class PetMaster {
	public static void main(String[] args) {
		
		Swimmable mySwims [] = {new Fish(), new Submarine()};
		mySwims[0].dive(10);
		
		Fish f = (Fish)mySwims[0];
		f.sayme();
		
		/*
		String petReaction;
		Pet myPet = new Pet();
		myPet.eat();
		petReaction = myPet.say("Чик!! Чирик!!");
		System.out.println(petReaction);
		myPet.sleep();
		
		*/
		
		Fish f1 = new Fish();
		// Fish f2 = new Pet(); not compiled
		
		Pet p1 = f1;
		
		
		
		Fish f2 = (Fish)p1;  // after instanseof
		//f2.dive(howDeep)
		
		Pet p2 = new Dog();
		
		
		//Pet p7 = new Cat();
		Pet p7 = new Dog();
		
		if (p7 instanceof Cat) {
			Cat cat2 = (Cat)p7;
		}
		
		
		
		//= (Pet)p7;
		
		
		
		
		
		Pet p3 = new Cat();
		
		Pet p4 = new Fish();
		
		Pet[] pets = {p1, p2, p3, p4};
		
		for (int i = 0; i < pets.length; i++) {
			Pet currentPet = pets[i];
			System.out.println(currentPet.say("dfaf"));
		}
			
		
		Pet [] pets2 = {new Dog(), new Dog(), new Cat()};
		
		for (int i = 0; i < pets2.length; i++) {
			
			if (pets2[i] instanceof Dog) {
				Dog currentPet = (Dog)pets2[i];
				currentPet.Bark();
				System.out.println(currentPet.say("dfaf"));
			}
			
			
		}
		
		
	}
}