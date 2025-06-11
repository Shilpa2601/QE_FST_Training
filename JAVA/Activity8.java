package Activity;

public class Activity8 {
	// Function to test strings
	
	public void exceptionTest(String str) throws StringIsEmptyException {
		if(str.isEmpty()) {
			throw new StringIsEmptyException("String cannot be empty");
		}
		else {
			System.out.println(str);
		}
	}
	// Main function
	public static void main(String[] args) {
		Activity8 obj = new Activity8();
		try {
			obj.exceptionTest("This will be printed");
			obj.exceptionTest("");
		}
		catch(StringIsEmptyException ex) {
			System.out.println(ex.getMessage());
		}
		System.out.println("End of program");
}
}