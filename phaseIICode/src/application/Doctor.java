package application;

public class Doctor extends User{
	
	//Data
	private String assignedPatients;
	private String assignedNurse;
	
	// Constructor
	public Doctor(String username, String password, String name, String assignedNurse,
			String assignedPatients) {
		
		super(username, password, name);
		
		setAssignedNurse(assignedNurse);
		setAssignedPatients(assignedPatients);		
		
	}
	
	// Getters
	public String getAssignedPatients() {return this.assignedPatients;}
	
	public String getAssignedNurse() {return this.assignedNurse; }
	
	
	// Setters
	public void setAssignedPatients(String newPatient) { this.assignedPatients = newPatient;}
	
	public void setAssignedNurse(String newNurse) { this.assignedNurse = newNurse; }

}
