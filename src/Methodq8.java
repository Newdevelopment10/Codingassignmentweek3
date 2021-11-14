
public class Methodq8 {

	public static void main(String[] args) {
		String firstName = "Mark";
		String lastName = "Salazar";
		String fullName = createFullName(firstName, lastName);
	}
//	8. Write a method that takes two Strings, firstName and lastName, and returns a full name 
//	(the full name should be the first and the last name as a String separated by a space).
	public static String createFullName( String firstName, String lastName) {
		String fullName = firstName + " " + lastName;
		return fullName;
		
	}
}
