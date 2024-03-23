package Lesson4;

public class Dog {

    String color;
    int age;
    String breed;
    boolean isFemale;
    String name;

public Dog(){
name = "unknown";
}
   Dog(String name){
    this.name = name;
   }

    Dog (String color, int age, String breed, boolean isFemale, String name){
        this.color = color;
        this.age = age;
        this.breed = breed;
        this.isFemale = isFemale;
        this.name = name;
    }

    public void printDogInfo(){
        System.out.println("\nInfo about the dog named " + name + ": "
                + "\nBreed: " + breed
                + "\nAge: " + age
                + "\nIsFemale: " + isFemale
                + "\nColour: " + color
        );
    }


}
