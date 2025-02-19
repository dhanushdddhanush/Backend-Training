package ExceptionProject;

public class Deposit implements Bank {
	private BankAccount account;
	public  Deposit(BankAccount account) {
		this.account=account;
		
	}

	
	
	/**
	 * @param amount
	 */
	public void deposit(double amount) {
		try {
			if(amount<0) {
				throw new NegativeAmountException("Deposit cannot be negative");
			}
		 account.setbalance(account.getbalance()+amount);
		 System.out.println("Deposit of Rs."+amount+" successful");
		}catch( NegativeAmountException e) {
			System.out.println(e);
		}
	 }

	/**interface display method
	 *
	 */
	public void display() {
		System.out.println("Your acount no "+account.getaccountNumber()+" balance is Rs."+account.getbalance());
		
	}
}
