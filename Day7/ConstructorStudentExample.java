package Day7;

public class ConstructorStudentExample {
	int id;
	String name;

	ConstructorStudentExample(int id1, String name1) {
		id = id1;
		name = name1;
	}

	void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String args[]) {

		ConstructorStudentExample con = new ConstructorStudentExample(1, "Dhanush");

		con.display();

	}
}
