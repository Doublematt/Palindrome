
/*
 * a class of static methods operating on strings
 * palindrome is a word that can be written reversed and still be read the same way for Example "level"
 * contains methods isPalindrome, getReversedWord and isPalindromeFraze
 */


public class Palindrome {
	
	
	/*
	 * function that checks if word is a palindrome
	 * returns true if word is  palindrome and false if it's not
	 */
	
	public static boolean isPalindrome(String word) {
		
		// confirmation that every word is in lower case
		word = word.toLowerCase();
		
		String reverse = getReversedWord(word);
		
		//final statement 
		//checks if reversed word is the same as the given one
		if(word.equals(reverse)) return true;
		
		return false;
		
		
	}
	
	/*
	 * function that returns reversed string
	 * used in other functions in Palindrome class
	 * can be called independently
	 */
	public static String getReversedWord (String word) {
		
		String reverse = "";
		/*
		 * loop goes from last letter in given word to the first one
		 * adds chars to the String reverse in reversed order 
		 */
		
		for(int i = word.length()-1; i>= 0; i--) 	
			reverse += word.charAt(i);			
			
		return reverse;
	}
	
	/*
	 * method used to tell if a Phraze is palindrome
	 * works also for single word
	 * uses method isPalindrome
	 */
	public static boolean isPalindromePhraze(String fraze) {
		
		//eliminating interpunction
		if(fraze.contains(","))
			fraze = fraze.replaceAll(",", "");
		
		//preparing phraze
		String [] frazeArray;
		String newFraze = "";
		frazeArray = fraze.split(" ");
		
		
		//reconnecting phraze in form in which it can be used in isPalindrome function
		for(String fr : frazeArray) {
			
			newFraze = newFraze.concat(fr);
		}
		
		//method returns the resault of inPalindrome function
		return isPalindrome(newFraze);
		
		
	}
}
