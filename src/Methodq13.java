
public class Methodq13 {
	double[] grocerylist = {2.50, 3.99, 4.99, 10.99, 6.50};
	
	public static void main(String[] args) {

	}
//	13. Create a method of your own that solves a problem. 
//	In comments, write what the method does and why you created it.
	public static double printPriceofGroceries (double[] groceries) {
		double sum = 0.0;
		for (double l : groceries) {
			sum += groceries[l];
		}
		return sum;
		
	}
	
}
