package Day5;

public class Prime {

	protected boolean checkPrime(int n) {
	if (n<=1) {
		return false;
	}
	else {
	for(int i=2;i<=Math.sqrt(n);i++) {
		if(n%i==0) {
			return false;
		}
	}
	return true;
	}
	}
}
