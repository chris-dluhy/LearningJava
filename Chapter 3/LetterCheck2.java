public class LetterCheck2 {
  public static void main(String[] args) {
    char symbol = 'A';
	symbol = (char)(128.0 * Math.random());         // Generate a random character
	
	if (symbol >= 'A' && symbol <= 'Z') {           // is the character a capital letter?
	  System.out.println("You have the capital letter: " + symbol);
	} else {
	  if (symbol >= 'a' && symbol <= 'z') {                // is the character a lower case letter?
	    System.out.println("You have the lower case letter: " + symbol);
	  } else {
	    System.out.println("You do not have a letter.");
	  }
	}
  }
}