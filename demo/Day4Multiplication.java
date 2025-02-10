package demo;

import java.util.Scanner;
/*
 * value= used to take number
 * value*i checks if product is greater than 50 if greater it skips
 * if i%3==0 then continue it
 */

public class Day4Multiplication {

	public static void main(String[] args) {
				Scanner sc=new Scanner(System.in); 
				System.out.println("Enter The value ");
				int value=sc.nextInt();
				for(int i=1;i<=11;i++) {
				if((value*i)>50) {
						break;
					}
					if(i%3==0) {
						continue;
					}
					System.out.println(value+" x "+i+" : " + value*i);
				}

			}

		
	}


