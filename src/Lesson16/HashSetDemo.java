package Lesson16;

import java.util.*;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<Book> library = new HashSet<>();
        List<Book> libraryList = new ArrayList<>();

        Book a = new Book("Smith", "A Somebody", (short) 1066, Book.Genre.HORROR);
        Book a1 = new Book("Smith", "A Somebody", (short) 1066, Book.Genre.HORROR);
        Book b = new Book("BSmith", "Be Somebody", (short) 1766);
        Book c = new Book("CSmith", "Cat Somebody", (short) 1868);
        Book d = new Book("DSmith", "Do Somebody", (short) 2006);
        Book e = new Book("ESmith", "Eat Somebody", (short) 2006);
        Book f = new Book("FSmith", "Fun Somebody", (short) 1006, Book.Genre.ROMANCE);
        Book g = new Book("GSmith", 255);
        Book g1 = new Book("GSmith", 264);
        Book g2 = new Book("GSmith", 254);

        List<Book> list = Arrays.asList(a, a1, b, b, c, d, e, g, g1, g2);
        library.addAll(list);
        libraryList.addAll(list);
        System.out.println("\nLibrary set");

        for (Book myBook : library) {
            System.out.println(myBook);
        }
            System.out.println("\nLibrary List");
            for (Book myBook : libraryList){
                System.out.println(myBook);
        }
    }
}
