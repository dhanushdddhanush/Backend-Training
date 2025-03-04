package BankProject;


public class BankAccount {
//	accountNumber, holderName, balance, and accountType.
	private Integer accountNumber;
	private String holderName;
	private Integer balance;
	private String accountType;
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
	public Integer getaccountNumber() {
		return accountNumber;
	}
	public String getholderName() {
		return holderName;
	}
	public Integer getbalance() {
		return balance;
	}
	public String getaccountType() {
		 return accountType;
	}
	public void setaccountType(String accountType) {
		this.accountType=accountType;
	}
	public String toString() {
		return "Accountnumber is : " +accountNumber+""+ "Account holder name is : " +""+holderName+""+ "Balance is : "+balance+""+ "Account type is : " +accountType;
	}

}
 