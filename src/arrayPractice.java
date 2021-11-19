
public class arrayPractice {

	static String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
	int[] nameLengths = new int[names.length]; 
	public static void main(String[] args) {
		
		new arrayPractice().run();
	}

	private void run() {
//		2a. Use a loop to iterate through the array and calculate the average number 
//		of letters per name. Print the result to the console.
		int sum = 0;
		for (String name : names) {
			sum += name.length();	
		}
		System.out.println(sum/names.length);
//		2b. Use a loop to iterate through the array again and concatenate all the names together, 
//		separated by spaces, and print the result to the console.
		String result = "";
		for (String name : names) {
			result += name + " ";	
		}
		
		System.out.println(result);

//	5. Create a new array of int called nameLengths. Write a loop to iterate over the previously 
//		created names array and add the length of each name to the nameLengths array.
		for (int i = 0; i < names.length; i++) {
		nameLengths[i] = names[i].length();
		System.out.println(names[i].length());
	}
//	6. Write a loop to iterate over the nameLengths array and calculate the sum of all the 
//	elements in the array. Print the result to the console.
	int sum1 = 0;
	for (int len : nameLengths) {
			sum1 += len;
		}
	System.out.println(sum1);
}
}

