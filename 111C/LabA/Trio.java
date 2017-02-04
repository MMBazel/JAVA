/**
 * Name: Mikiko Bazeley
 * Lab A: Generics (Extra Credit in different file)
 * FA2017
 */
public class Trio<T> {

	/**(10 points) instance data for the 
	 * three items*/
	public T item1;
	public T item2;
	public T item3;
	
	/**(10 points) a constructor to create the 
	 * object by sending three items as parameters
	 * Ex: public BoxG(T newThing) {
		thing = newThing;
		count = 1;
	}*/

	public Trio(T item1, T item2, T item3){
		this.item1 = item1;
		this.item2 = item2;
		this.item3 = item3;
		
	}
	
	/**(10 points) getters and setters for each 
	 * item in the trio
	 * Ex: public void replaceContents(T newThing) {
		thing = newThing;
		count++;
	}
	 */
	//Getters (item1, item2, item3)
	public T getItem1(){return item1;}
	
	public T getItem2(){return item2;}
	
	public T getItem3(){return item3;}
	

	//setters
	public void setItem1(T item1){this.item1=item1;}
	
	public void setItem2(T item2){this.item2=item2;}
	
	public void setItem3(T item3){this.item3=item3;}
	
	
	/**(10 points) a toString method that returns
	 *  a text representation of the trio 
	 */
	@Override 
	public String toString(){
		return " (item 1): "+item1.toString()+
				" (item 2): "+item2.toString()+
				" (item 3): "+item3.toString();
	}
	
	
	
	/**(15 points) a contains method that 
	 * returns whether or not the trio contains an 
	 * item sent in as a parameter
	 */
	public boolean contains(T value){
		boolean firstCheck = item1.equals(value);
		boolean secondCheck = item2.equals(value);
		boolean thirdCheck = item3.equals(value);

		if (firstCheck||secondCheck==true){return true;}
		else if(thirdCheck==true){return true;}
		else{return false;}
	}
	
	
	/**(15 points) a method called sameItems 
	 * that returns true if the three items 
	 * are the same as each other, meaning they 
	 * are equal to each other (not aliases, but 
	 * equal- logically equivalent), and false 
	 * otherwise
	 */

	/*For example, invoking sameItems on the 
	 * Trio (3, 3, 3) will return true. 
	 * Invoking sameItems on the Trio (3, 4, 4) 
	 * will return false.
	 */
	
	public boolean sameItems(){
		boolean checkAB = item1.equals(item2);
		boolean checkBC = item2.equals(item3);
		return checkAB && checkBC;
	}
	
	
	
	/**(20 points) an equals method 
	 * that overrides the equals method of 
	 * the Object class.
	 * 	The method returns true if the current T
	 * rio holds the same three items in any 
	 * order as the Trio sent as a parameter and 
	 * false otherwise.

	 */
	@Override
	public boolean equals(Object other) {
		if(other instanceof Trio<?>) {
			Trio<?> trioB = (Trio<?>) other;
//Please see attached jpg for the full logical explanation via chart form
			boolean flag=false;
			boolean matchA1B1 = (this.getItem1()).equals(trioB.getItem1());
			boolean matchA1B2 = (this.getItem1()).equals(trioB.getItem2());
			boolean matchA1B3 = (this.getItem1()).equals(trioB.getItem3());

			boolean matchA2B1 = (this.getItem2()).equals(trioB.getItem1());
			boolean matchA2B2 = (this.getItem2()).equals(trioB.getItem2());
			boolean matchA2B3 = (this.getItem2()).equals(trioB.getItem3());

			boolean matchA3B1 = (this.getItem3()).equals(trioB.getItem1());
			boolean matchA3B2 = (this.getItem3()).equals(trioB.getItem2());
			boolean matchA3B3 = (this.getItem3()).equals(trioB.getItem3());
			if(matchA1B1){
				if(matchA2B2){
					if(matchA3B3){flag=true;}
					else{flag=false;}
				}
				else{
					if(matchA2B3){
						if(matchA3B2){flag=false;}
						else{flag=false;}
					}
					else{flag=false;}	
				}	
			}else{
				if(matchA1B2){
					if(matchA2B1){
						if(matchA3B3){flag=true;}
						else{flag=false;}
					}
					else{
						if(matchA2B3){
							if(matchA3B1){flag=true;}
							else{flag=false;}	
						}
						else{flag=false;}
					}	
				}
				else{
					if(matchA1B3){
						if(matchA2B1){
							if(matchA3B2){flag=true;}
							else{flag=false;}	
						}
						else{
							if(matchA2B2){
								if(matchA3B1){flag=true;}
								else{flag=false;}
							}
							else{flag=false;}
						}	
					}
					else{flag=false;}
				}
			}

			return flag;
			
		} else {
			return false;
		}
	}

	
}
