package demo;
import java.util.*;
/*
 * here if the row is even number row like 2 then i printed that row number else if odd then printed *
 */
public class Day4Pattren {
    public static void rows(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % 2 == 0) {
                    System.out.print(i);
                } 
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows: ");
        int n = sc.nextInt();
        rows(n);
    }
}