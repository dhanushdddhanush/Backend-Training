package demo;

import java.util.Scanner;
/*
 * here we check divisors up to square root  times if no divisor it is prime else not prime
 */
public class Day4Prime {
    public static void checkPrime(int n) {
        int count = 0;
        int number = 2;

        while (count < n) {
            boolean isPrime = true;

            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                if (number < 10) {
                    System.out.println(number + " is Small");
                } else if (number >= 10 && number <= 50) {
                    System.out.println(number + " is Medium");
                } else {
                    System.out.println(number + " is Large");
                }

                count++;
            }
            number++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of prime numbers u want: ");
        int n = sc.nextInt();
       checkPrime(n);
      
    }
}
