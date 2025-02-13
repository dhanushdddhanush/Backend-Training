package Day7;

public class ConOverloading {
	int id;
	String name;
	int age;

	public ConOverloading(int id1, String name1) {
		id = id1;
		name = name1;
	}

	public ConOverloading(int id2, String name2, int age1) {
		id = id2;
		name = name2;
		age = age1;
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