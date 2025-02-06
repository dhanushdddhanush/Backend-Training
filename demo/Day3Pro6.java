package demo;

public class Day3Pro6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str1 = "Java";
	        String str2 = "Java";
	        System.out.println("Using == operator: " + (str1 == str2));
	        System.out.println("Using equals() method: " + str1.equals(str2));

	        String str3 = new String("Python");
	        String str4 = new String("Python");
	        System.out.println("Using == operator: " + (str3 == str4));
	        System.out.println("Using equals() method: " + str3.equals(str4));
	}

}
