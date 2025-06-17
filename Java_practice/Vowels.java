package Practice;

import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
    	//Scanner class
    	Scanner sc = new Scanner(System.in);
    	
    	//Input
    	System.out.println("Enter String : ");
    	String input = sc.nextLine();
    	
    	// Empty String
    	String vowels =" ";
    	String consonants = " ";
    	String punctuations = " ";
    	
    	//  traverse through each character of the string
    	for(int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);     
           
            if ("AEIOUaeiou".indexOf(c) != -1) {  //vowels
                vowels = vowels + c;
                
            } else if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {  //consonants
                consonants = consonants + c;
                
            } else if (!Character.isWhitespace(c)) {   //ignore spaces
                punctuations = punctuations + c;
            }
    }
    	// display
    	System.out.println("Vowels are : " + vowels);
        System.out.println("Consonants are : " + consonants);
        System.out.println("Punctuations are : " + punctuations);
    }
}
