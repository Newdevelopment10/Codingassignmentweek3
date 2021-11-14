
public class Codingassign3 {

	static int[] arrayAges = {1, 3, 9, 23, 64, 2, 8, 28, 93, 57};
	
	public static void main(String[] args) {
		
		new Codingassign3().run();
	}
//	1a. Programmatically subtract the value of the first element in the array from the value in the last 
//	element of the array (i.e. do not use ages[7] in your code). Print the result to the console.
//	1b. Add a new age to your array and repeat the step above to ensure it 
//	is dynamic (works for arrays of different lengths).
//	1c. Use a loop to iterate through the array and calculate the average age. 
//	Print the result to the console.
	private void run() {
		int subtraction = arrayAges[arrayAges.length-1] - arrayAges[0];
		System.out.println(subtraction);
		int sum = 0;
		for (int i = 0; i < arrayAges.length; i++) {
			sum += arrayAges[i];
		}	

		System.out.println("This is the average for ages: " + sum/arrayAges.length);
	}
}
