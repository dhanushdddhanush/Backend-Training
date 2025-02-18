package LibraryManagement;

public class Librarian implements User {
    private String librarianName;

    /**
     * Constructor to initialize a Librarian with a name.
     *
     * @param librarianName The name of the librarian.
     */
    public Librarian(String librarianName) {
        this.librarianName = librarianName;
    }

    /**
     * Logs in the librarian.
     */
    public void login() {
        System.out.println(librarianName + " logged in as Librarian.");
    }

    /**
     * Displays the librarian's profile.
     */
    public void viewProfile() {
        System.out.println("Librarian Profile: " + librarianName);
    }

    /**
     * Adds a book to the library catalog.
     *
     * @param title    The title of the book.
     * @param author   The author of the book.
     * @param category The category of the book.
     */
    public void addBook(String title, String author, String category) {
        System.out.println("Book " + title + "written by " + author + " added to library in " + category+" category.");
    }

    /**
     * Removes a book from the library catalog.
     *
     * @param title The title of the book to be removed.
     */
    public void removeBook(String title) {
        System.out.println("Book " + title + " removed from library.");
    }
}
