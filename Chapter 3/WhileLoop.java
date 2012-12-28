public class WhileLoop {
  public static void main(String[] args) {
    int limit = 20;       // stop iterating when this value has bee reached
	int sum = 0;          // accumulate teh sum in this variable
	int i = 1;            // loop counter
	
	// loop from i to limit, adding 1 each time through the loop
	while (i <= limit) {
	  sum += i++;         // add teh current value of i to sum
	}
	System.out.println("sum = " + sum);
  }
}