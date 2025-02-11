package OCT_29;

abstract class Student{
	protected String studentName,studentClass;
	protected static int totalNoOfStudents=0; 
	
	abstract  public int getPercentage();
	
	public static int getTotalNoStudents() {
		return totalNoOfStudents;
	}
	
	public Student(){
		totalNoOfStudents++;
	}
	public Student(String studentName, String studentClass) {
		
		this.studentName=studentName;
		this.studentClass=studentClass;
		totalNoOfStudents++;
	}
}

class ScienceStudent extends Student{
	private int physicsMarks, chemistryMarks, mathsMarks;
	
	public ScienceStudent(String studentName, String studentClass,int physicsMarks,int chemistryMarks,int mathsMarks) {
		super(studentName,studentClass);
		this.physicsMarks=physicsMarks;
		this.chemistryMarks=chemistryMarks;
		this.mathsMarks=mathsMarks;
	}
	@Override
	public int getPercentage() {
		return (physicsMarks+chemistryMarks+mathsMarks)/3;
	}
}

class HistoryStudent extends Student{
	private int historyMarks, civicsMarks;
	
	@Override
	public int getPercentage() {
		return (historyMarks+civicsMarks)/2;
	}
	
	public HistoryStudent(String studentName, String studentClass,int historyMarks, int civicsMarks) {
		super(studentName,studentClass);
		this.historyMarks=historyMarks;
		this.civicsMarks=civicsMarks;
	}
}
public class StudentTester {

	public static void main(String[] args) {
		
        ScienceStudent scienceStudent1 = new ScienceStudent("Ali", "10th", 85, 90, 80);
        ScienceStudent scienceStudent2 = new ScienceStudent("Bhanu", "10th", 78, 70, 88);

        
        System.out.println(scienceStudent1.studentName + "'s Percentage: " + scienceStudent1.getPercentage() + "%");
        System.out.println(scienceStudent2.studentName + "'s Percentage: " + scienceStudent2.getPercentage() + "%");

        
        HistoryStudent historyStudent1 = new HistoryStudent("Ravi", "10th", 92, 89);
        HistoryStudent historyStudent2 = new HistoryStudent("David", "10th", 74, 85);

        
        System.out.println(historyStudent1.studentName + "'s Percentage: " + historyStudent1.getPercentage() + "%");
        System.out.println(historyStudent2.studentName + "'s Percentage: " + historyStudent2.getPercentage() + "%");

        
        System.out.println("Total number of Students: " + Student.getTotalNoStudents());
    

	}

}
/*
Program: 1 
-----------
Create an abstract class Student with the following attributes.
Instance Variables: 
studentName: protected String
studentClass: protected String
totalNoOfStudents : protected static int
Instance Methods:
abstract public : getPercentage( ) with return type int 
static Method :
public static int getTotalNoStudents( )
Constructors:
No Argument constructor is a MUST.
Parameter constructor must initialize name and class and it also increase totalNoOfStudents.

Create a class ScienceStudent that inherits from Student. 
Add the following attributes
Instance variables:
physicsMarks: private int
chemistryMarks: private int
mathsMarks: private int
Methods:
Override, getPercentage() method to compute and return the percentage of marks(Max marks for a subject :100)

Create a class HistoryStudent that inherits from Student. 
Add the following attributes.
Instance variables: 
historyMarks: private int
civicsMarks: private int (Max Marks for a subject : 100)
Method:
Override getPercentage() method to computed and return the percentage of marks(Max marks for a subject :100)



Create an ELC class StudentTester with main method, use this class to test your code.
Test all the three classes and the abstract method implementation with different inputs. 

*/