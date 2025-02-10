package Day5;

public class Factorial {
	

	protected int fact(int n) {
		int sum=1;
		for(int initialize=1;initialize<=n;initialize++) {
			sum=sum*initialize;
			
		}
		return sum;
	}
}