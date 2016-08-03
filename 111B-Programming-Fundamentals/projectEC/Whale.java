/*  
 * Name: Mikiko Bazeley
 * Class: Java 111B- SU 16
 * Date: 7/26/2016
 * Project: Extra Credit
 * 
 * Part 5 of 10: Whale concrete class,
 * which is extends Mammal, which extends Animal
 * */
public class Whale extends Mammal implements WaterLiveable{

	//private instance variables
	private String famousLiteraryMention;
	private final static boolean DEFAULT_FLIGHT = false;
	
		//constructor
	public Whale(String name, double size,boolean flight,String famousLiteraryMention) {
		super(name,size,DEFAULT_FLIGHT);
		this.famousLiteraryMention=famousLiteraryMention;
	}
		//getter,setter
	//Famous Literary mention
	public String getFamouseLiteraryMention(){
		return famousLiteraryMention;
	}
	
	public void setFamousLiteraryMention(String famousLiteraryMention){
		this.famousLiteraryMention=famousLiteraryMention;
	}
	
		
		//public/private methods
	@Override
	public boolean isWarmBlooded(){
		return true;
	}
	
	@Override
	public boolean hasLiveBirth(){
		return true;
	}
	
	@Override
	public boolean canLiveOnLand(){
		return false;
	}
	
	
	
		
	public String getSeaShanty(){
		String part1 = "We struck the whale, away he went,\n";
		String part2 = "And he lashed out with his tail,\n And we lost the boat and five good men,\n";
		String part3 = "And we never got the whale, \n Brave boys, \n ";
		String part4 = "And we did not get that whale.";
		return part1+part2+part3+part4;
	}


	//toString
			@Override
			public String toString() {

			return super.toString()+" | Warm-blooded?: "+isWarmBlooded()+" | Live Birth?: "+hasLiveBirth()+" | Famous Mention?: "+famousLiteraryMention;

			}

}