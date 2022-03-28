import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PalindromeisPalindromeFrazeTest {

	@Test
	void isPalindromeFraze_palindromeFraze_true() {
		
		//given
		String fraze = "never odd or even";
		
		//when
		boolean resault = Palindrome.isPalindromeFraze(fraze);
		
		//then
		Assertions.assertEquals(true, resault);
		
		
	}

	@Test
	void isPalindromeFraze_FrazeWithInterpunction_true() {
		
		//given
		String fraze = "red rum, sir, is murder";
		
		//when
		boolean resault = Palindrome.isPalindromeFraze(fraze);
		
		//then
		Assertions.assertEquals(true, resault);
	}
	
	@Test
	void isPalindromeFraze_NotAPalindromeFraze_false() {
		
		//given
		String fraze = "Hello world, bye world";
		
		//when
		boolean resault = Palindrome.isPalindromeFraze(fraze);
		
		//then
		Assertions.assertEquals(false, resault);
	}
}
