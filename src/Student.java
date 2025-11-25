public class Student extends Person {

    private double grade;

    public Student(String name, String id, double grade) {
        super(name, id);
        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        if (grade >= 0 && grade <= 100) {
            this.grade = grade;
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Grade: " + grade;
    }
}

