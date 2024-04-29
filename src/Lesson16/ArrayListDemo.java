package Lesson16;


import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Book> library = new ArrayList<>();

        Book a = new Book("Smith", "A Somebody", (short) 1066, Book.Genre.HORROR);
        Book b = new Book("BSmith", "Be Somebody", (short) 1766);
        Book c = new Book("CSmith", "Cat Somebody", (short) 1868);
        Book d = new Book("DSmith", "Do Somebody", (short) 2006);
        Book e = new Book("ESmith", "Eat Somebody", (short) 2006);
        Book f = new Book("FSmith", "Fun Somebody", (short) 1006, Book.Genre.ROMANCE);
        Book g = new Book("GSmith");

        System.out.println("a.compareTo(b): " +a.compareTo(b));

        List<Book> list = Arrays.asList(a,b,c,d,e,f);

        library.add(b);
        library.add(b);
        library.add(c);

        System.out.println(library.getFirst());
        System.out.println(library);
        System.out.println(library.size());
        library.remove(c);
        System.out.println(library.size());
        System.out.println(library.contains(c));
        library.addAll(list);
        library.addAll(4, list);

        System.out.println(library.containsAll(list));

        System.out.println(library);
        System.out.println("\nOUR LIBRARY");
        for (Book item : library){
            System.out.println(item);
        }

        Iterator<Book> it = library.iterator();
//        while (it.hasNext()){
//            Book i = it.next();
//            if (i.getYearOfPublication() < 1980) it.remove();
//        }
//        library.removeIf(n -> (n.getYearOfPublication()<1980));
        Comparator<Book> nameComparator = Comparator.comparing(Book::getName);
        library.sort(nameComparator);
     Collections.sort(library);

        System.out.println("\nOUR LIBRARY");
        for (Book item : library){
            System.out.println(item);
        }
    }
}
