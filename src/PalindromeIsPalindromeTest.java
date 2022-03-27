import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PalindromeIsPalindromeTest {

	
	
	@Test
	void isPalindrome_palindrome_true() {
		
		//given
		String word = "Ala";
		
		//when
		boolean resault = Palindrome.isPalindrome(word);
		
		//then
		Assertions.assertEquals(true, resault);
		
	}
	
	
	
	@Test
	void isPalindrome_notPalindrome_false() {
		
		//given
		String word = "darek";
		
		//when
		boolean resault = Palindrome.isPalindrome(word);
		
		//then
		Assertions.assertEquals(false, resault);
	}
	
	
	
	@Test
	void isPalindrome_LargeLetterInWord_true() {
		
		//given
		String word = "Ala";
		
		//when
		boolean resault = Palindrome.isPalindrome(word);
		
		//then
		Assertions.assertEquals(true, resault);
	}

}
