package L678HW.GradesBook;

import java.util.List;

public class GradeSystem {
    private static String formatGrade(double grade) {
        return String.format("%.2f", grade);
    }

    private static void printStudentGrades(Student student, String subjectName) {
        System.out.println("Average grade in " + subjectName + " for " + student.getName() + ": " + formatGrade(student.averageGrade(Subject.valueOf(subjectName))));
    }

    public static void main(String[] args) {
        Subject[] subjects = {Subject.JAVA, Subject.SQL, Subject.HTML, Subject.AUTOMATION, Subject.API};

        Student[] students = {
                new Student("Alice Wonder"),
                new Student("Bob Marley"),
                new Student("Cate Middle"),
                new Student("Don Quixote"),
        };

        students[0].addGrades(Subject.JAVA, List.of(9, 10, 12));
        students[0].addGrades(Subject.SQL, List.of(7, 12));
        students[0].addGrades(Subject.HTML, List.of(7));
        students[0].addGrades(Subject.AUTOMATION, List.of(8, 7, 11));
        students[1].addGrades(Subject.JAVA, List.of(0, 8));
        students[1].addGrades(Subject.SQL, List.of(7, 10));
        students[2].addGrades(Subject.JAVA, List.of(9, 10, 12));
        students[2].addGrades(Subject.SQL, List.of(7, 12, 0));
        students[3].addGrades(Subject.HTML, List.of(12));
        students[3].addGrades(Subject.SQL, List.of(12, 0, 8));



        students[0].updateGrade(Subject.JAVA, 0, 12);
        students[3].updateGrade(Subject.SQL, 2, 11);

        for (Student student : students) {
            for (Subject subject : subjects) {
                printStudentGrades(student, subject.name());
            }
            System.out.println("Overall average grade for " + student.getName() + ": " + formatGrade(student.overallAverage()));
        }
    }
}
