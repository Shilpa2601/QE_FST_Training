package Practice;

import java.util.Scanner;

public class Fibonaci {
		    // Recursive method to get fibonaci number at a given position
		    public static int fibonaci(int n) {

		        if (n <= 0) {
		            return 0; 

		        } else if (n == 1) {
		            return 1; 

		        } else {
		            return fibonaci(n - 1) + fibonaci(n - 2); // Recursive case
		        }
		    }
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        // Input from user
		        System.out.print("Enter the position : ");
		        int position = scanner.nextInt();
		        
		        if (position < 0) {
		            System.out.println("Invalid position!!");

		        } else {
		            int res = fibonaci(position);
		            System.out.println("Fibonaci number at position " + position + " is: " + res);
		        }
		    }
}
