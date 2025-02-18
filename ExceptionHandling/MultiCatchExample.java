package ExceptionHandling;

import java.util.Scanner;

public class MultiCatchExample {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an index : ");
        String input = scanner.nextLine();
        
        try {
          
            int index = Integer.parseInt(input);
            System.out.println("Number at index " + index + " is: " + numbers[index]);
        } 
        
        
        
        catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
            System.out.println("Error: " + e);
        } finally {
            scanner.close();
        }
    }
}
