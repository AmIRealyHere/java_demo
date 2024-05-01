package Lesson16;

import java.util.*;

public class SortedSetDemo {
    public static void main(String[] args) {

        Book a = new Book("Smith", "A Somebody", (short) 1066, Book.Genre.HORROR);
        Book b = new Book("BSmith", "Be Somebody", (short) 1766);
        Book c = new Book("CSmith", "Cat Somebody", (short) 1868);
        Book d = new Book("DSmith", "Do Somebody", (short) 2006);
        Book e = new Book("ESmith", "Eat Somebody", (short) 2006);
        Book f = new Book("FSmith", "Fun Somebody", (short) 1006, Book.Genre.ROMANCE);
        Book g = new Book("GSmith");

        List<Book> list = Arrays.asList(b, b, c, d, e);

    Comparator<Book> nameComparator =Comparator.comparing(Book::getName);
        SortedSet<Book> library = new TreeSet<>(nameComparator);
        library.addAll(list);
        for (Book book : library) {
            System.out.println(book);
        }

    }}
