import java.util.ArrayList;

public class GradeManager {

    private final ArrayList<Student> students = new ArrayList<>();
    private final ArrayList<Course> courses = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public Student findStudentById(String id) {
        for (Student s : students) {
            if (s.getId().equals(id)) {
                return s;
            }
        }
        return null;
    }

    public Course findCourseByCode(String code) {
        for (Course c : courses) {
            if (c.getCourseCode().equals(code)) {
                return c;
            }
        }
        return null;
    }

    public void addGrade(String studentId, String courseCode, double grade) {
        Student student = findStudentById(studentId);
        Course course = findCourseByCode(courseCode);

        if (student != null && course != null) {
            student.setGrade(grade);
            course.addGrade(studentId, grade);
        }
    }

    public void printAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
        } else {
            for (Student s : students) {
                System.out.println(s);
            }
        }
    }

    public void printAllCourses() {
        if (courses.isEmpty()) {
            System.out.println("No courses found.");
        } else {
            for (Course c : courses) {
                System.out.println(c);
            }
        }
    }
}
