package demo;
import java.util.*;
/*
 * here if  number dived by 5 then we have to skip those 
 * and rest we have to show whether the number is divided by 2 or 3 and print it
 */
public class Day4Div {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number ");
		int range=sc.nextInt();
		for(int i=1;i<=range;i++) {
			if(i%5==0) {
				continue;
			}
			if(i%2==0) {
				System.out.println(i+" is divisible by 2");
			}
			else if(i%3==0) {
				System.out.println(i+" is divisible by 3");
			}
		}
		sc.close();
	}
}