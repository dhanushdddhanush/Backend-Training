package ExceptionHandling;
import java.util.Scanner;
public class AgeValidation {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter age : ");
		int age=scanner.nextInt(); 
		try {
			if(age<18) {
				throw new IllegalArgumentException("Age is less than 18");
				
			}
			else {
				System.out.println("You are eligible to vote");
			}
		}catch(IllegalArgumentException e) { 
			System.out.println(e);
		}
	}
	
}