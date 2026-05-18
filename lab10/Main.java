import java.util.ArrayList;
import java.util.List;

// Observer Interface
interface Student {
    void update(String notice);
}

// Concrete Observer
class UniversityStudent implements Student {

    private String name;

    public UniversityStudent(String name) {
        this.name = name;
    }

    @Override
    public void update(String notice) {
        System.out.println(name + " received notice: " + notice);
    }
}

// Subject Class
class NoticeBoard {

    private List<Student> students = new ArrayList<>();

    // Subscribe student
    public void subscribe(Student student) {
        students.add(student);
    }

    // Unsubscribe student
    public void unsubscribe(Student student) {
        students.remove(student);
    }

    // Notify all students
    public void notifyStudents(String notice) {
        for (Student student : students) {
            student.update(notice);
        }
    }

    // Publish notice
    public void postNotice(String notice) {
        System.out.println("\nNew Notice Posted: " + notice);
        notifyStudents(notice);
    }
}

// Main Class
public class Main {

    public static void main(String[] args) {

        // Create Notice Board
        NoticeBoard board = new NoticeBoard();

        // Create Students
        Student s1 = new UniversityStudent("Kamal");
        Student s2 = new UniversityStudent("Nimal");
        Student s3 = new UniversityStudent("Saman");

        // Subscribe Students
        board.subscribe(s1);
        board.subscribe(s2);
        board.subscribe(s3);

        // Post Notices
        board.postNotice("Exam schedule released.");
        board.postNotice("Assignment deadline is tomorrow.");
        board.postNotice("Workshop on AI this Friday.");
    }
}