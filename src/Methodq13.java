
public class Methodq13 {
	static boolean dayOfTheWeek = true; 
	static double moneyForGroceries = 90.00;
	public static void main(String[] args) {
		
		System.out.println(affordGroceries(dayOfTheWeek, moneyForGroceries));
	}
//	13. Create a method of your own that solves a problem. 
//	In comments, write what the method does and why you created it.
	public static boolean affordGroceries (boolean tuesday, double moneyForFood) {
		if (tuesday && (moneyForFood >= 100.00)) {
			return true;
		}
		return false; 
// Method that returns true if I can afford groceries on shopping day	 
	}
	
}
