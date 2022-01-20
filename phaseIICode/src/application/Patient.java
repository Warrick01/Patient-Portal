package application;

public class Patient extends User{
	
	//Data
	private String dob;
	private String phone;
	private String pharmacy;
	private String insurance;
	private String assignedDoctor;
	
	
	//Constructor
	public Patient (String newUsername, String newPassword, String newName, 
					String newDob, String newPhone, String newPharmacy, 
					String newInsurance, String newAssignedDoctor)
	{
		super(newUsername, newPassword, newName);
		
		setDob(newDob);
		setPhone(newPhone);
		setPharmacy(newPharmacy);
		setInsurance(newInsurance);
		setAssignedDoctor(newAssignedDoctor);
		
	}
		
	//Getters
	public String getDob() { return this.dob; }
	public String getPhone() { return this.phone; }
	public String getPharmacy() { return this.pharmacy; }
	public String getInsurance() { return this.insurance; }
	
	//Setters
	public void setDob(String newDob) { this.dob = newDob; }
	public void setPhone(String newPhone) { this.phone = newPhone; }
	public void setPharmacy(String newPharmacy) { this.pharmacy = newPharmacy; }
	public void setInsurance(String newInsurance) {this.insurance = newInsurance; }
	public void setAssignedDoctor(String newAssignedDoctor) {this.assignedDoctor = newAssignedDoctor; }

}
