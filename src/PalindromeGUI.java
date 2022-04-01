
import javax.swing.*;
import java.awt.*;

/*
 * GUI class to create an interface for user
 * using extends JFrame allows not to create new JFrame object and refer to frame using 'this'
 * in progress  
 */

public class PalindromeGUI extends JFrame{

	//public contructor to create new frame
	public PalindromeGUI () {
		
		//frame init 
		super("Palindromer");
		this.setBounds(500, 200, 400, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//method to init every component in frame
		initComponents();
		
		//at the end method to make frame visible
		this.setVisible(true);
	}
	
	//private method initializing components
	private void initComponents() {
		
		
		// creating panel to contain all elements
		mainPanel = new JPanel();
		mainPanel.setLayout(null);
		this.getContentPane().add(mainPanel);
		
		//text field to enter palindrome text
		palindromeTextField = new JTextField("");
		mainPanel.add(palindromeTextField);
		palindromeTextField.setBounds(100, 150, 200, 25);
		
		// Main label 
		welcomeLabel = new JLabel("Welcome to Palindromer");
		mainPanel.add(welcomeLabel);
		welcomeLabel.setBounds(125, 50, 150, 50);
		
		// label describes how to use program  
		instructionLabel = new JLabel(instruction);
		mainPanel.add(instructionLabel);
		instructionLabel.setBounds(20, 100, 350, 25);
		
		// check box to change between phraze and word function
		isPhrazeCheckBox = new JCheckBox("Phraze", false);
		mainPanel.add(isPhrazeCheckBox);
		isPhrazeCheckBox.setBounds(60, 220, 70, 20);
		
		// to submit the word or phraze
		checkButton = new JButton("Check");
		mainPanel.add(checkButton);
		checkButton.setBounds(150, 220, 100, 25);
	}

	//declarations of all components
	private JPanel mainPanel;
	private JTextField palindromeTextField;
	private JLabel welcomeLabel;
	private JLabel instructionLabel;
	private String instruction = "Please enter a fraze or a word to check if it is a palindrome";
	private JCheckBox isPhrazeCheckBox;
	private JButton checkButton;
	
}
