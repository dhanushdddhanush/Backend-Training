package demo;

public class Day2Pro5 {

	public static void main(String[] args) {
		 String [] cars = {"benz","audi","tata"};
		 System.out.println(cars[0]);
		 System.out.println(cars[2]);
		 int [] ages= {1,2,3,4};
		 System.out.println(ages[0]);
		 cars[2]="range rover";
		 System.out.println(cars[2]);
		 System.out.println("cars length:"+cars.length);
		 System.out.println("ages length:"+ages.length);
		 for(int i=0; i<cars.length;i++) {
			 System.out.println("array is:");
			 System.out.println(cars[i]);
		 }
		  for(int i : ages) {
			  System.out.println(i);
			  
		  }
		 

	}

}
