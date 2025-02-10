package Day5;

public class Fibonacci {
	
		protected int series(int num) {
			if(num<=1) {
				return num;
			}
			
			return series(num-1)+series(num-2);
			
		}

	}



