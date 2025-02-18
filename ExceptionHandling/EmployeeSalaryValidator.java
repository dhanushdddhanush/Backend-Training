package ExceptionHandling;

class InvalidSalaryException extends Exception {
	public InvalidSalaryException(String message) {
		super(message);
	}
}

public class EmployeeSalaryValidator {

	public static void setSalary(double salary) throws InvalidSalaryException {
		if (salary < 3000) {
			throw new InvalidSalaryException("Salary must be at least 3000. Provided salary: " + salary);
		} else {
			System.out.println("Salary set successfully.");
		}
	}

	public static void main(String[] args) {
		double salaryToTest = 2000;

		try {
			setSalary(salaryToTest);
		} catch (InvalidSalaryException e) {
			System.err.println("Error: " + e.getMessage());
		}
	}
}