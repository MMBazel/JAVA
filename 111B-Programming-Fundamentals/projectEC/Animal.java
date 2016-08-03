/*  
 * Name: Mikiko Bazeley
 * Class: Java 111B- SU 16
 * Date: 7/26/2016
 * Project: Extra Credit
 * 
 * Part 2 of 10: Animal abstract class, to be exteded by Mammal,
 * which is then further extended by Whale and Dog
 * */

public abstract class Animal {
	// private instance variables
	/*
	 * Note: Methods of a subclass can't directly access private members of
	 * their superclass. A subclass can only change the state of private
	 * superclass instance variable only through non-private method provded in
	 * the superclass and inherited by the subclass
	 */
	private String name;
	private double size; //as in lbs weight

	// constructor <-------------Add validity checks!!!!!!!!!!!!!!!!!!!!
	public Animal(String name, double size) {
		this.name = name;
		this.size = size;
	}

	// getter,setter
	// Name
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// Size <---- Add validity checks

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	// public+private methods
	// All animals have a method "isWarmBlooded" that returns a boolean.
	// Must be overridden in classes
	public abstract boolean isWarmBlooded();

	// toString
	@Override
	public String toString() {

		return "Name: " + name + " | Size: " + size;

	}

}