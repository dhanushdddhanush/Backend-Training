package Collections;

import java.util.*;

public class MainFile {
	public static void main(String[] args) {

		/**
		 * Create a list of subjects for person 1
		 */
		List<String> subject1 = new ArrayList<>();
		subject1.add("Frontend");
		subject1.add("Backend");
		subject1.add("Java");
		Person person1 = new Person("Dhanush", 21, "Hyderabad", subject1);

		/**
		 * Create a list of subjects for person 2
		 */
		List<String> subject2 = new ArrayList<>();
		subject2.add("Python");
		subject2.add("C");
		subject2.add("C++");
		Person person2 = new Person("Ram", 21, "Bangalore", subject2);

		/**
		 * Create a list of subjects for person 3
		 */
		List<String> subject3 = new ArrayList<>();
		subject3.add("Cloud");
		subject3.add("SQL");
		subject3.add("Mongodb");
		Person person3 = new Person("Chandu", 23, "Bhubaneswar", subject3);

		/**
		 * Create an ArrayList to hold Person objects
		 */
		List<Person> list = new ArrayList<>();
		list.add(person1);
		list.add(person2);
		list.add(person3);

		/**
		 * Create a HashSet to hold Person objects
		 */
		Set<Person> set = new HashSet<>();
		set.add(person1);
		set.add(person2);
		set.add(person3);

		/**
		 * Create a Vector to hold Person objects
		 */
		Vector<Person> vector = new Vector<>();
		vector.add(person1);
		vector.add(person2);
		vector.add(person3);

		/**
		 * Create a Queue to hold Person objects
		 */
		Queue<Person> queue = new LinkedList<>();
		queue.add(person1);
		queue.add(person2);
		queue.add(person3);

		/**
		 * Print collections
		 */
		System.out.println("ArrayList: ");
		System.out.println(list);

		System.out.println("\nHashSet: ");
		System.out.println(set);

		System.out.println("\nVector: ");
		System.out.println(vector);

		System.out.println("\nQueue: ");
		System.out.println(queue);
		
		System.out.println("\n");
		System.out.println("Set Methods:");
		System.out.println("Set Size: "+set.size()+"\nSet isempty: "+set.isEmpty());
		
		System.out.println("\nArraylist Methods:");
		System.out.println("Arraylist Size: "+list.size()+"\nList get: "+list.get(0)+"\nList isempty: "+list.isEmpty());

	}
}
