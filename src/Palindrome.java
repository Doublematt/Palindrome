
public class Palindrome {
	
	
	
	public static boolean isPalindrome(String word) {
		
		word = word.toLowerCase();
		String reverse = "";
		for(int i = word.length()-1; i>= 0; i--) {	
			reverse += word.charAt(i);			
			
		}
		
		if(word.equals(reverse)) return true;
		
		return false;
		
		
	}
}
