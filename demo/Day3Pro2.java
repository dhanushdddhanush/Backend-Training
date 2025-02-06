package demo;

import java.util.Scanner;

public class Day3Pro2 {
	public static void main (String args[]) {
		
	System.out.println("Enter string: ");
	Scanner sc = new Scanner(System.in);
	String s=sc.nextLine();
	StringBuilder sb=new StringBuilder(s);
	String reverse=sb.reverse().toString();
	System.out.println("Reversed String : "+reverse);
	if(s.equalsIgnoreCase(reverse)) {
		System.out.println("It is Palindrome");
	}
	else {
		System.out.println("It is not Palindrome");
	}
	System.out.println("\n");
	}

}
