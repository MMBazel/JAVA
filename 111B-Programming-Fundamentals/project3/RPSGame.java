/*
 * Name: Mikiko Bazeley
 * Term: Summer 2016
 * Class: CCSF- Java 111B
 * Project 3: Rock Paper Scissor
 */

import java.util.Random;

public class RPSGame {
/*The RPSGame object is described by three characteristics. These are the instance data variables:
number of computer wins
number of user wins
number of ties*/
	private int CWins;
	private int UWins;
	private int ties;
	
	//Set all to zero unless starting game with values greater than 0
	public RPSGame(int CWinsPar, int UWinsPar, int tiesPar)
	{
		CWins=(CWinsPar>0)? CWinsPar:0;
		UWins=(UWinsPar>0)? UWinsPar:0;
		ties=(tiesPar>0)?tiesPar:0;
		
		}
	
	public RPSGame()
	{
		CWins=0;
		UWins=0;
		ties=0;
		
		}
	
	/*Include appropriate getters and setters.*/
//CWins: getter, setter
	//method that sets the CWins
		public void setCWins(int CWinsPar){
			CWins=CWinsPar;
		}
		
		
		//method that returns the CWins
		public int getCWins(){
			return CWins; 
			}
		
//UWins: getter, setter
		//method that sets the UWins
			public void setUWins(int UWinsPar){
				UWins=UWinsPar;
			}
			
		
		//method that returns the UWins
			public int getUWins(){
				return UWins; 
				}		
			
			
//ties: getter, setter
			//method that sets the UWins
				public void setTies(int tiesPar){
					ties=tiesPar;
				}
				
				
				//method that returns the UWins
				public int getTies(){
					return ties; 
					}		
				
//Write a generateComputerPlay method that generates a random move by the computer.
				
	public String generateComputerPlay()
	{
		Random rn = new Random();
		int answer = rn.nextInt(3) + 1;
		if(answer==1){
			return "ROCK";
		}
		else if(answer==2){
			return "PAPER";
		}
		else{
			return "SCISSORS";
		}
		
		
	}
	
	/*Write a findWinner method that takes in two moves as parameters (the user move and the computer move) and determines the outcome (user wins, computer wins, or tie).
	Determining the winner will require you to compare a lot of possible match-ups through a series of nested conditionals.
	The method should update the instance data (number of computer wins, number of user wins, and number of ties) depending on the outcome.*/
	public String findWinner(String userMove, String computerMove){
		String outcome="";
		if((userMove=="ROCK"&&computerMove=="SCISSORS")
				||(userMove=="PAPER"&&computerMove=="ROCK")||
				(userMove=="SCISSORS"&&computerMove=="PAPER")){
			UWins=UWins+1;
			outcome="User wins";
		}
		else if((computerMove=="ROCK"&&userMove=="SCISSORS")||
				(computerMove=="PAPER"&&userMove=="ROCK")||
				(computerMove=="SCISSORS"&&userMove=="PAPER")){
			CWins=CWins+1;
			outcome="Computer wins";
		}
		else if(computerMove.equals(userMove)){
			ties=ties+1;
			outcome="Tie";
		}
		return outcome;
	}
				
}


