package Practice;

import java.util.*;

public class DuplicateCheck{
		public static void main(String[] args) {
			
		try {
		List<Integer> numbers = Arrays.asList(5,6,19,37,6); // Sample list with a duplicate
		checkForDuplicates(numbers);

		System.out.println("No duplicate numbers found.");
		} 
		catch (DuplicateNumberException e) {
		System.out.println("Error: " + e.getMessage());
		}
		}
		public static void checkForDuplicates(List<Integer> numbers) throws DuplicateNumberException {
			
		Set<Integer> uniqueNumbers = new HashSet<>();

		for (Integer number : numbers) {
		if (!uniqueNumbers.add(number)) {

		throw new DuplicateNumberException("Duplicate number is : " + number);
		}
		}
		}
}
