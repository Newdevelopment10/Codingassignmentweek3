
public class Methodq9 {
	
	static int[] numbers = {2, 5, 10, 31, 22, 50, 100};
	public static void main(String[] args) {
		System.out.println(returnsTrue(numbers));
		
	}
//	9. Write a method that takes an array of int 
//	and returns true if the sum of all the ints in the array is greater than 100.
	public static boolean returnsTrue(int[] nums) {
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
		if (sum > 100) {
			return true;
		}
		
	}
			return false;
}
	
}
