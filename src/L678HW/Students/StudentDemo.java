package L678HW.Students;

public class StudentDemo {
    public static void main(String[] args) {

        Course javaCourse = new Course("Java Programming");
        Course mathCourse = new Course("Mathematics");
        Course languageCourse = new Course("English Language");

        UndergraduateStudent undergrad1 = new UndergraduateStudent("Robert Plant", 20, "12345");
        UndergraduateStudent undergrad2 = new UndergraduateStudent("John Lennon", 21, "12678");
        GraduateStudent grad = new GraduateStudent("Alice Cooper", 25, "67890");

        undergrad1.addGrade(85.0);
        undergrad1.addGrade(80.0);
        undergrad1.addGrade(75.0);

        undergrad2.addGrade(80.0);
        undergrad2.addGrade(90.0);
        undergrad2.addGrade(120.0);

        grad.addGrade(95.0);
        grad.addGrade(90.0);
        grad.addGrade(99.0);

        javaCourse.addStudent(undergrad1);
        languageCourse.addStudent(undergrad2);

        javaCourse.displayEnrolledStudents();
        languageCourse.displayEnrolledStudents();

        System.out.println("\nInformation about students:");
        undergrad1.displayInfo();
        System.out.println();
        undergrad2.displayInfo();
        System.out.println();
        grad.displayInfo();
    }
}