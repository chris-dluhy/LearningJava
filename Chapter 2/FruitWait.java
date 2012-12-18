import java.io.IOException;  // for code that delays the ending of the program
public class FruitWait {
	public static void main(String[] args){
	// Declare and initialize three variables
	int numOranges = 5;      // count of oranges
	int numApples = 10;      // count of apples
	int numFruit = 0;        // count of fruit
	
	numFruit = numOranges + numApples;  // calculate the total fruit count
	
	// display the result
	
	System.out.println("A totally fruity program");
	System.out.println("Total fruit count is " + numFruit);
	
	// code to delay the ending of the program
	
	System.out.println("press Enter to exit");
	try{
		System.in.read();        // read input from the keyboard
	} catch (IOException e) {    // catch the input exception
		return;                  // return
	}
	}
}