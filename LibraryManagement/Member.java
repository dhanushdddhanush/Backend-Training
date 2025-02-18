package LibraryManagement;

/**
 * Member implements User
 */
public class Member implements User {
    private String memberName;

    /**
     * Constructor to initialize a Member with a name.
     *
     * @param memberName The name of the member.
     */
    public Member(String memberName) {
        this.memberName = memberName;
    }

    /**
     * Logs in the member.
     */
    public void login() {
        System.out.println(memberName + " logged in as Member.");
    }

    /**
     * Displays the member's profile.
     */
    public void viewProfile() {
        System.out.println("Member Profile: " + memberName);
    }

    /**
     * Allows a member to borrow a book.
     *
     * @param bookTitle The title of the book to borrow.
     */
    public void borrowBook(String bookTitle) {
        System.out.println(memberName + " borrowed: " + bookTitle);
    }

    /**
     * Allows a member to return a book.
     *
     * @param bookTitle The title of the book to return.
     */
    public void returnBook(String bookTitle) {
        System.out.println(memberName + " returned: " + bookTitle);
    }
}
