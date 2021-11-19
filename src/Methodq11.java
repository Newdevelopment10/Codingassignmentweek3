
public class Methodq11 {
	static double[] array1= {2, 5, 8, 4, 100};
	static double[] array2= {1, 3, 6, 10};
	public static void main(String[] args) {
		System.out.println(firstarrgreater(array1, array2));
	}
//	11. Write a method that takes two arrays of double and returns true if the average of the 
//	elements in the first array is greater than the average of the elements in the second array.
	public static boolean firstarrgreater(double[] x, double[] y) {
		double sum1 = 0.0;
		for (int i = 0; i < x.length; i++) {
			sum1 += x[i];
		}
		double average1 = sum1 / x.length;
		double sum2 = 0.0;
		for (int j = 0; j < y.length; j++) {
			sum2 += y[j];		
		}
		double average2 = sum2 / y.length;
		if (average1 > average2) {
			return true;
		}
		return false;
		
	}
	
}

