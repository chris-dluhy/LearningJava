import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;

public class LetterCheck3 {
  public static void main (String[] args) {
    char symbol = 'A';
	symbol = (char)(128.0 * Math.random());  // Generate a random number
	
	if (isUpperCase(symbol)) {
	  System.out.println("You have the capital letter: " + symbol);
	} else {
	  if (isUpperCase(symbol)) {
	    System.out.println("You have the lower case letter: " + symbol);
	  } else {
	    System.out.println("You do not have a letter");
	  }
	}
  }
}