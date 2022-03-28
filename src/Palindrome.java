
public class Palindrome {
	
	
	
	public static boolean isPalindrome(String word) {
		
		word = word.toLowerCase();
		
		String reverse = getReversedWord(word);
		
		if(word.equals(reverse)) return true;
		
		return false;
		
		
	}
	
	public static String getReversedWord (String word) {
		
		String reverse = "";
		for(int i = word.length()-1; i>= 0; i--) 	
			reverse += word.charAt(i);			
			
		return reverse;
	}
	
	public static boolean isPalindromeFraze(String fraze) {
		
		if(fraze.contains(","))
			fraze = fraze.replaceAll(",", "");
		
		String [] frazeArray;
		String newFraze = "";
		
		frazeArray = fraze.split(" ");
		
		for(String fr : frazeArray) {
			
			newFraze = newFraze.concat(fr);
		}
		
		return isPalindrome(newFraze);
		
		
	}
}
