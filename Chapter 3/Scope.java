public class Scope {
  public static void main(String[] args) {
    int outer = 1;    //exists throughout the method
	
	{
	  int inner = 2;
	  System.out.println("inner = " + inner);
	  System.out.println("outer = " + outer);
	}
	// the previous inner is out of scope, so you can declare another variable named inner
	// outer remains in scope so it still exists
	int inner = 3;
	System.out.println("inner = " + inner);
	System.out.println("outer = " + outer);
  }
}