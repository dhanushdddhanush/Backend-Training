package ExceptionHandling;
import java.util.*;
public class DividedByZero {
	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter number 1 : ");
	int number1=scanner.nextInt();
	System.out.println("Enter number 2 : ");
	int number2=scanner.nextInt(); 
	try { 
			int result=number1/number2; 
			System.out.println(result);
	}catch(ArithmeticException e) { 
		System.out.println(e+" Error : Number cannot be divided by zero");
	}
	scanner.close();
	}
}
