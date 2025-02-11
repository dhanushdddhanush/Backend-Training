package Day6;

/**
 * 
 */
public class Execution {

	
	public static void main(String[] args) {
		/*
		 * Factorial using protected
		 */
		Factorial pro=new Factorial();
		System.out.println("Factorial by Protected: "+pro.calcFact(5));
		/*
		 * Factorial using private method
		 */
		Factorial pvt=new Factorial();
		System.out.println("Factorial by Private: "+pvt.calcFacPub(5));
		/*
		 * Array sum
		 */
		int arr[]= {1,2,3,4};
		int n=arr.length;
		SumOfArray sums=new SumOfArray();
		System.out.println("Sum of array by Protected: "+sums.sum(arr, n));
		/*
		 * Gcd
		 */
		Gcd cal=new Gcd();
		System.out.println("Gcd by Protected: "+cal.calGcd(15, 3));
		/*
		 * Palindrome
		 */
		Palindrome pal=new Palindrome();
		String Str1 = "madam";  
	    boolean result = pal.checkPalindrome(Str1, 0, Str1.length() - 1);
        System.out.println(Str1 + (result ? " is a palindrome." : " is not a palindrome."));
        /*
         * Power
         */
			PowerCalculation calci=new PowerCalculation();
			System.out.println("power by Protected: "+calci.powerCal(5,2));
	}
	

}
