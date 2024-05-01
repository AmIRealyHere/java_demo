package Lesson16;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Book> library = new LinkedList<>();
        LimitedLinkedList<Book> limitedLibrary = new LimitedLinkedList<>(8);
        Book a = new Book("ASmith", "A Somebody", (short) 1066, Book.Genre.HORROR);
        Book b = new Book("BSmith", "Be Somebody", (short) 1766);
        Book c = new Book("CSmith", "Cat Somebody", (short) 1868);
        Book d = new Book("DSmith", "Do Somebody", (short) 2006);
        Book e = new Book("ESmith", "Eat Somebody", (short) 2006);
        Book f = new Book("FSmith", "Fun Somebody", (short) 1006, Book.Genre.ROMANCE);
        Book g = new Book("GUnknown");

        List<Book> list = Arrays.asList(g,a,b,c,d,e,g,f);
        library.addAll(list);
        limitedLibrary.offerFirst(a);

        Iterator<Book> it = library.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        library.removeLastOccurrence(g);
        library.removeFirstOccurrence(g);
        library.removeFirst();
        library.removeLast();

        System.out.println("\nAfter removal");
        for (Book item : library){
            System.out.println(item);
        }
        System.out.println(library.offerFirst(g));
        System.out.println(limitedLibrary);
    }
}
