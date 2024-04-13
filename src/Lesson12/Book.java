package Lesson12;

public class Book {
    private String title;
    private String author;
    private int year;

    public Book(String t, String a, int y) {
        title = t;
        author = a;
        year = y;
    }
    public void show(){
        System.out.println(title);
        System.out.println(author);
        System.out.println(year);
        System.out.println();
    }

}
