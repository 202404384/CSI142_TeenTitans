public class Student {

    private String name;
    private int studentID;
    private double grade;

    //initialises a student object with name,id,grade
    public Student (String name , int studentID , double grade)  {
        this.name = name;
        this.studentID = studentID;
        this.grade = grade;
    }

//setter and getter methods

    public String getName() {
         return name;
         }
    public int getStudentID() {
         return studentID; 
        }
    public double getGrade() { 
        return grade; 
    }
    public void setName(String name){
        this.name=name;
    }
    public void setStudentID(int studentID){
        this.studentID=studentID;
    }
    public void setGrade(double grade){
        this.grade=grade;
    }





    @Override
public String toString() {
    return "Student name:" + name + "StudentID" + studentID + "Student Grade" + grade ; 
}

}

