
public class Methodq11 {

	public static void main(String[] args) {

	}
//	11. Write a method that takes two arrays of double and returns true if the average of the 
//	elements in the first array is greater than the average of the elements in the second array.
	public static boolean firstarrgreater(double[] x, double[] y) {
		double sum1 = 0.0;
		for (int i = 0; i < x.length; i++) {
			sum1 += x[i];
			double average1 = sum1 / x.length;
		}
		double sum2 = 0.0;
		for (int j = 0; j < y.length; j++) {
			sum2 = y[j];
			double average2 = sum2 / y.length;
		}
		if (sum1/x.length > sum2/y.length) {
			return true;
		}
		return false;
		
		}
}

