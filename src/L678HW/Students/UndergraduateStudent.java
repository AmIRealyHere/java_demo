package L678HW.Students;
import java.util.ArrayList;
import java.util.List;

class UndergraduateStudent extends Student {
    private List<Double> grades;

        public UndergraduateStudent(String name, int age, String id) {
        super(name, age, id);
        this.grades = new ArrayList<>();
    }

        public void addGrade(double grade) {
        grades.add(grade);
    }

    @Override
    public double calculateAverageGrade() {
        if (grades.isEmpty()) {
            return 0.0;
        }
        double sum = 0.0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }
}

