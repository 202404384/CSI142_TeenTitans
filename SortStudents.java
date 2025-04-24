import java.util.ArrayList;
import java.util.List;

public class SortStudents {

    public static void selectionSort(List<Student> students) {
        int n = students.size();
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (students.get(j).getGrade() < students.get(minIndex).getGrade()) {
                    minIndex = j;
                }
            }
            Student temp = students.get(minIndex);
            students.set(minIndex, students.get(i));
            students.set(i, temp);
        }
    }
}
