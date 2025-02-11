package SEPT_25;

public class CalculateStudentGrade {
	
	public static char calculateGrade(Student student) {
		
		if (student.getMarks()>90) {
			return 'A';
		}
		else if (student.getMarks()>=75) {
			return 'B';
		}
		else if (student.getMarks()>=60) {
			return 'C';
		}
		else if (student.getMarks()<60) {
			return 'D';
		}
		
		return 'F';
		
	}
}
