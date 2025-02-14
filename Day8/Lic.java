package Day8;


public class Lic implements DefaultBankRbi {
 private double balance;
 double charge = 9; 
 double loanrepay;

 public Lic(double balance) {
     this.balance = balance;
 }

 public void withdraw(double amount) {
     double requestedAmount = amount + charge;
     if (requestedAmount <= balance) {
         balance = balance - requestedAmount;
         System.out.println("Withdrawal successful " + amount +" debited from your account");
         System.out.println("Charges for your transaction: " + charge);
         System.out.println("Remaining balance: " + balance);
     } else {
         System.out.println("Insufficient balance.");
     }
 }

 public void checkBalance() {
     System.out.println("Your balance is: " + balance);
 }

 public void deposit(double amount) {
     balance=balance+ amount;
     System.out.println("Deposit successful.");
     System.out.println("Updated balance:"+ balance);
 }
 public void loanInfo(double loanamount) {
	 System.out.println("You requested loan of amount:"+loanamount);
	 loanrepay=loanamount+(loanamount)*charge/100;
	 System.out.println("You have to repay:"+loanrepay);
	 
	 
 }
}
