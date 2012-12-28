public class ConditionalOp {
  public static void main(String[] args) {
    int nHats = 1;          // number of hats
	System.out.println("I have " + nHats + " hat" + (nHats == 1 ? "." : "s."));
	
	nHats++;                 // increment the number of hats
	System.out.println("I have " + nHats + " hat" + (nHats == 1 ? "." : "s."));
  }
}