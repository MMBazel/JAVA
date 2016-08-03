
/* 
 * Student Name: Mikiko Bazeley
 * Class: JAVA 111B
 * Project 4: Drawing Final 
 * Date: 7/30/2016
 */

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;

public class DrawingGUI extends JFrame {

	private Container contentPane;

	private final JButton clearButton;

	private final JRadioButton redButton;
	private final JRadioButton yellowButton;
	private final JRadioButton blueButton;
	private final JRadioButton eraseButton;

	private final ButtonGroup radioGroup;

	private final JLabel label;

	private Color color;// for testing purposes
	private JPanel bottomPanel;
	private PaintPanel paintPanel;

	// !!!!!!!!!!need one more functionality

	public DrawingGUI() {
		super("Draw Something!");
		// Determine layout manager

		// set the width and height of the window (in pixels)
		setSize(900, 900);

		// get the content pane add a panel to it
		// set the background color of the panel (Color.??? constants)
		contentPane = getContentPane();

		bottomPanel = new JPanel();

		contentPane.add(bottomPanel, BorderLayout.SOUTH);
		getContentPane().setBackground(Color.white);

		// Create Radio Buttons
		redButton = new JRadioButton("Red", true);
		yellowButton = new JRadioButton("Yellow", false);
		blueButton = new JRadioButton("Blue", false);
		eraseButton = new JRadioButton("Erase", false);
		/// Add listeners
		redButton.addActionListener(new RadioButtonHandler());
		yellowButton.addActionListener(new RadioButtonHandler());
		blueButton.addActionListener(new RadioButtonHandler());
		eraseButton.addActionListener(new RadioButtonHandler());

		// Create logical group among buttons
		radioGroup = new ButtonGroup();
		radioGroup.add(redButton);
		radioGroup.add(yellowButton);
		radioGroup.add(blueButton);
		radioGroup.add(eraseButton);

		bottomPanel.add(redButton);
		bottomPanel.add(yellowButton);
		bottomPanel.add(blueButton);
		bottomPanel.add(eraseButton);

		// Create Clear Button
		clearButton = new JButton("Clear Button");
		clearButton.setEnabled(true);
		clearButton.addActionListener(new ClearDrawingListener());

		bottomPanel.add(clearButton);

		// JLabel for testing purpose
		label = new JLabel("Start");
		bottomPanel.add(label);

		paintPanel = new PaintPanel();
		paintPanel.setBackground(Color.WHITE);
		contentPane.add(paintPanel, BorderLayout.CENTER);

	
		
	}
	class ClearDrawingListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			if (event.getSource() == clearButton) {
				label.setText("Clear Button");
				getContentPane().remove(paintPanel);
				paintPanel = new PaintPanel();
				paintPanel.setBackground(Color.WHITE);
				getContentPane().add(paintPanel);
			}
		}
	}

	

	class RadioButtonHandler implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			if (event.getSource() == redButton) {
				// change pen color to red
				color = Color.RED;
				label.setText("Red Button");
			} else if (event.getSource() == yellowButton) {
				// change pen color to yello
				color = Color.YELLOW;
				label.setText("Yellow Button");
			} else if (event.getSource() == blueButton) {
				// change pen color to blue
				color = Color.BLUE;
				label.setText("Blue Button");
			} else if (event.getSource() == eraseButton) {
				label.setText("Erase Button");
				color = Color.WHITE;
				// change pen color to white
			}

		}
	}

	class PaintPanel extends JPanel {
		// list of point references
		private final ArrayList<Point> points = new ArrayList<>();

		// set up a gui and register mouse event handler
		public PaintPanel() {
			// handle frame from mouse motionvevent
			setBackground(Color.WHITE);
			color = Color.RED;
			this.addMouseMotionListener(new MouseMotionAdapter()// anonymous inner
					// class
					// store movement points and repaint
					{
				@Override
				public void mouseMoved(MouseEvent event) {
					points.add(event.getPoint());
					repaint();
				}
					});
		}

		// draw ovals in a 4-by-4 bounding box at specified locations on window
		@Override
		public void paintComponent(Graphics g) {
			super.paintComponents(g);
			g.setColor(color);

			// draw all points
			for (Point point : points) {
				g.fillOval(point.x, point.y, 10, 10);
			}

		}

	}

	public static void main(String args[]) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				DrawingGUI frame = new DrawingGUI();
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			}
		});

	}
}
