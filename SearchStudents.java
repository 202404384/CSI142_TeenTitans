import java.util.List;

public class SearchStudents {

    public static Student linearSearch(List<Student> students, int studentID) {
        for (Student student : students) {
            if (student.getStudentID() == studentID) {
                return student;
            }
        }
        return null; 
    }
}
