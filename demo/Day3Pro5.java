package demo;

public class Day3Pro5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a = 100;
	        Integer b = a; 
	        System.out.println("AutoBoxing value from int to Integer: " + b);
	        int c = b; 
	        System.out.println("Unboxing value from Integer to int: " + c);
             String d = "123";
	        int e = Integer.parseInt(d);
	        System.out.println("String to Integer: " + e);
            Integer f = 456;
	        String g = f.toString();
	        System.out.println("Integer to String: " + g);

	}

}
