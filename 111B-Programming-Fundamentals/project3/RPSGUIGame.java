/*
 * Name: Mikiko Bazeley
 * Term: Summer 2016
 * Class: CCSF- Java 111B
 * Project 3: Rock Paper Scissor
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RPSGUIGame extends JFrame {

	// buttons for the user to enter their move
	private JButton rockButton, paperButton, scissorsButton;

	// labels to display the number of wins/losses/ties
	private JLabel statusC, statusU, statusT;

	// images and labels to display the computer and user's moves and the outcome of a match-up
	private ImageIcon rockImage, paperImage, scissorsImage;
	private JLabel compPlay, userPlay;
	private JLabel outcome;
	
	// the game object
	private RPSGame game;

	public RPSGUIGame() {

		// initializes the window
		super("Rock, Paper, Scissors, Go!");
		setSize(350, 300);
		Container contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());
		contentPane.setBackground(Color.black);
		setResizable(false);

		// creates the game object
		// 	NOTE: IF COMPLETING THE EXTRA CREDIT, YOU WILL NEED TO ADD A PARAMETER TO REPRESENT THE BET AMOUNT
		game = new RPSGame();


		// creates the labels for displaying the computer and user's move;
		// the images for the moves and the outcome of a match-up will be displayed
		// in a single panel
		rockImage = new ImageIcon("rock.jpg");
		paperImage = new ImageIcon("paper.jpg");
		scissorsImage = new ImageIcon("scissors.jpg");

		compPlay = new JLabel();
		compPlay.setVerticalTextPosition(SwingConstants.BOTTOM);
		compPlay.setHorizontalTextPosition(SwingConstants.CENTER);
		compPlay.setBorder(BorderFactory.createLineBorder(Color.black, 5));
		compPlay.setForeground(Color.cyan);
		
	
		
		userPlay = new JLabel();
		userPlay.setVerticalTextPosition(SwingConstants.BOTTOM);
		userPlay.setHorizontalTextPosition(SwingConstants.CENTER);
		userPlay.setBorder(BorderFactory.createLineBorder(Color.black, 5));
		userPlay.setForeground(Color.cyan);

		
		
		outcome = new JLabel();
		outcome.setHorizontalAlignment(SwingConstants.CENTER);
      outcome.setForeground(Color.pink);
		
		JPanel imageOutcomePanel = new JPanel();
		imageOutcomePanel.setBackground(Color.black);
		imageOutcomePanel.setLayout(new BorderLayout());
		imageOutcomePanel.add(compPlay, BorderLayout.WEST);
		imageOutcomePanel.add(userPlay, BorderLayout.EAST);
		imageOutcomePanel.add(outcome, BorderLayout.SOUTH);
		
		
		// creates the labels for the status of the game (number of wins, losses, and ties);
		// the status labels will be displayed in a single panel
		statusC = new JLabel("Computer Wins: " + game.getCWins());
		statusU = new JLabel("User Wins: " + game.getUWins());
		statusT = new JLabel("Ties: " + game.getTies());
		statusC.setForeground(Color.white);
		statusU.setForeground(Color.white);
		statusT.setForeground(Color.white);
		JPanel statusPanel = new JPanel();
		statusPanel.setBackground(Color.black);
		statusPanel.add(statusC);
		statusPanel.add(statusU);
		statusPanel.add(statusT);

		// the play and status panels are nested in a single panel
		JPanel gamePanel = new JPanel();
		gamePanel.setPreferredSize(new Dimension(250, 250));
		gamePanel.setBackground(Color.black);
		gamePanel.add(imageOutcomePanel);
		gamePanel.add(statusPanel);
		
		// creates the buttons and displays them in a control panel;
		// one listener is used for all three buttons
		rockButton = new JButton("Play Rock");
		rockButton.addActionListener(new GameListener());
		paperButton = new JButton("Play Paper");
		paperButton.addActionListener(new GameListener());
		scissorsButton = new JButton("Play Scissors");
		scissorsButton.addActionListener(new GameListener());

		JPanel controlPanel = new JPanel();
		controlPanel.add(rockButton);
		controlPanel.add(paperButton);
		controlPanel.add(scissorsButton);
		controlPanel.setBackground(Color.black);

		// the gaming and control panel are added to the window
		contentPane.add(gamePanel, BorderLayout.CENTER);
		contentPane.add(controlPanel, BorderLayout.SOUTH);
		
		setVisible(true);
	}

	/* determines which button was clicked and updates the game accordingly */
	/*get the move from the user by determining which button was clicked
update the display of the user’s move 
generate a move by the computer by invoking a method on the RPSGame object
update the display of the computer’s move 
determine the outcome (the winner) by invoking a method on the RPS object
update the display of the outcome
get the updated game stats (number of computer wins, number of user wins, and number of ties) by invoking methods on the RPS object
update the display of the outcome*/
	private class GameListener implements ActionListener {
		String userMove;
		String compMove;
		public void actionPerformed(ActionEvent event) {
			//get the move from the user by determining which button was clicked
			
			if(event.getSource()==rockButton){
				userMove="ROCK";
				paperButton.setEnabled(false);
				scissorsButton.setEnabled(false);
			}else if(event.getSource()==paperButton) {
				userMove="PAPER";
				rockButton.setEnabled(false);
				scissorsButton.setEnabled(false);
			}
			else if(event.getSource()==scissorsButton){
				userMove="SCISSORS";
				rockButton.setEnabled(false);
				scissorsButton.setEnabled(false);
			}
			//update the display of the user’s move 
			userPlay.setText("User's Move: "+userMove);
			setImage(userMove, userPlay);
			
			//update display with comp's move
			compMove=game.generateComputerPlay();
			compPlay.setText("Computer's Move: "+compMove);
			setImage(compMove, compPlay);


			//determine the outcome (the winner) by invoking a method on the RPS object
			//update the display of the outcome
			String outcomeStatus=game.findWinner(userMove,compMove);
			outcome.setText(outcomeStatus);
			
			
			
			//get the updated game stats 
			//(number of computer wins, number of user wins, and number of ties) 
			//by invoking methods on the RPS object
			statusC.setText("Computer Wins: " + game.getCWins()); 
			statusU.setText("User Wins: " + game.getUWins());
			statusT.setText("Ties: " + game.getTies());
			
			//re-enable the button
			rockButton.setEnabled(true);
			paperButton.setEnabled(true);
			scissorsButton.setEnabled(true);
			
			
		
			
			
		}
		public void setImage(String anyMove, JLabel anyPlay){
			if(anyMove.equals("ROCK")){
				anyPlay.setIcon(rockImage);	
			}
			else if(anyMove.equals("PAPER")){
				anyPlay.setIcon(paperImage);
			}
			else if(anyMove.equals("SCISSORS")){
				anyPlay.setIcon(scissorsImage);
			}
		}
		
		
	}

	
	public static void main(String args[]) {
		// create an object of your class
		RPSGUIGame frame = new RPSGUIGame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
