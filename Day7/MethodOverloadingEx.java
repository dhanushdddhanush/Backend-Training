package Day7;

public class MethodOverloadingEx {
	void over(String name) {
		System.out.println("Name is: " + name);
	}

	void over(int age) {
		System.out.println("Age: " + age);
	}

	public static void main(String[] args) {
		MethodOverloadingEx method = new MethodOverloadingEx();
		method.over("Dhanush");
		method.over(22);

	}
}
