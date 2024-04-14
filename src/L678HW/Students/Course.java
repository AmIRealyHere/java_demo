package L678HW.Students;
import java.util.ArrayList;
import java.util.List;
class Course {
    private String name;
    private List<Student> students;

    public Course(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addStudent(Student student) {
        students.add(student);
        student.addCourse(this);
    }
    public void removeStudent(Student student) {
        students.remove(student);
        student.removeCourse(this);
    }

    public void displayEnrolledStudents() {
        System.out.println("Students enrolled in " + name + ":");
        for (Student student : students) {
            System.out.println("- " + student.getName());
        }
    }
}
