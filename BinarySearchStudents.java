import java.util.List;

public class BinarySearchStudents {

    public static Student binarySearch(List<Student> students, int studentID) {
        int low = 0;
        int high = students.size() - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (students.get(mid).getStudentID() == studentID) {
                return students.get(mid);
            }
            if (students.get(mid).getStudentID() < studentID) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return null; 
    }
}
