package Lesson12;

public class BookDemo {
    public static void main(String[] args) {
        Book[] books = new Book[5];

        books[0] = new Book("Java Guide", "Shildt",2014);
        books[1] = new Book("Java Reference", "Shildt",2014);
        books[2] = new Book("Java", "Shildt",2014);
        books[3] = new Book("Reference", "Everyone",2020);
        books[4] = new Book("My Sheit", "Myself",2024);
        for (Book book: books) {
            book.show();
//            book.title = " ";
        }
    }
}
