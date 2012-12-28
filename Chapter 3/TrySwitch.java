public class TrySwitch {
  enum WashChoice {cotton, linen, wool, synthetic}  // define enumeration types
  
  public static void main(String[] args) {
    // variable to define the choice of wash
	WashChoice wash = WashChoice.cotton;
	
	// the clothes variable specifies the clothes to be washed by an integer
	// 1: shirts  2: sweaters  3:socks  4:sheets  5:pants
	int clothes = 3;
	
	switch (clothes) {
	  case 1:
	    System.out.println("Wahsing shirts.");
		wash = WashChoice.cotton;
		break;
	  case 2:
	    System.out.println("Washing sweaters.");
		wash = WashChoice.wool;
		break;
	  case 3:
	    System.out.println("Washing socks.");
		wash = WashChoice.wool;
		break;
	  case 4:
	    System.out.println("Washing sheats.");
		wash = WashChoice.linen;
		break;
	  case 5:
	    System.out.println("Washing pants");
		wash = WashChoice.synthetic;
		break;
	  default:
	    System.out.println("Unknown washing - default synthetic");
		wash = WashChoice.synthetic;
		break;
	}
	System.out.println("Wash is " + wash);
	
	// now select the wash temperature
	switch(wash) {
	  case wool:
	    System.out.println("Temperature is 120.");
		break;
	  case cotton:
	    System.out.println("Temperature is 170.");
		break;
	  case synthetic:
	    System.out.println("Temperature is 130.");
		break;
	  case linen:
	    System.out.println("Temperature is 180.");
		break;
	}
  }
}