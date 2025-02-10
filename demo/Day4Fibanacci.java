import java.util.Scanner;

public class Day4Fibanacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        int num1 = 0, num2 = 1;

        for (int i = 1; i <= num; i++) {
            System.out.print(num1 + " ");

            if (num1 % 3 == 0 && num1 % 5 == 0) {
                System.out.println("I am spiderman and ironman");
            } else if (num1 % 3 == 0) {
                System.out.println("I am spiderman");
            } else if (num1 % 5 == 0) {
                System.out.println("I am ironman");
            } else {
                System.out.println("I am zero");
            }

            int next = num1 + num2;
            num1 = num2;
            num2 = next;

           
            if (num1 > num) {
                break;
            }
        }
    }
}
