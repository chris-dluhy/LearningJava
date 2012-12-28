public class Primes2 {
  public static void main(String[] args) {
    int nValues = 50;       // The max value to be checked
	
	// check all integers from 2 to 50
	OuterLoop:
	for (int i = 2; i <= nValues; ++i) {
      // try dividing all of the integers from 2 to i - 1
	  for (int j = 2; j < i; ++j) {
	    if(i % j == 0) {        // this is true if j divides exactly
		  continue OuterLoop;   // so exit the loop
		}
	  }
	  // we only get here if we have a prime number
	  System.out.println(i);   // so print the value
	}
  }
}