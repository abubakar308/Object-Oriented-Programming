package ooplabtask;

public class Library {
   String bookName;
   String author;
   int quantity;

    public Library(String b, String a, int q) {
        bookName = b;
        author = a;
        quantity = q;
    }

    void issueBook(int quantity) {
        System.out.println("Book issued successfully.");
            System.out.println("Book Name: " + bookName + " Author: " + author + " Quantity: " + (this.quantity - quantity));
        

    }

    void returnBook(int quantity) {
        System.out.println("Book returned successfully.");
            System.out.println("Book Name: " + bookName + " Author: " + author + " Quantity: " + (this.quantity + quantity));
    }

    public static void main(String[] args) {
        Library book1 = new Library("Java Programming", "John Doe", 10);
        Library book2 = new Library("Python Programming", "Jane Smith", 8);

        book1.issueBook(2);
        book2.issueBook(3);

        book1.returnBook(5);
        book2.returnBook(5);
    }
}
