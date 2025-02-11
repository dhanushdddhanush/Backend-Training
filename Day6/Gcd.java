package Day6;

public class Gcd {
	protected int calGcd(int number1, int number2) {
		
	        if (number2 == 0) {
	            return number1;
	        }
	        return calGcd(number2, number1 % number2);
	}

}
