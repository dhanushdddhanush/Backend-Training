package Day8;

public class Bank {
 public static void main(String[] args) {
	 DefaultBankRbi axis = new AxisBank(1000);
	 DefaultBankRbi lic = new Lic(1500);

     System.out.println("Axis Bank");
     axis.checkBalance();
     axis.withdraw(200);
     axis.deposit(100);
     axis.loanInfo(1000);
     System.out.println(" ");
     System.out.println("Lic");
     lic.checkBalance();
     lic.withdraw(300);
     lic.deposit(200);
     lic.loanInfo(1000);
 }
}