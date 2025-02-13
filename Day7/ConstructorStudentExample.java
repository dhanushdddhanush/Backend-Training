package Day7;

public class ConstructorStudentExample {
	int id;
	String name;

	ConstructorStudentExample(int i, String n) {
		id = i;
		name = n;
	}

	void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String args[]) {

		ConstructorStudentExample con = new ConstructorStudentExample(1, "Dhanush");

		con.display();

	}
}
