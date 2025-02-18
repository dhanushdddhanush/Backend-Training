package ExceptionHandling;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileReadExample {
    
    public static void readFile(String fileName) throws IOException {
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);
        
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(line);
        }
        
        scanner.close();
    }
    
    public static void main(String[] args) {
        String fileName = "java.txt";  
        
        try {
            readFile(fileName);
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e);
            e.printStackTrace();
        }
    }
}