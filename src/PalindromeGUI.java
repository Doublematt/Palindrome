
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
		this.setBounds(500, 200, 400, 320);
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
		instructionLabel = new JLabel(INSTRUCTION);
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
		checkButton.addActionListener(new CheckButtonHandler());
		
		// label which appear if word is a Palindrome
		wordIsPalindromeLabel = new JLabel("This is a Palindrome!");
		mainPanel.add(wordIsPalindromeLabel);
		wordIsPalindromeLabel.setBounds(140, 190, 150, 25);
		wordIsPalindromeLabel.setVisible(false);
		
		//label which appear if word is NOT a Palindrome
		wordIsNotPalindromeLabel = new JLabel("Unfortunetely this is not a Palindrome :(");
		mainPanel.add(wordIsNotPalindromeLabel);
		wordIsNotPalindromeLabel.setBounds(80, 190, 250, 25);
		wordIsNotPalindromeLabel.setVisible(false);
		
	}
	/*
	 * private class handling checkButton
	 * used to show right Label on the screen when button is pressed
	 * labels wordIsPalindromeLabel, wordIsNotPalindromeLabel
	 */
	
	private class CheckButtonHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			/*
			 * false if word is not a Palindrome
			 * true if it is
			 */
			boolean isWordPalindrome;
			
			//assign right value
			if(isPhrazeCheckBox.isSelected())
				isWordPalindrome = Palindrome.isPalindromePhraze(palindromeTextField.getText());
			else 
				isWordPalindrome = Palindrome.isPalindrome(palindromeTextField.getText());
			
			// depending on isWordPalindrome value changes visibilities of labels to show the answer to user
			if(isWordPalindrome) {
				wordIsNotPalindromeLabel.setVisible(false);
				wordIsPalindromeLabel.setVisible(true);
			}
			else {
				wordIsPalindromeLabel.setVisible(false);
				wordIsNotPalindromeLabel.setVisible(true);
			}
				
			
		}
		
	}

	//declarations of all components
	private JPanel mainPanel;
	private JTextField palindromeTextField;
	private JLabel welcomeLabel;
	private JLabel instructionLabel;
	private JLabel wordIsPalindromeLabel;
	private JLabel wordIsNotPalindromeLabel;
	private JCheckBox isPhrazeCheckBox;
	private JButton checkButton;
	
	// final values
	private final String INSTRUCTION = "Please enter a fraze or a word to check if it is a palindrome";

	
}
