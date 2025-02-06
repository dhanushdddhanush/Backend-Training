package demo;

public class Day3Pro3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer buffer = new StringBuffer("Hello");
        System.out.println("Before appending: " + buffer);

        buffer.append(" World");
        buffer.append("!");
        System.out.println("After appending: " + buffer);

        buffer.insert(6, "Beautiful ");
        System.out.println("After inserting at index 6: " + buffer);

	}

}
