public class Factorial2 {
  public static void main (String[] args) {
    long limit = 20L;           // calculate factorials of integers up to this limit
	long factorial = 1L;        // a factorial will be stored in this variable
	
	// loop from 1 to the value stored in limit	
    OuterLoop:
	for (long i = 1L; i <= limit; ++i) {
	  factorial = 1;           // initialize factorial
	  for (long j = 2L; j <= i; ++j) {
	    if(i > 10L && i % 2L == 1L) {
		  continue OuterLoop;        // transfer to the outer loop
		}
		factorial *= j;
	  }
	  System.out.println(i + "! is " + factorial);
	}
  }
}