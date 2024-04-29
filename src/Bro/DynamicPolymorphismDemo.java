package Bro;

import java.util.Scanner;

public class DynamicPolymorphismDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        AnimalDP animal;

        System.out.println("What animal do you like?");
        System.out.println("(1=dog) or (2=cat): ");
        int choice = scanner.nextInt();

        if (choice==1){
            animal = new DogDP();
            animal.speak();
        } else if (choice==2){
            animal = new CatDP();
            animal.speak();
            
        }
        else {
            animal = new AnimalDP();
            System.out.println("That choice was invalid");
            animal.speak();
        }
    }
}
