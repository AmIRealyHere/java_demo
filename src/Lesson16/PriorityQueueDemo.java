package Lesson16;

import java.util.*;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        Queue<Book> library = new PriorityQueue<>();

        Book a = new Book("Smith", "A Somebody", (short) 1066, Book.Genre.HORROR);
        Book b = new Book("BSmith", "Be Somebody", (short) 1766);
        Book c = new Book("CSmith", "Cat Somebody", (short) 1868);
        Book d = new Book("DSmith", "Do Somebody", (short) 2006);
        Book e = new Book("ESmith", "Eat Somebody", (short) 2006);
        Book f = new Book("FSmith", "Fun Somebody", (short) 1006, Book.Genre.ROMANCE);
        Book g = new Book("GSmith");

        List<Book> list = Arrays.asList(b, c, d, e);
        library.addAll(list);
        System.out.println(library.peek());

        Patient newPatient0 = new Patient("James", 1,Severity.LOW);
        Patient newPatient1 = new Patient("John", 22,Severity.HIGH);
        Patient newPatient2 = new Patient("Jo", 64,Severity.CRITICAL);
        Patient newPatient3 = new Patient("Jane", 24, Severity.HIGH);
        Patient newPatient4 = new Patient("James", 44, Severity.LOW);

        List<Patient> listOfPatients = Arrays.asList(newPatient0, newPatient1, newPatient2, newPatient3, newPatient4);

        Comparator<Patient> ageComparator = Comparator.comparing(Patient::getAge);
        Queue<Patient> hospitalQueueByAge = new PriorityQueue<>(ageComparator);
        Queue<Patient> hospitalQueueBySeverity = new PriorityQueue<>();
        hospitalQueueByAge.addAll(listOfPatients);
        hospitalQueueBySeverity.addAll(listOfPatients);
        System.out.println("hospitalQueueByAge.peek(): " + hospitalQueueByAge.peek());
        System.out.println("hospitalQueueBySeverity.peek(): " +hospitalQueueBySeverity.peek());

//        System.out.println("\nhospitalQueueByAge");
//        Iterator<Patient> it = hospitalQueueByAge.iterator();
//        while (it.hasNext()){
//            System.out.println(it.next());
//        }
//        System.out.println("\nhospitalQueueBySeverity");
//        Iterator<Patient> it1 = hospitalQueueBySeverity.iterator();
//        while (it1.hasNext()){
//            System.out.println(it1.next());
//        }
        System.out.println("\nhospitalQueueByOrder");
        while (!hospitalQueueByAge.isEmpty()){
            System.out.println(hospitalQueueByAge.poll());
        }
        System.out.println(newPatient0.compareTo(newPatient1));
        System.out.println(newPatient1.compareTo(newPatient2));
    }
}