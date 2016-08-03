/*  
 * Name: Mikiko Bazeley
 * Class: Java 111B- SU 16
 * Date: 7/26/2016
 * Project: Extra Credit
 * 
 * Part 8 of 10: Goldfish concrete class extends animal (considered the idea of adding 
 * a family group to be consistent with mammals and amphibians but decided to
 * stay close to project req's)
 * Extends Animal directly
 * */
public class Goldfish extends Animal implements Adoptable, WaterLiveable {

	// private instance variables
	private String color;

	// constructor
	public Goldfish(String name, double size, String color) {
		super(name, size);
		this.color = color;
	}

	// getter,setter
	public String getColor() {
		return color;
	}

	public void setsColor(String color) {
		this.color = color;
	}

	// public/private methods
	/*
	 * Warm blooded fish does exist though:
	 * http://www.livescience.com/50839-first-warm-blooded-fish-found.html
	 */
	@Override
	public boolean isWarmBlooded() {
		return false;
	}

	@Override
	public String getHomecareInstructions() {
		return "Get goldfish food and be sure to keep tank clean.";
	}

	@Override
	public boolean canLiveOnLand() {
		return false;
	}

	// toString
	@Override
	public String toString() {
		return super.toString() + " | Warm-blooded?: " + isWarmBlooded();
	}
}