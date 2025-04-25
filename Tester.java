import java.util.ArrayList;
import java.util.List;

public class Tester {

    public static void main(String[] args) {
        
        List<Student> students = new ArrayList<>();
        students.add(new Student("John", 101, 85.5));
        students.add(new Student("Alice", 102, 90.0));
        students.add(new Student("Bob", 103, 78.0));
        students.add(new Student("Charlie", 104, 92.5));
        students.add(new Student("David", 105, 88.0));

        
        System.out.println("Linear Search:");
        Student result = SearchStudents.linearSearch(students, 103);
        if (result != null) {
            System.out.println("Found: " + result);
        } else {
            System.out.println("Student not found");
        }


        System.out.println("\nBinary Search:");
        
        students.sort((s1, s2) -> Integer.compare(s1.getStudentID(), s2.getStudentID()));
        result = BinarySearchStudents.binarySearch(students, 103);
        if (result != null) {
            System.out.println("Found: " + result);
        } else {
            System.out.println("Student not found");
        }

        
        System.out.println("\nSelection Sort:");
        SortStudents.selectionSort(students);
        students.forEach(student -> System.out.println(student));

    
        System.out.println("\nInsertion Sort:");
    
        List<Student> unsortedStudents = new ArrayList<>();
        unsortedStudents.add(new Student("John", 101, 85.5));
        unsortedStudents.add(new Student("Alice", 102, 90.0));
        unsortedStudents.add(new Student("Bob", 103, 78.0));
        unsortedStudents.add(new Student("Charlie", 104, 92.5));
        unsortedStudents.add(new Student("David", 105, 88.0));

        InsertionSortStudents.insertionSort(unsortedStudents);
        unsortedStudents.forEach(student -> System.out.println(student));
    }
}
