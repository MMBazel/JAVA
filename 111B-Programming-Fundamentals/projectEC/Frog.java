/*  
 * Name: Mikiko Bazeley
 * Class: Java 111B- SU 16
 * Date: 7/26/2016
 * Project: Extra Credit
 * 
 * Part 7 of 10: Frog concrete class,
 * which extended Amphibian, which extended Animal
 * */
public class Frog extends Amphibian implements Adoptable, WaterLiveable{

	// private instance variables
	private String spouse;


	// constructor
	public Frog(String name, double size, boolean poisonousSkin, boolean nocturnal, String spouse) {
		super(name, size, poisonousSkin, nocturnal);
		this.spouse = spouse;
	}

	// getter,setter
	// Spouse
	public String getSpouse() {
		return spouse;
	}

	public void setsSpouse(String spouse) {
		this.spouse = spouse;
	}

	// public/private methods
	@Override
	public boolean isWarmBlooded() {
		return false;
	}

	@Override
	public String getHomecareInstructions(){
		return "Feed lots of crickets and keep virvarium clean.";
	}

	@Override
	public boolean canLiveOnLand(){
		return true;
	}
	
	
	public String getCommercialJingle() {
		return "Bud...Budweiser";
	}

	// toString
	@Override
	public String toString() {
		return super.toString() + " | Spouse?: " + spouse;
	}

}