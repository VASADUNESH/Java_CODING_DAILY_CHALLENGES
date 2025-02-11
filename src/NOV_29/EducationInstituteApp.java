package NOV_29;

public class EducationInstituteApp {

	public static void main(String[] args) {
		
		Course[] courses = new Course[] {
				new Course(1,"Mathematics",1000),
				new Course(2,"Science",1200),
				new Course(3,"English",900)
		};
		
		Offer[] offers = new Offer[] {
				new Offer("Special discount: Get 20% off on all courses!"),
				new Offer("Limited time offer: Enroll in any two courses and get one course free!")
		};
		
		EducationInstitute institute = new EducationInstitute(courses, offers);
		
		Student virat = new Student("Virat", institute);
		Student dhoni = new Student("Dhoni", institute);
		
		virat.viewCoursesAndFees();
		virat.viewOffers();
		
		virat.start();
		dhoni.start();
		
		
	}

}
