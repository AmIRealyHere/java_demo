package Bro;

public class Constructors {
    public static void main(String[] args) {
        Human human1 = new Human("Rick", 65, 70);
        Human human2 = new Human("Morty", 16, 50);

        human2.eat();
        human1.drink();

        System.out.println(human1.name);
        System.out.println(human2.name);
    }
}
