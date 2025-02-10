package demo;
import java.util.*;

public class Day4Pattren {
	public static void rows(int n) {
		for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(i);
                }
            } 
            else {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rows : ");
		int n=sc.nextInt();
		rows(n);
		
	}
}