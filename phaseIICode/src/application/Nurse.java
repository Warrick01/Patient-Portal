package application;

public class Nurse extends User{
	
	//Data
	private String assignedDoctor;
	
	//Constructor
	public Nurse (String username, String password, String name, String assignedDoctor)
	{
		super(username, password, name);
		
		setAssignedDoctor(assignedDoctor);
		
	}
	
	//Getters
	public String getAssignedDoctor() { return this.assignedDoctor; }
	
	//Setters
	public void setAssignedDoctor(String newDoctor) { this.assignedDoctor = newDoctor; }
}
