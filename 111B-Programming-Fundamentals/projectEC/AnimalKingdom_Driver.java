/*  
 * Name: Mikiko Bazeley
 * Class: Java 111B- SU 16
 * Date: 7/26/2016
 * Project: Extra Credit
 * 
 * Part 1 of 10: Driver Program
 * */


public class AnimalKingdom_Driver {

	public static void main(String[] args) {
		/*Ex: Create an array to hold 6 Pet objects
Fill the array with some cats and some dogs.
Iterate the array and print a text representation of each pet.
Iterate the array and output the name of each outdoor cat.*/
		
		//create an array of each kind of animal
		Animal[] animals = new Animal[4];
		
		//Assign a specific animal to each
		Dog dogTest = new Dog("Wishbone",14,false,"milkbones","English");
		animals[3]= dogTest;
		
		Frog frogTest = new Frog("Kermit",7.2,false,false,"Ms.Piggy");
		animals[1]= frogTest;
		
		Goldfish goldFishTest = new Goldfish("Goldie", 0.1, "orange");
		animals[2]= goldFishTest;
		
		Whale whaleTest = new Whale("Moby Dick", 1000,false,"Moby Dick"); 
		animals[0]= whaleTest;
		
		//Test toString
		for(Animal ani: animals){
			System.out.println(ani);
		}
		System.out.println("=====================================");

		
		//Test isWarmblooded
		for(Animal ani: animals){
			System.out.print("Name: "+ani.getName());
			System.out.print("| Warm Blooded?: "+ani.isWarmBlooded());
			System.out.println("| Type: "+ani.getClass());
		}
		System.out.println("=====================================");
		
		//Call animal specifc methods on animals
		//Dog- canLookUp
		System.out.println(dogTest.getName()+" can look up.");
		System.out.println(dogTest.canLookUp());
		System.out.println("=====================================");
		
		//Whale- sea shanty
		System.out.println(whaleTest.getName()+ " and a sample sea shanty.");
		System.out.println(whaleTest.getSeaShanty());
		System.out.println("=====================================");

		
		//Frog- commercial jingle 
		System.out.println("This commercial for "+frogTest.getName());
		System.out.println(frogTest.getCommercialJingle());
		System.out.println("=====================================");

		
		//Create Adoptable array
		Adoptable[] adoptions = new Adoptable[3];
		adoptions[0]=dogTest;
		adoptions[1]=frogTest;
		adoptions[2]=goldFishTest;
		
		for(Adoptable adp:adoptions){
			System.out.println(adp.getHomecareInstructions());
			Animal adpNew = (Animal) adp;
			System.out.println(adpNew.getName());
			System.out.println("====================================");
			
		}
		
	}

}
