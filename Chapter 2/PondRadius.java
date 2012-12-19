public class PondRadius {
	public static void main(String[] args){
		// Calculate the radius of a pond
		// which can hold 20 fish averaging 10 inches long
		int fishCount = 20;                     // number of fish in the pond
		int fishLength = 10;                    // average lenght of the fish
		int inchesPerFoot = 12;                 // number of inches in one foot
		int lenghtPerSqrFt = 2;                 // fish lenght per square foot of pond surface
		double radius = 0.0;                    // pond radius in feet
		
		int feet = 0;                           // pond radius - whole feet
		int inches = 0;                         //             - and whole inches
		
		double pondArea = (double)(fishCount * fishLength) / lenghtPerSqrFt;
		radius = Math.sqrt(pondArea / Math.PI);
		
		// get the whole feet and nothing else
		feet = (int)Math.floor(radius);         
		// get the inches
		inches = (int)Math.round(inchesPerFoot * (radius - feet));
		
		System.out.println(
					"To hold " + fishCount + " fish averaging " + fishLength +
					" inches long you need a pond with an area of \n" +
					pondArea + " square feet.");
		System.out.println("The radius of a pond with area " + pondArea +
					" square feet is " + feet + " feet " + inches + " inches.");					
	}
}