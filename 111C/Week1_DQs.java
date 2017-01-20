public class Computer {
	private String brand; //instance variable
	private String name; //instance variable
	private String memSize; //instance variable
  
	private static final String BRAND_NAME = Apple;
	private static final String MODEL_NAME = iMac;
	private static final String MEM_SIZE = 128GB; 

	
// Computer constructor that receives three parameters
	public Computer(String brand, String name, String memSize)
	{
		this.brand=brand; //Assign name to instance variable name
		this.name=name;
		this.memSize=memSize;
		}
		
// Computer constructor that assigns default values
	public Computer()
	{
		this.brand=BRAND_NAME; //Assign name to instance variable name
		this.name=MODEL_NAME;
		this.memSize=MEM_SIZE;
		}	
	

//------------------ Getter/Setter 1:  Brand  -------------------------//	
//method that sets the brand
	public void setBrand(String brand){
		this.name=brand;
	}
	
	
//method that returns the brand
	public String getBrand(){
		return brand; //give value of name back to caller
	}//end method getBrand
	



//------------------ Getter/Setter 2:   Model name -------------------------//	
//method that sets the model name
		public void setModelName(String name){
			this.name=name;
		}
		
//method that returns the model name
		public String getModelName(){
			return name;
		}


//------------------ Getter/Setter 3:  Mem Size  -------------------------//			
//method that sets the mem size 
		public void setMemSize(String memSize){
			this.memSize=memSize;
		}
		
//method that returns the mem size
		public int getmemSize(){
			return memSize;
		}
	
//-------to String-----------------//

	public String toString(){
		return "Brand: "+this.brand+"| Type: "+this.name+"| MemSize: "+this.memSize;
	}



//---------equals-----------//
@Override
	public boolean equals(Object other) {
		if(other instanceof Computer) {
			Computer otherComputer = (Computer) other;
			
			return 
				this.brand.equals(Computer.brand) &&
				this.name.equals(Computer.name) &&
				this.memSize.equals(Computer.memSize);

		} else {
			return false;
		}
		
	}
	



}//endClass





public class ComputerTester {

	public static void main(String[] args) {
		
		Computer[] theComputers = new Computer[4];
		
		theComputers[0] = new Computer("HP","All-in-One","1TB");
		theComputers[1] = new Computer("Apple","iMac","128GB");
		theComputers[2] = new Computer();
		theComputers[3] = new Computer("MSI","VR Ready","12GB");

		int counter=0;
		for(int i=0; i<theComputers.length; i++) {
			System.out.println(theComputers[i]);
			if(theComputers[i].getBrand().equalsIgnoreCase("Apple")){
				counter=counter+1;
			}
		}
		System.out.println("There are "+counter+" Apple computers.");

	}

}
