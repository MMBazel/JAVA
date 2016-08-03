// Summer 2016
// Student Name: Mikiko Bazeley
//CS 111B: Programming Fundamentals
//Inclding extra credit
//Referred to Chapter Account example

//Bank account class with
// instance variables
// constructor
// getter
// setters
// toSring method
// deposit method
// withdraw method

public class BankAccount {
	private String name; //instance variable
	private String accountID; //instance variable
	private double balance; //instance variable
	private int intRate; //instance variable
	
	// Account constructor that receives three parameters
	public BankAccount(String name, String accountID, double balance, int intRate)
	{
		this.name=name; //Assign name to instance variable name
		this.accountID=accountID;
		
		//validate that the balance is greater than 0.0; if it's not
		//instance variable balance keeps is default initial value of 0.0
		if (balance>0.0)
			{this.balance=balance;}
		else
			{
			 System.out.println("Balance must be positive.");
			}
		
		//validate that the interest rate is positive
		if (intRate>=0)
			{this.intRate=intRate;}
		else{
			System.out.println("Interest rate can't be negative");
			}
		}
		
	
	//method that deposits (adds) only a valid amount to the balance
	public void deposit(double depositAmount)
	{
		if(depositAmount>0.0)//if the depositAmount is valid
			{balance=balance+depositAmount;}
		else{
			System.out.println("Deposit amount must be positive.");
			System.out.println("Please try again. Enter a new amount: ");
			
		}
		
	}
	
	//method that withdrawals (subtracts) only a valid amount to the balance
	public void withdraw(double withdrawalAmount)
	{
		if(withdrawalAmount<=balance)//if the depositAmount is valid
			{balance=balance-withdrawalAmount;}
		else{
			System.out.println("Withdrawal amount must not exceed available funds(balance)");
		}
		
	}
	
	//method that returns the account balance
	public double getBalance(){
		return balance;
	}
	
	//method that sets the name
	public void setName(String name){
		this.name=name;
	}
	
	
	//method that returns the name
	public String getName(){
		return name; //give value of name back to caller
	}//end method getName
	
	//method that sets the account ID
		public void setAccountID(String accountID){
			this.accountID=accountID;
		}
		
	//method that returns the account ID
		public String getAccountID(){
			return accountID;
		}
		
		//method that sets the int rate 
		public void setIntRate(int intRate){
			this.intRate=intRate;
		}
		
	//method that returns the account ID
		public int getIntRate(){
			return intRate;
		}
	
	public String toString(){
		return "Name: "+this.name+"| AcctID: "+this.accountID+"| Balance: "+this.balance+"| Interest Rate: "+this.intRate+"%";
	}
}//endClass
