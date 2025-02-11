package NOV_29;

public class Course {
	private int courseId; private String courseName;
	private double courseFee;
	
	public Course(int courseId, String courseName, double courseFee) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseFee = courseFee;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public double getCourseFee() {
		return courseFee;
	}

	public void setCourseFee(double courseFee) {
		this.courseFee = courseFee;
	}

	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", courseFee=" + courseFee + "]";
	}
	
}

class Offer{
	private String offerText;

	public Offer(String offerText) {
		super();
		this.offerText = offerText;
	}

	public String getOfferText() {
		return offerText;
	}

	public void setOfferText(String offerText) {
		this.offerText = offerText;
	}

	@Override
	public String toString() {
		return "Offer [offerText=" + offerText + "]";
	}
	
}

class EducationInstitute{
	private Course[] courses;
	private Offer[] offers;
	
	public EducationInstitute(Course[] courses, Offer[] offers) {
		super();
		this.courses = courses;
		this.offers = offers;
	}

	public Course[] getCourses() {
		return courses;
	}

	public void setCourses(Course[] courses) {
		this.courses = courses;
	}

	public Offer[] getOffers() {
		return offers;
	}

	public void setOffers(Offer[] offers) {
		this.offers = offers;
	}
	
	public void enrollStudentInCourse(int courseId, String studentName) {
		
		System.out.println(studentName+"has enrolled in the course: "+courseId);
	}
	
	
	
}

class Student extends Thread{
	private String name;
	EducationInstitute institute;
	
	public Student(String name, EducationInstitute institute) {
		super();
		this.name = name;
		this.institute = institute;
	}
	
	public void viewCoursesAndFees() {
		System.out.println("Ongoing Courses and fee:");
		for (Course course : institute.getCourses()) {
			System.out.println(course);
		}
	}
	 
	public void viewOffers() {
		System.out.println("Ongoing Offers:");
		for (Offer offer : institute.getOffers()) {
			System.out.println(offer);
		}
	}
	
	public void enrollInCourse(int courseId) {
		institute.enrollStudentInCourse(courseId, name);
	}
}
