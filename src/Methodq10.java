
public class Methodq10 {
	static double[] test = {1.20, 4.50, 5.75};
	
	public static void main(String[] args) {
		
		System.out.println(returnAverage(test));
	}
//	10. Write a method that takes an array of double and returns 
//	the average of all the elements in the array.
	public static double returnAverage(double[] nums) {
		double sum = 0.0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}
		double average = sum / nums.length;
		return average;
	}
	
	
	
	
}
