package Bro;

import java.io.File;

public class FileDemo {
    public static void main(String[] args) {
     //   File file = new File("C:\\Users\\boldu\\OneDrive\\Desktop\\secret_message.txt");
        File file = new File("C:\\Users\\boldu\\IdeaProjects\\QAS2323\\Bro\\secret_message.txt");

        if (file.exists()){
            System.out.println("This file exists! ");
            System.out.println(file.getPath());
            System.out.println(file.isFile());
            file.delete();
        }
        else {
            System.out.println("That file doesn't exist :(");
            System.out.println(file.getAbsolutePath());

        }
    }
}
