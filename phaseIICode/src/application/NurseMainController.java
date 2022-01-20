package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;
import javafx.scene.*;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class NurseMainController extends Main{

	private Stage stage;
	private Scene scene;
	private Parent root;
	
	//Java FX Controllers
    @FXML
    private TextField allergiesFld;

    @FXML
    private TextField assignedDoctorFld;

    @FXML
    private TextField bloodFld;

    @FXML
    private TextField bodyTempFld;

    @FXML
    private TextField heightFld;

    @FXML
    private Label vitalsMessage;

    @FXML
    private TextField weightFld;
    
    @FXML
    private TextField patientName;

    @FXML
    private ListView<String> showVisits;
    
    
    static Visit selectedVisit = new Visit();

	public void warning(String warning) { vitalsMessage.setText(warning); }
	
	public void findVisits(ActionEvent event) {
		
		String patient = patientName.getText();
		
		//for loop to find appointments and add it to the List
		for (int i = 0; i < visits.size(); i++)
		{
			if (visits.get(i).getPatientName().equals(patient))
			{
				showVisits.getItems().add(patient);
				
				selectedVisit.setPatientName(visits.get(i).getPatientName());
				selectedVisit.setDob(visits.get(i).getDob());
				selectedVisit.setPhone(visits.get(i).getPhone());
				selectedVisit.setPharmacy(visits.get(i).getPharmacy());
				selectedVisit.setInsurance(visits.get(i).getInsurance());
				
			}
		}
		
		//for Loop to erase the visit 
		for (int i = 0; i < visits.size(); i++)
		{
			if (visits.get(i).getPatientName().equals(patient))
			{
				visits.remove(i);
				System.out.println("Visit was deleted");
			}
		}
		
	}
	
	
	
	public void vitals(ActionEvent event) throws IOException
	{
		
		//Data that the user typed
		
		String weight = weightFld.getText();
		String height = heightFld.getText();
		String bodyTemp = bodyTempFld.getText();
		String bloodPressure = bloodFld.getText();
		String allergies = allergiesFld.getText();
		String assignedDoctor = assignedDoctorFld.getText();
		
		
		//Check if any Text Fields are empty
		if (weight.trim().isEmpty() || height.trim().isEmpty() ||
			bodyTemp.trim().isEmpty() || bloodPressure.trim().isEmpty() ||
			allergies.trim().isEmpty() || assignedDoctor.trim().isEmpty())
			warning("Enter all data before you continue");
		
		else {
			
			
			selectedVisit.setWeight(weight);
			selectedVisit.setHeight(height);
			selectedVisit.setBodyTemp(bodyTemp);
			selectedVisit.setBloodPressure(bloodPressure);
			selectedVisit.setAllergies(allergies);
			selectedVisit.setAssignedDoctor(assignedDoctor);
			
			
			visits.add(selectedVisit);
			
			System.out.println("New Visit was added to the List");
			System.out.println(visits.get(0).getBodyTemp());
			System.out.println(visits.get(0).getWeight());
			System.out.println(visits.get(0).getAssignedDoctor());
			
			//Load Nurse Scene
			Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("Nurse-Main.fxml"));
			stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
			
			
			
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void goToVitals(ActionEvent event) throws IOException
	{
		//Load Vitals Scene
		Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("Nurse-FindVitals.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		
	}
	
	public void goToTakeVitals(ActionEvent event) throws IOException
	{
		
		//Load Vitals Scene
		Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("Nurse-Vitals.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		
	}
	
	
	
	
	
	   
	public void done(ActionEvent event) throws IOException {
		
		
				Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("portal2.fxml"));
				stage = (Stage)((Node)event.getSource()).getScene().getWindow();
				scene = new Scene(root);
				stage.setScene(scene);
				stage.show();
		
		
	}
	
	
	
	
	
	
	
	
	

}

//Create an FXML for Doctor from Nurse
//Connect the scenes
//Make new methods with different names
//Implement new code
//Update in Scene Builder

