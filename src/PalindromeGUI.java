
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
		super("Palindrome");
		this.setBounds(500, 200, 400, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//method to init every component in frame
		initComponents();
		
		//at the end method to make frame visible
		this.setVisible(true);
	}
	
	//private method initializing components
	private void initComponents() {
		
		
		
	}

	//declarations of all components
	private JPanel mainPanel;
	private JTextField palindromeTextField;
	
}
