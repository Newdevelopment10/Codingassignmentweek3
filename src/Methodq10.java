
public class Methodq10 {

	public static void main(String[] args) {

	}
//	10. Write a method that takes an array of double and returns 
//	the average of all the elements in the array.
	public static double returnaverage(double[] nums) {
		double sum = 0.0;
		for (int i = 0; i < nums.length; i++) {
			sum += sum + nums[i];
		}
		double average = sum / nums.length;
		return average;
	}
}
