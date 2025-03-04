package BankProject;

/**
 * InvalidAccountTypeException if account type is not savings,current,business
 */
public class InvalidAccountTypeException extends Exception {
  public  InvalidAccountTypeException(String message) {
	  super(message);
  }
}
