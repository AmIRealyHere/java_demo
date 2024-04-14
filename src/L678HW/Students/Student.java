package L678HW.Students;
import java.util.ArrayList;
import java.util.List;

abstract class Student {
    private String name;
    private int age;
    private String id;
    private List<Course> courses;

        public Student(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.courses = new ArrayList<>();
    }

    public String getName() {return name;}
    public int getAge() {return age;}
    public String getId() {return id;}

    public void addCourse(Course course) {courses.add(course);}

    public void removeCourse(Course course) {courses.remove(course);}

    public abstract double calculateAverageGrade();

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("ID: " + id);
        System.out.println("Courses enrolled:");
        for (Course course : courses) {
            System.out.println("- " + course.getName());
        }
        System.out.println("Average Grade: " + calculateAverageGrade());
    }
}

