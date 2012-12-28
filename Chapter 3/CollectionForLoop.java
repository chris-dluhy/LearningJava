public class CollectionForLoop {
  enum Season { spring, summer, fall, winter }  // enumeration type definition
  
  public static void main(String[] args) {
    for (Season season : Season.values()) {     // iterate over all values in Season
	  System.out.println("The season is now " + season);
	}
  }
}