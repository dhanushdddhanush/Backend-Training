package ExceptionHandling;

class InsufficientFundsException extends Exception {
	public InsufficientFundsException(String message) {
		super(message);
	}
}

public class BankWithdrawal {

	
	public static int withdraw(int balance, int withdrawalAmount) throws InsufficientFundsException {
		if (withdrawalAmount > balance) {
			throw new InsufficientFundsException("Withdrawal amount is more than available balance.");
		}
		return balance - withdrawalAmount;
	}

	public static void main(String[] args) {
		int balance = 100; 
		int amountToWithdraw = 1000; 

		try {
			int newBalance = withdraw(balance, amountToWithdraw);
			System.out.println("Withdrawal successful. New balance: " + newBalance);
		} catch (InsufficientFundsException e) {
			System.err.println("Withdrawal failed: " + e.getMessage());
		}
	}
}