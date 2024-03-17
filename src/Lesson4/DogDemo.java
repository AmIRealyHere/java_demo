package Lesson4;

public class DogDemo {
    public static void main(String[] args) {
        Dog myDog1 = new Dog();
        myDog1.breed = "Labrador";
        myDog1.age = 10;
        myDog1.isFemale = true;
        myDog1.name = "Mary";

        myDog1.printDogInfo();

        Dog myDog2 = new Dog();
        myDog2.breed = "Husky";
        myDog2.age = 2;
        myDog2.isFemale = false;
        myDog2.name = "Mark";
        myDog2.color = "White";
        myDog2.printDogInfo();
    }
}
