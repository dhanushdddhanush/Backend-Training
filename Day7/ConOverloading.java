package Day7;

public class ConOverloading {
	int id;
	String name;
	int age;

	public ConOverloading(int i, String n) {
		id = i;
		name = n;
	}

	public ConOverloading(int i, String n, int a) {
		id = i;
		name = n;
		age = a;
	}

	void display() {
		System.out.println(id + " " + name + " " + age);
	}

	public static void main(String args[]) {
		ConOverloading con1 = new ConOverloading(1, "Dhanush");
		ConOverloading con2 = new ConOverloading(2, "Ram", 25);
		con1.display();
		con2.display();
	}
}