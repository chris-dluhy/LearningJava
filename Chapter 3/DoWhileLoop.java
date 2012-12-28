public class DoWhileLoop {
  public static void main(String[] args) {
    int limit = 20;      // end the loop after the value in limit is reached
	int sum = 0;         // accumulator variable
	int i = 1;           // loop counter variable
	
	// loop from 1 to the value held in limit, adding 1 each time
	
	do {
	  sum += i;          // add the current value of i to sum
	  i++;
	} while (i <= limit);
	
	System.out.println("sum = " + sum);
  }
}