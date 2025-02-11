package DEC_13;
import java.io.*;
import java.util.*;
import java.sql.Date;

class Student implements Serializable{
	private Integer StudentId;
	private String studentName;
	private Double studentFees;
	
	static Scanner sc = new Scanner(System.in);
	
	public Student(Integer studentId, String studentName, Double studentFees ) {
		super();
		StudentId = studentId;
		this.studentName = studentName;
		this.studentFees = studentFees;
		
	}
	
	public static Student getStudentObject() {
		
		System.out.println("Enter the Student Id: "); int sId = sc.nextInt(); sc.nextLine();
		System.out.println("Enter the Stuednt Name: "); String name = sc.nextLine();
		System.out.println("Enter the Student Fee: "); Double sfee = sc.nextDouble();
		return new Student(sId,name,sfee);
	}

	@Override
	public String toString() {
		return "Student [StudentId=" + StudentId + ", studentName=" + studentName + ", studentFees=" + studentFees
				+  "]";
	}
	
	
}

public class StoreObject {

	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            Student student = Student.getStudentObject();
            students.add(student);

            System.out.print("Do you want to add another student? (yes/no): ");
            if (scanner.nextLine().equalsIgnoreCase("no")) {
                break;
            }
        }

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Student.txt"))) {
            oos.writeObject(students);
        } catch (IOException e) {
            e.printStackTrace();
        }
    

	}

}
