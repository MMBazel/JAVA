/*  
 * Name: Mikiko Bazeley
 * Class: Java 111B- SU 16
 * Date: 7/26/2016
 * Project: Extra Credit
 * 
 * Part 3 of 10: Mammal abstract class,
 * which is then further extended by Whale and Dog
 * */
public abstract class Mammal extends Animal {
	// private instance variables
	private boolean flight;

	// Constructor, params: name, title
	// Modeled after example in question
	public Mammal(String name, double size, boolean flight) {
		super(name, size);
		this.flight = flight;
	}

	// getter,setter
	// Capable of flight
	public void setFlight(boolean flight) {
		this.flight = flight;
	}

	public boolean getFlight() {
		return flight;
	}

	// public/private methods
	public abstract boolean hasLiveBirth();

	// toString
	@Override
	public String toString() {
		return super.toString() + " | Flies?: " + flight + " | Live birth?: " + hasLiveBirth();
	}
}