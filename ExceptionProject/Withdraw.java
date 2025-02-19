package ExceptionProject;

public class Withdraw implements Bank{
	private BankAccount account;
	public Withdraw(BankAccount account) {
		this.account=account;
	}
	public void withdraw(double amount) {
try {
		if(amount>account.getbalance()) {
			throw new InsufficientFundsException("invalid insufficient funds");
		}
		
		else {
			account.setbalance(account.getbalance()-amount);
			System.out.println("Withdrawal of Rs."+amount+" Successful.");
		}
}catch(InsufficientFundsException e) {
	System.out.println(e);
} 


		
	}
	
	public void display() {
		System.out.println("Your acount no "+account.getaccountNumber()+" balance is Rs."+account.getbalance());
		
		
	}

}