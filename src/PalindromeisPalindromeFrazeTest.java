import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PalindromeisPalindromePhrazeTest {

	@Test
	void isPalindromePhraze_palindromePhraze_true() {
		
		//given
		String fraze = "never odd or even";
		
		//when
		boolean resault = Palindrome.isPalindromePhraze(fraze);
		
		//then
		Assertions.assertEquals(true, resault);
		
		
	}

	@Test
	void isPalindromePhraze_PhrazeWithInterpunction_true() {
		
		//given
		String fraze = "red rum, sir, is murder";
		
		//when
		boolean resault = Palindrome.isPalindromePhraze(fraze);
		
		//then
		Assertions.assertEquals(true, resault);
	}
	
	@Test
	void isPalindromePhraze_NotAPalindromePhraze_false() {
		
		//given
		String fraze = "Hello world, bye world";
		
		//when
		boolean resault = Palindrome.isPalindromePhraze(fraze);
		
		//then
		Assertions.assertEquals(false, resault);
	}
}
