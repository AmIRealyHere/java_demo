package Lesson8;

import java.util.Scanner;

public class Person {

    public String name;
    private int age;
    private String password;

    Person(String name, int age) {
        this.name = name;
        this.age = age < 18 ? 0 : age;
        Scanner in = new Scanner(System.in);
        System.out.println("Set your pass:");
        password = in.nextLine();
    }

        public void setAge(int age) {
            System.out.println("Enter password first:");
            Scanner in = new Scanner(System.in);
            String password = in.nextLine();
            if (password.equals(this.password))
                this.age = age < 18 ? 0 : age;

        }
        public int getAge() {
                return age;
            }
    }
