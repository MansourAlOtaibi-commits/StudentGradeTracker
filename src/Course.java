import java.util.HashMap;

public class Course {

    private String courseName;
    private String courseCode;
    private final HashMap<String, Double> grades = new HashMap<>();

    public Course(String courseName, String courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        if (courseName != null && !courseName.isEmpty()) {
            this.courseName = courseName;
        }
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        if (courseCode != null && !courseCode.isEmpty()) {
            this.courseCode = courseCode;
        }
    }

    public void addGrade(String studentId, double grade) {
        grades.put(studentId, grade);
    }

    public Double getGrade(String studentId) {
        return grades.get(studentId);
    }

    public HashMap<String, Double> getAllGrades() {
        return grades;
    }

    @Override
    public String toString() {
        return courseName + " (" + courseCode + ")";
    }
}
