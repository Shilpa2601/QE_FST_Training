package Practice;

import java.util.Scanner;

public class Factorial {
	 public static long factorial(int n) {

	        if (n == 0 || n == 1) {
	            return 1; 

	        } else {
	            return n * factorial(n - 1); 
	        }
	    }
	    public static void main(String[] args) {

	        Scanner s = new Scanner(System.in);
	        
	        // Input from user
	        System.out.print("Enter a number to find its factorial: ");
	        int number = s.nextInt();
	        // Check for negative input

	        if (number < 0) {
	            System.out.println("Factorial is not defined for negative numbers.");

	        } else {
	            long result = factorial(number);
	            System.out.println("Factorial of " + number + " is: " + result);
	        }
	    }
}
