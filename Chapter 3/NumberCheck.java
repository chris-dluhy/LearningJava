public class NumberCheck {
	public static void main(String[] args) {
		int number = 0;
		number = 1 + (int)(100 * Math.random()); // Get a random integer between 1 and 100
		if (number % 2 == 0) {
			System.out.println("You have an even number, " + number);  // we got an even number
			
		} else {
			System.out.println("You have an odd number, " + number);   // we got an odd number
		}
	}
}