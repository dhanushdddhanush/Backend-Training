package Day7;

 class MainClass {
	void message() {
		System.out.println("Hi i am from main class");
	}
}
	 class SubClass extends MainClass{
		 void messages() {
			 System.out.println("Hi i am from Sub class");
		 }
	
		}
	
	
	 
	public class InheritanceExample {
	public static void main(String[] args) {
		SubClass ih= new SubClass();
		ih.message();
		ih.messages();
	}
	}
