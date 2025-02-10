package Day5;

public class Fibonacci {
	
		protected int series(int n) {
			if(n<=1) {
				return n;
			}
			
			return series(n-1)+series(n-2);
			
		}

	}



