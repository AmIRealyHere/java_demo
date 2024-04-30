package L678HW.GradesBook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

enum Subject {JAVA,SQL,HTML,AUTOMATION,API}

class Student {
    private String name;
    private Map<Subject, List<Integer>> grades;

        public Student(String name) {
        this.name = name;
        this.grades = new HashMap<>();
    }
    public String getName() {
        return name;
    }

    public void addGrades(Subject subject, List<Integer> grades) {
        this.grades.put(subject, new ArrayList<>(grades));
    }

    public void updateGrade(Subject subject, int index, int newGrade) {
        List<Integer> subjectGrades = grades.get(subject);
        if (subjectGrades != null && index >= 0 && index < subjectGrades.size()) {
            subjectGrades.set(index, newGrade);
        }
    }
    public double averageGrade(Subject subject) {
        List<Integer> subjectGrades = grades.get(subject);
        if (subjectGrades != null) {
            double sum = 0;
            for (int grade : subjectGrades) {
                sum += grade;
            }
            return sum / subjectGrades.size();
        } else {
            return -1;
        }
    }
    public double overallAverage() {
        if (grades.isEmpty()) {
            return -1;
        }
        double totalSum = 0;
        int totalGradesCount = 0;
        for (List<Integer> subjectGrades : grades.values()) {
            for (int grade : subjectGrades) {
                totalSum += grade;
                totalGradesCount++;
            }
        }
        return totalSum/ totalGradesCount;
    }
}
