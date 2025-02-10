package demo;

import java.util.Scanner;

public class Day4Marks {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter students marks : ");
		int marks=sc.nextInt();
		if(marks<0 || marks>100) {
			System.out.println("Invalid Marks");
		}
		else {
            String grade;
            if (marks >= 90) {
                grade = "A";
            } else if (marks >= 80) {
                grade = "B";
            } else if (marks >= 70) {
                grade = "C";
            } else if (marks >= 60) {
                grade = "D";
            } else {
                grade = "F";
            }
            
            switch (grade) {
                case "A":
                    System.out.println("Grade A");
                    break;
                case "B":
                    System.out.println("Grade B");
                    break;
                case "C":
                    System.out.println("Grade C");
                    break;
                case "D":
                    System.out.println("Grade D");
                    break;
                default:
                    System.out.println("Grade F");
			
			}
		}
		sc.close();
	}

}