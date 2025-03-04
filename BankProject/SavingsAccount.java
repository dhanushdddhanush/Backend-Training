package BankProject;

public class SavingsAccount{
	 private Integer interestRate;
	 BankAccount account;
	 public SavingsAccount(Integer interestRate) {
		 this.interestRate=interestRate;
	 }
	 public String toString() {
		 return "Accountnumber is : "+account.getaccountNumber()+"Account holder name is : "+account.getholderName()+"Balance is : "+account.getbalance()+"Interest rate is : "+interestRate+"Account type is : "+account.getaccountType();
	 }
}
