package Lesson4;

public class Dog {
    String color;
    int age;
    String breed;
    boolean isFemale;
    String name;

    public void printDogInfo(){
        System.out.println("\nInfo about the dog: "
                + "\nbreed: " + breed
                + "\nage: " + age
                + "\nisFemale: " + isFemale
                + "\nname: " + name
    );
    }


}
