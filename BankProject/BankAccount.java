package BankProject;


/**
 * BankAccount classs which stores accountNumber, holderName, balance, and accountType.
 */
public class BankAccount {
	private Integer accountNumber;
	private String holderName;
	private Integer balance;
	private String accountType;
	 /**
	 * @param accountNumber
	 * @param holderName
	 * @param balance
	 * @param accountType
	 * @throws InvalidAccountTypeException
	 * @throws MinimumBalanceException
	 */
public BankAccount(Integer accountNumber, String holderName, Integer balance, String accountType) throws InvalidAccountTypeException, MinimumBalanceException {
	        if (!accountType.equalsIgnoreCase("Savings") && !accountType.equalsIgnoreCase("Current") && !accountType.equalsIgnoreCase("Business")) {
	            throw new InvalidAccountTypeException("Invalid Account Type: " + accountType);
	        }
	        if (balance < 500) {
	            throw new MinimumBalanceException("Balance cannot be less than 500");
	        }
	        this.accountNumber = accountNumber;
	        this.holderName = holderName;
	        this.balance = balance;
	        this.accountType = accountType;
	    }
	
	public String toString() {
		return "Accountnumber is : " +accountNumber+""+ "Account holder name is : " +""+holderName+""+ "Balance is : "+balance+""+ "Account type is : " +accountType;
	}

	public Integer getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Integer accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getHolderName() {
		return holderName;
	}

	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	public Integer getBalance() {
		return balance;
	}

	public void setBalance(Integer balance) {
		this.balance = balance;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

}
 