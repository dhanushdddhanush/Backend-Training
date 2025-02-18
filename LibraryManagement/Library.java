package LibraryManagement;

import java.util.Scanner;

/**
 * The main class that runs the Library Management.
 */
public class Library {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Select User Type from the options
        System.out.println("Select User Type");
        System.out.println("\nmember or librarian:");
        String userType = scanner.nextLine();

        if (userType.equals("member")) {
            // Member and its functions
            System.out.println("\nEnter Member Name:");
            String memberName = scanner.nextLine();
            Member member = new Member(memberName);
            member.login();
            member.viewProfile();

            // books which are available
            Books.displayBooks();

            // Borrow a Book from library
            System.out.println("\nEnter book name to borrow:");
            String borrowBook = scanner.nextLine();

            if (borrowBook.equals("java")||borrowBook.equals("python")||borrowBook.equals("javascript")) {
            member.borrowBook(borrowBook);}
            else {
            	System.out.println("Sorry there is no such book to borrow");
            System.out.println("please try again....");
            
            }
        

            // Returning Book

            System.out.println("\nEnter book name to return:");
            String returnBook = scanner.nextLine();

            if (borrowBook.equals(returnBook)) {
            member.returnBook(returnBook);
            }
            else {
            	System.out.println("Invalid return, u have borrowed "+borrowBook+ " not "+returnBook+" please return "+borrowBook+" book.");
            	System.out.println("please try again...");
            	System.out.println("\nEnter book name to return:");
                String reReturnBook = scanner.nextLine();
                if (borrowBook.equals(reReturnBook)) 
                { member.returnBook(reReturnBook);}
                else {
                	System.out.println("Please try again tomorrow.");
                }
            }

        }  // Librarian and his functions
        
        else if (userType.equals("librarian")) {
           
            System.out.println("\nEnter Librarian Name:");
            String librarianName = scanner.nextLine();
            Librarian librarian = new Librarian(librarianName);
            librarian.login();
            librarian.viewProfile();

            // Librarian adds a book
            librarian.addBook("web devlopment", "ram", "webbook");

            // Librarian removes a book
            
            librarian.removeBook("javascript");

        } else {
            System.out.println("Invalid User Type. Please enter between member or librarian.");
        }

        scanner.close();
    }
}
