/*  
 * Name: Mikiko Bazeley
 * Class: Java 111B- SU 16
 * Date: 7/26/2016
 * Project: Extra Credit
 * 
 * Part 4 of 10: Amphibian abstract class,
 * which is then further extended by Frog
 * */
public abstract class Amphibian extends Animal {

	// private instance variables
	private boolean poisonousSkin;
	private boolean nocturnal;

	// constructor
	public Amphibian(String name, double size, boolean poisonousSkin, boolean nocturnal) {
		super(name, size);
		this.poisonousSkin = poisonousSkin;
		this.nocturnal = nocturnal;
	}

	// getter,setter
	// PoisonousSkin
	public boolean getPoisonousSkin() {
		return poisonousSkin;
	}

	public void setPoisonousSkin(boolean poisonousSkin) {
		this.poisonousSkin = poisonousSkin;
	}

	// PoisonousSkin
	public boolean getNocturnal() {
		return nocturnal;
	}

	public void setNocturnal(boolean nocturnal) {
		this.nocturnal = nocturnal;
	}

	// toString
	@Override
	public String toString() {
		return super.toString() + " | Nocturnal?: " + nocturnal + " | Poisonous Skin?: " + poisonousSkin;
	}
}