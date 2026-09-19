// Program: No-Argument Constructor with Default Values

// Declaring Book class
class Book {

    // Instance variables
    int bookId;
    String bookTitle;
    String authorName;
    double bookPrice;

    // No-Argument Constructor
    // Initializes object with default values
    Book() {

        // Assigning default values
        bookId = 101;
        bookTitle = "Java Programming";
        authorName = "James Gosling";
        bookPrice = 599.99;
    }

    // Method to display book details
    void displayBookDetails() {

        // Displaying book information
        System.out.println("Book ID      : " + bookId);
        System.out.println("Book Title   : " + bookTitle);
        System.out.println("Author Name  : " + authorName);
        System.out.println("Book Price   : ₹" + bookPrice);
    }
}

// Main class
public class NoArgumentConstructorWithDefaultValues {

    // Main method
    public static void main(String[] args) {

        // Creating Book object
        Book book = new Book();

        // Calling method to display details
        book.displayBookDetails();
    }
}
