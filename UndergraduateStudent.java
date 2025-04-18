/***
 * 
 * 
 * 
 * 
 * 
*/


public class UndergraduateStudent extends Student {
    private String program;   
    private int yearLevel;    

    public UndergraduateStudent(String name, int studentID, double grade, String program, int yearLevel){ 

        super(name, studentID, grade);
        this.program = program;
        this.yearLevel = yearLevel;
    } 
    

    public String getProgram() { 
        return program; }

    public int getYearLevel() {
         return yearLevel;
        }

    public void setProgram(String program){
        this.program = program;
    } 
    public void setyearLevel(int yearLevel){
        this.yearLevel = yearLevel;
    }

    @Override
    public String toString() {
        return super.toString() + ", Program: " + program + ", Year: " + yearLevel;
    }
}