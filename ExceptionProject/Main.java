package ExceptionProject;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your Account Number:");
		String accnumber=scanner.nextLine();
		BankAccount bankacc1=new BankAccount(accnumber,1000);
		BankAccount bankacc2=new BankAccount(accnumber,2000);
		Deposit moneydeposit=new Deposit(bankacc1);
		Withdraw moneywithdraw=new Withdraw(bankacc1);
		Deposit moneydeposit1=new Deposit(bankacc2);
		Withdraw moneywithdraw1=new Withdraw(bankacc2);
		try {
		if(accnumber.equals("SBI001")||accnumber.equals("SBI002")) {
		System.out.println("Welcome to bank");
		System.out.println("\nBrowse from below services");
		 System.out.println("1. Deposit");
         System.out.println("2. Withdraw");
         System.out.println("3. Check Balance");
         System.out.println("4. Exit");
         System.out.print("Choose an option: ");
         int choice = scanner.nextInt();
         switch(choice) {
         case 1:{
        	 System.out.println("Welcome to Deposit");
        	 System.out.println("Enter the amount to deposit:");
        	 double depositamount=scanner.nextDouble();
        	 if(accnumber.equals("SBI001")) {
        	 moneydeposit.deposit(depositamount);
        	 moneydeposit.display();
        	 break;
        	 }
        	 else if(accnumber.equals("SBI002")) {
        	 moneydeposit1.deposit(depositamount);
        	 moneydeposit1.display();
        	 break;
        	 }
         }
         case 2:{
        	 System.out.println("Welcome to withdrawl");
        	 System.out.println("Enter the amount to withdraw:");
        	 double withdrawamount=scanner.nextDouble();
        	 if(accnumber.equals("SBI001")) {
        	 moneywithdraw.withdraw(withdrawamount);
        	 moneywithdraw.display();
        	 break;}
        	 else if(accnumber.equals("SBI002")) {
        		moneywithdraw1.withdraw(withdrawamount); 
        		moneywithdraw1.display();
        		break;
        	 }
         }
         case 3:{
        	 System.out.println("Check Balance:");
        	 if(accnumber.equals("SBI001")) {
        	 bankacc1.display();
        	 break;
        	 }
        	 else if(accnumber.equals("SBI002")) {
        		 bankacc2.display();
        		 break;
        	 }
        	 
         }
         case 4:{
        	 System.out.println("Exit");
        	 scanner.close();
             System.exit(0);
             break;
         }

         default:{
             System.out.println("Invalid choice! Try again.");
         }
         
         
         
         
         }
		}
		
		
         else {
        	 throw new InvalidAccountException("Invalid Account Number");
     	}
		}catch(InvalidAccountException e) {
			System.out.println(e);
		}
         
         
            
	}
	}
	


