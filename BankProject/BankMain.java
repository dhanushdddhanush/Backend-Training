package BankProject;
import java.util.*;

public class BankMain {
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccounts bankAccounts = new BankAccounts();

        System.out.print("Enter number of accounts to create: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            try {
                System.out.print("Enter Account Number: ");
                int accNum = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Enter Holder Name: ");
                String name = scanner.nextLine();

                System.out.print("Enter Balance: ");
                int balance = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Enter Account Type : ");
                String type = scanner.nextLine();

               bankAccounts.addBankAccount(new BankAccount(accNum, name, balance, type));
                
            } catch (InvalidAccountTypeException | MinimumBalanceException e) {
                System.out.println("Error: " + e.getMessage());
              
            }
            
        }
	
	}
}


