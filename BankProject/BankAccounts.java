package BankProject;

import java.util.*;

public class BankAccounts{
	private Map<String, List<BankAccount>> accountsMap=new HashMap<>();
	
	public void addBankAccount(BankAccount bank) {
		
		String acccountType = bank.getaccountType();
		if (! accountsMap.containsKey(acccountType)) {
			 accountsMap.put(acccountType, new ArrayList<>());
		}
		List<BankAccount> storeAccounts =  accountsMap.get(acccountType);
		storeAccounts.add(bank);
        System.out.println("Bank Account added: " + bank);
	}
	public void displayAccountsByType(String accountType) {
        List<BankAccount> accounts = accountsMap.get(accountType);
        if (accounts.isEmpty()) {
            System.out.println("No accounts found for type: " + accountType);
        } else {
           System.out.println("details are");
            for (BankAccount bank : accounts) {
				System.out.println(bank);
			}
        }
    }

}

