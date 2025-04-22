public class Undergraduate extends Student{
    private int yearOfStudy;
    
    public Undergraduate(String name , int studentID , double grade,int yearOfStudy){
    super(name,studentID,grade);
    this.yearOfStudy= yearOfStudy;
    
    }
    @Override
    public void displaydetails(){
    System.out.println("Undergrad:"+getName() +"( ID:" +getStudentID() + ") Year:" + yearOfStudy+ ", Avg grade:" + getGrade());
    }
}
