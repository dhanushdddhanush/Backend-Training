package BankProject;

/**
 * SavingsAccount class
 */
public class SavingsAccount extends BankAccount {
	private Integer interestRate;

	/**
	 * @param accountNumber
	 * @param holderName
	 * @param balance
	 * @param accountType
	 * @param interestRate
	 * @throws InvalidAccountTypeException
	 * @throws MinimumBalanceException
	 */
	public SavingsAccount(Integer accountNumber, String holderName, Integer balance, String accountType,
			Integer interestRate) throws InvalidAccountTypeException, MinimumBalanceException {
		super(accountNumber, holderName, balance, accountType);
		this.interestRate = interestRate;
	}

	public String toString() {
		return super.toString() + ", InterestRate: " + interestRate;
	}

	public Integer getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Integer interestRate) {
		this.interestRate = interestRate;
	}
	
}
