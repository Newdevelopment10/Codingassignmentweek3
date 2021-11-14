
public class Methodq7 {

	public static void main(String[] args) {
	
	}
//	7. Write a method that takes a String, word, and an int, n, as arguments and returns the word 
//	concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, 
//	I would expect the method to return “HelloHelloHello”).
	public static String repeatHello(String word, int n) {
		String result = "";
		for ( int i = 0; i < n; i++) {
			result += word;
		}
		return result;
	}

}
