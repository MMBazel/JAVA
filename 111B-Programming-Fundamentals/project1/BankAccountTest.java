// Summer 2016
// Student Name: Mikiko Bazeley
//CS 111B: Programming Fundamentals
//Including extra credit
//Driver class for BankAccount class
//Referred to Ch 3 for Account clas example
import java.util.Scanner;

public class BankAccountTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Get name
		System.out.println("Please enter the name for the account: ");
		String name = input.next();
		
		//Get accountID
		System.out.println("Input an account ID: ");
		String accountID = input.next();
		
		//Set balance
		System.out.println("Set balance: ");
		double balance = input.nextDouble();
		
		//Set interest rate
				System.out.println("Set interest rate: ");
				int intRate = input.nextInt();
		
		BankAccount account1 = new BankAccount(name,accountID,balance,intRate);
		
		System.out.print("~~~~~~~~~~~~~~~~~\n");

		System.out.println("Details: ");
		System.out.println(account1);
		System.out.print("~~~~~~~~~~~~~~~~~\n");

		
		
		System.out.println("Please select some options: ");
		System.out.print("~~~~~~~~~~~~~~~~~\n");

		
		String option=" ";
		while (option!="D"){
		System.out.println("To check your balance, input A");
		System.out.println("To deposit, input B");
		System.out.println("To withdraw, input C");
		System.out.println("To quit, input D");
		
		System.out.println("Now enter: ");	
		option = input.next();
		
		if(option.equals("D")){
			break;
		}
		else if(option.equals("A")){
			System.out.print("~~~~~~~~~~~~~~~~~\n");
			System.out.print(account1);
			System.out.print("~~~~~~~~~~~~~~~~~\n");
		}
		else if(option.equals("B")){
			System.out.print("~~~~~~~~~~~~~~~~~\n");
			System.out.print("Enter deposit amount for account: ");
			double depositAmount = input.nextDouble();
			account1.deposit(depositAmount);
			System.out.printf("Your new balance is $ %10.2f\n",account1.getBalance());
			System.out.print("~~~~~~~~~~~~~~~~~\n");

		}
		else if(option.equals("C")){
			System.out.print("~~~~~~~~~~~~~~~~~\n");
			System.out.print("Enter withdrawal amount for account: ");
			double withdrawalAmount = input.nextDouble();
			account1.withdraw(withdrawalAmount);
			System.out.printf("Your new balance is %10.2f\n",account1.getBalance());
			System.out.print("~~~~~~~~~~~~~~~~~\n");

		}
		else{
			System.out.print("~~~~~~~~~~~~~~~~~\n");
			System.out.print("Not a valid choice. Please input a relevant option.\n");
			System.out.print("~~~~~~~~~~~~~~~~~\n");

		}
		
		
		
		}
		
	}

}