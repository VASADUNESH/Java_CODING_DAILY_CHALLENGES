package OCT_3;

public class Task {
	private String title, desc, priority; private Boolean Completed;
	
	public Task(String title, String desc, String priority){
		this.title= title;
		this.desc= desc;
		this.priority= priority;
		this.Completed=false;
		negValue();
	}
	public  void negValue() {
		if(title.isEmpty() || desc.isEmpty() || priority.isEmpty()) {
			System.out.println("Task not Completed");
			System.err.println("Error message indicating invalid input [Must be positive value]");
			System.err.println("Program terminated");
			System.exit(0);
		}
		
	}
	public void updateDescription(String newDescription) {
		this.desc=newDescription;
	}
	
	public void markAsCompleted() {
		this.Completed=true;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public String getDescription() {
		return this.desc;
	}
	public String getPriority() {
		return this.priority;
	}
	public Boolean isCompleted() {
		return this.Completed;
	}
}
