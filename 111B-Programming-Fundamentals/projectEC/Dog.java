/*  
 * Name: Mikiko Bazeley
 * Class: Java 111B- SU 16
 * Date: 7/26/2016
 * Project: Extra Credit
 * 
 * Part 6 of 10: Dog concrete class,
 * which is extends Mammal, which extends Animal
 * */
public class Dog extends Mammal implements Adoptable{
	// private instance variables
	private String treatType;
	private String primaryLanguageFluency;
	private final static boolean DEFAULT_FLIGHT = false;

	// constructor
	public Dog(String name, double size, boolean flight, String treatType, String primaryLanguageFluency) {
		super(name, size, DEFAULT_FLIGHT);
		this.treatType = treatType;
		this.primaryLanguageFluency = primaryLanguageFluency;
	}

	// getter,setter
	// treatType
	public String getTreatType() {
		return treatType;
	}

	public void setTreatType(String treatType) {
		this.treatType = treatType;
	}

	// primaryLanguageFluency
	public String getPrimaryLanguageFluency() {
		return primaryLanguageFluency;
	}

	public void setPrimaryLanguageFluency(String primaryLanguageFluency) {
		this.primaryLanguageFluency = primaryLanguageFluency;
	}

	// public/private methods
	@Override
	public boolean isWarmBlooded() {
		return true;
	}

	@Override
	public boolean hasLiveBirth() {
		return true;
	}
	
	@Override
	public String getHomecareInstructions(){
		return "Don't feed too many treats";
	}
	

	public boolean canLookUp() {
		return true;
		/*
		 * Joke from shaun of the dead https://youtu.be/l93fDmh6XKo?t=2m7s
		 */
	}

	// toString
	@Override
	public String toString() {

		return super.toString() + " | Warm-blooded?: " + isWarmBlooded() + " | Live Birth?: " + hasLiveBirth()
		+ " | Can Look Up?: " + canLookUp();

	}
}
