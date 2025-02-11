package Day6;

public class Factorial {
	/**
	 * @param num
	 * @return
	 */
	protected int calcFact(int num) {
		if (num == 0 || num == 1) {
			return 1;
		} else {
			return num * calcFact(num - 1);
		}

	}

	private int calcFac(int num) {
		if (num == 0 || num == 1) {
			return 1;
		} else {
			return num * calcFac(num - 1);
		}
		
	}
	public int calcFacPub(int num) {
		return calcFac(num);
	}
	
	public static void main(String args[]) {
		Factorial f=new Factorial();
		System.out.println(f.calcFac(5));
	}
}
