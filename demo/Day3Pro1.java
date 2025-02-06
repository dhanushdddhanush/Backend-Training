package demo;

public class Day3Pro1 {
	/*1. String Manipulation (Basic String Operations)
Task:
Take a string input from the user.
Convert it to uppercase and lowercase.
Find the length of the string.
Replace all occurrences of a specific character with another character.
 */

	public static void main(String[] args) {
	       String s ="dhanush";

	        System.out.println("conversion to upper case: " + s.toUpperCase());
	        System.out.println("conversion to lower case: " + s.toLowerCase());
	        System.out.println("Size of string: " + s.length());
	        System.out.println("Replace all occurrences of 'a' with '*': " + s.replace("h", "*"));

	    
	}
}
