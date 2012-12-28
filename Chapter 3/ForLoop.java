public class ForLoop {
  public static void main(String[] args) {
    int limit = 20;      // sum from one to this value 
	int sum = 0;         // accumulate the sum here
	
	// loop from 1 to the value held in limit, adding 1 during each iteration
	for (int i = 1; i <= limit; ++i) {
	  sum += i;
	}
	System.out.println("sum = " + sum);
  }
}