package ExceptionProject;

public class BankAccount implements Bank {
	private String accountNumber;
	private double balance;
	
	public  BankAccount(String accountNumber, double balance) {
		 this.accountNumber=accountNumber;
		 this.balance=balance;
	 }
	 /**
	 *displaying the details
	 */
	public void display() {
		 System.out.println("account number is :"+accountNumber);
		 System.out.println("balance is :"+balance);
		 
	 }
	 /**
	 * @return returning balance
	 */
	public double getbalance() {
		return balance;
	 }
	 /**
	 * @return returning account number
	 */
	public String getaccountNumber() {
		 return accountNumber;
	 }
	 /**
	 * @param balance
	 */
	public void setbalance(double balance) {
		 this.balance=balance;
	 }
}
	 
	 
	 








//	 public void deposit(int amount) {
//		 balance+=amount;
//		 System.out.println("Deposit of Rs."+amount+" successful");
//	 }
//	 public void withdraw(int withdrawlAmount) {
//		 if(withdrawlAmount>balance) {
//			 System.out.println("Invalid transaction");
//			 
//		 }
//		 else {
//			 balance-=withdrawlAmount;
//			 System.out.println("Withdrawl of Rs."+withdrawlAmount+" successful");
//		 }
//	 }
//	 public void checkBalance() {
//		 System.out.println("Your Balance is : "+balance);
//	 }
//	

