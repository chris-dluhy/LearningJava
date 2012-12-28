public class Factorial {
  public static void main (String[] args) {
    long limit = 20L;           // calculate factorials of integers up to this limit
	long factorial = 1L;        // a factorial will be stored in this variable
	
	// loop from 1 to the value stored in limit
	for (long i = 1L; i <= limit; ++i) {
	  factorial = 1L;           // initialize factorial
	  
	  for (long factor = 2; factor <= i; ++factor) {
	    factorial *= factor;
	  }
	  System.out.println(i + "! is " + factorial);
	}
  }
}