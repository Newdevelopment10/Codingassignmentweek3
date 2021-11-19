
public class Methodq12 {
	 static boolean tempOutside = true;
	 static double money = 11.00;

	public static void main(String[] args) {
		System.out.println(willBuyDrink(tempOutside, money));
	}
//	12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double 
//	moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if (isHotOutside && (moneyInPocket > 10.50)) {
			return true;
		}
		return false;
		
}
	
}