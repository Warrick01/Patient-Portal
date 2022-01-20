package application;

public class Visit{
	
	//Data - Patient Info
	private String patientName;
	private String dob;
	private String phone;
	private String pharmacy;
	private String insurance;
	//Data - Nurse Vitals
	private String weight;
	private String height;
	private String bodyTemp;
	private String bloodPressure;
	private String allergies;
	private String healthCondition;
	private String assignedDoctor;
	//Data - Doctor physical
	private String physical;
	private String rx; //Prescriptions
	
	//Empty Constructor
	public Visit()
	{
		this.patientName = null;
		this.dob = null;
		this.phone = null;
		this.pharmacy = null;
		this.insurance = null;
		this.weight = null;
		this.height = null;
		this.bodyTemp = null;
		this.bloodPressure = null;
		this.allergies = null;
		this.healthCondition = null;
		this.assignedDoctor = null;
		this.physical = null;
		this.rx = null;
	}
	//Constructor
	public Visit (String patientName, String dob, String phone, 
				  String pharmacy, String insurance, 
				  String weight, String height, String bodyTemp,
				  String bloodPressure, String allergies, String healthCondition,
				  String assignedDoctor, String physical, String rx)
	{
		setPatientName(patientName);
		setDob(dob);
		setPhone(phone);
		setPharmacy(pharmacy);
		setInsurance(insurance);
		setWeight(weight);
		setHeight(height);
		setBodyTemp(bodyTemp);
		setBloodPressure(bloodPressure);
		setAllergies(allergies);
		setHealthCondition(healthCondition);
		setAssignedDoctor(assignedDoctor);
		setPhysical(physical);
		setRx(rx);
		
	}
		
	//Getters
	public String getPatientName() { return this.patientName; }
	public String getDob() { return this.dob; }
	public String getPhone() { return this.phone; }
	public String getPharmacy() { return this.pharmacy; }
	public String getInsurance() { return this.insurance; }
	public String getWeight() { return this.weight; }
	public String getHeight() { return this.height; }
	public String getBodyTemp() { return this.bodyTemp; }
	public String getBloodPressure() { return this.bloodPressure; }
	public String getAllergies() { return this.allergies; }
	public String getHealthCondition() { return this.healthCondition; }
	public String getAssignedDoctor() { return this.assignedDoctor; }
	public String getPhysical() { return this.physical; }
	public String getRx() { return this.rx; }
	
	
	//Setters
	public void setPatientName(String patientName) { this.patientName = patientName; }
	public void setDob(String dob) { this.dob = dob; }
	public void setPhone(String phone) { this.phone = phone; }
	public void setPharmacy(String pharmacy) { this.pharmacy = pharmacy; }
	public void setInsurance(String insurance) { this.insurance = insurance; }
	//public void setAge(int age) { this.age = age; }
	public void setWeight(String weight) { this.weight = weight; }
	public void setHeight(String height) { this.height = height; }
	public void setBodyTemp(String bodyTemp) { this.bodyTemp = bodyTemp; }
	public void setBloodPressure(String bloodPressure) { this.bloodPressure = bloodPressure; }
	public void setAllergies(String allergies) { this.allergies = allergies; }
	public void setHealthCondition(String healthCondition) { this.healthCondition = healthCondition; }
	public void setAssignedDoctor(String assignedDoctor) { this.assignedDoctor = assignedDoctor; }
	public void setPhysical(String physical) { this.physical = physical; }
	public void setRx(String rx) { this.rx = rx; }
	
	/*
	public void setDob(String newDob) { this.dob = newDob; }
	public void setPhone(String newPhone) { this.phone = newPhone; }
	public void setPharmacy(String newPharmacy) { this.pharmacy = newPharmacy; }
	public void setInsurance(String newInsurance) {this.insurance = newInsurance; }
	public void setAssignedDoctor(String newAssignedDoctor) {this.assignedDoctor = newAssignedDoctor; }
	*/

}
