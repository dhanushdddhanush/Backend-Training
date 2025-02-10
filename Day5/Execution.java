package Day5;

public class Execution {

	public static void main(String[] args) {
		
		/*
		 * Factorial checking
		 */
		Factorial f=new Factorial();
		System.out.println(f.fact(5));
		/*
		 * Prime number checking
		 */
		Prime p=new Prime();
		System.out.println(p.checkPrime(7));
		/*
		 * sum of digits
		 */
		 Sum s=new Sum();
		 System.out.println(s.sumOfDigits(5));
		 /*
		  * C to f converter
		  */
		 Temperature t= new Temperature();
		 System.out.println(t.convert(10));
		 /*
		  * fibonacci series
		  */
		 Fibonacci fib=new Fibonacci();
		 
		 for(int i=0;i<=10;i++) {
		 System.out.println(fib.series(i));
		 }
	}

}
