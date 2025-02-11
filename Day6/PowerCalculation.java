package Day6;

public class PowerCalculation {
	protected int powerCal(int base,int pow) {
		if(pow==0) {
			return 1;
		}
		return base*powerCal(base,pow-1);
	}

}
