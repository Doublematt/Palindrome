import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PalindromeGetReversedWordTest {

	@Test
	void getReversedWord_reversed() {
		
		//given
		String word = "studies";
		String reversed = "seiduts";
		
		//when
		String resault = Palindrome.getReversedWord(word);
		
		//then
		Assertions.assertEquals(reversed, resault);
		
	}
	
	@Test
	void getReversedWord_notReversed() {
		
		//given
		String word = "studies";
		
		//when
		String resault = Palindrome.getReversedWord(word);
		boolean notReversed = word.equals(resault);
		
		//then
		Assertions.assertEquals(false, notReversed);
		
	}

}
