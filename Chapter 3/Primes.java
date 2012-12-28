public class Primes {
  public static void main(String[] args) {
    int nValues = 50;              // the max value to be checked
	boolean isPrime = true;        // is true is a prime is found
	
	// check all values from 2 to nValues
	for (int i = 2; i <= nValues; ++i) {
	  isPrime = true;              // assume that the current i is prime
	  
	  // try dividing all integers from 2 to i - 1
	  for (int j = 2; j < i; ++j) {
	    if (i % j == 0) {          // this is true if j divides exactly
		  isPrime = false;         // if we get here it is an exact division
		  break;                   // so exit the loop
		}
	  }
	  // we get through the break, or by completing the loop
	  if(isPrime)                 // is the number a prime?
	    System.out.println(i);    // so print the value
	}
  }
}