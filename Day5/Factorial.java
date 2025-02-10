package Day5;

public class Factorial {
	

	protected int fact(int n) {
		int sum=1;
		for(int i=1;i<=n;i++) {
			sum=sum*i;
			
		}
		return sum;
	}
}