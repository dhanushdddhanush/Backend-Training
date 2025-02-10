package Day5;

public class Prime {

	protected boolean checkPrime(int num) {
	if (num<=1) {
		return false;
	}
	else {
	for(int initialize=2;initialize<=Math.sqrt(num);initialize++) {
		if(num%initialize==0) {
			return false;
		}
	}
	return true;
	}
	}
}
