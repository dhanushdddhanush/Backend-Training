package BankProject;

import java.util.*;

public class BankAccounts{
	private Map<String, List<BankAccount>> accountsMap=new HashMap<>();
	
	public void addBankAccount(BankAccount bank) {
		
		String acccountType = bank.getAccountType();
		if (! accountsMap.containsKey(acccountType)) {
			 accountsMap.put(acccountType, new ArrayList<>());
		}
		List<BankAccount> storeAccounts =  accountsMap.get(acccountType);
		storeAccounts.add(bank);
        System.out.println("Bank Account added: " + bank);
	}
	public void displayAccountsByType(String accountType) {
	    List<BankAccount> accounts = accountsMap.get(accountType);
	    
	    if (accounts != null) {
	    	accounts.sort((BankAccount1, BankAccount2) -> BankAccount2.getBalance().compareTo(BankAccount1.getBalance()));
			for (BankAccount banks : accounts) {
				System.out.println(banks);
			}
		}
	}

	

}
