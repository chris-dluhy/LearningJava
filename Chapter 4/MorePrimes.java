import static java.lang.Math.ceil;
import static java.lang.Math.sqrt;

public class MorePrimes{
  public static void main(String[] args) {
    long[] primes = new long[20];             // an array to store primes
	primes[0] = 2L;                           // seed the first prime
	primes[1] = 3L;                           // seed the second prime
	int count = 2;                            // count of primes found up until now,
	                                          // which is also the the array index
	long number = 5L;						  // next integer to be tested
	
	outer:
	for( ; count < primes.length; number += 2L) {
	  // the maximum divisor we need to try is square root of number
	  long limit = (long)ceil(sqrt((double)number));
	  
	  // divide by all the primes we have up to to limit
	  for(int i = 1; i < count && primes[i] <= limit; ++i) {
	    if(number%primes[i] == 0L) {    // is it an exact divisor?
		  continue outer;               // yes, try the next number
		}
	  }
	  primes[count++] = number;         // we got one!
	}
	
	for(long n : primes) {
      System.out.println(n);	        // output all prime numbers
	}
  }
}