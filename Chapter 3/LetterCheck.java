public class LetterCheck {
	public static void main (String[] args) {
		char symbol = 'A';
		symbol = (char)(128.0 * Math.random());    // Generate a random character
		
		if (symbol >= 'A') {           // is the character 'A' or greater?
		  if (symbol <= 'Z') {         // yes, and is it less than 'Z'?
		    // Then we found a capital letter
			System.out.println("You have a capital letter " + symbol);
			
		} else {                       // the character is not 'Z' or less
		  if (symbol >= 'a') {         // find out if the character is 'a' or greater
		    if (symbol <= 'z') {       // find out if the character is 'z' or less
			  // Then we have a lower case letter
			  System.out.println("You have a lower case letter " + symbol);
			  
			} else {
			  System.out.println("The generated number is greater than 'a' but it is not a letter.");
			}
			
		} else {
		  System.out.println("The generated number is less than 'a' but it is not a letter");
		}
		}
		} else {
		 System.out.println("The generated number is less than 'A' so it's not a letter");
		}
	}
}