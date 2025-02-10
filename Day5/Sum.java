package Day5;

public class Sum {
	protected int sumOfDigits(int n) {
		 int sum=0;
		for(int i=0; i<=n;i++) {
			sum=sum+i;
		}
		return sum;
	}

}
