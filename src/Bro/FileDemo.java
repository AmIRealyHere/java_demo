package Bro.FileDemo;

import java.io.File;

public class FileDemo {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\boldu\\OneDrive\\Desktop");

        if (file.exists()){
            System.out.println("This file exists! ");
        }
        else {
            System.out.println("That file doesn't exist :(");
        }
    }
}
