public class Undergraduate extends Student{
    private int yearOfStudy;
    // constructors
    public Undergraduate(String name , int studentID , double grade,int yearOfStudy){
    super(name,studentID,grade);
    this.yearOfStudy= yearOfStudy;
// to override super class
    }
    @Override
    public void displaydetails(){
    System.out.println("Undergrad:"+getName() +"( ID:" +getStudentID() + ") Year:" + yearOfStudy+ ", Avg grade:" + getGrade());
    }
}
