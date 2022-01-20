package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;


public class doctorPrescribesController extends SceneController {
	@FXML
	private Button prescribeBtn;
	@FXML
	private TextField patientName;
	@FXML
	private TextField medName;
	@FXML
	private TextField pharmacyName;
	@FXML
	private TextArea diagnosis;
	@FXML
	private TextArea prescriptionHistory;
	@FXML
	private URL location;
	@FXML
	private ResourceBundle Resource;	
	@FXML
	private ComboBox<String> sceneDropdown;

	
	public doctorPrescribesController()
	{
		
	}
	
	@FXML
	public void initialize() 
	{
		sceneDropdown.getItems().removeAll(sceneDropdown.getItems());
		if (portalController.userLevel == 1) 
		{
			sceneDropdown.getItems().addAll("Patient Info", "Logout");
		}
		if (portalController.userLevel == 2)
		{
			sceneDropdown.getItems().addAll("Patient Info", "Enter Vitals", "Faculty Q/A", "Logout");
		}
		if (portalController.userLevel == 3) {
			sceneDropdown.getItems().removeAll(sceneDropdown.getItems());
			sceneDropdown.getItems().addAll("Patient Info", "Enter Vitals", "Enter Physical", "Prescribe Meds", "Faculty Q/A", "Logout");
		}
	}
	
	@FXML
	protected void switchView(ActionEvent event) throws IOException
	{
		if (sceneDropdown.getValue() == "Patient Info")
		{
			switchToPatientInfo(event);
		}
		if (sceneDropdown.getValue() == "Enter Vitals")
		{
			switchToEnterVitals(event);
		}
		if (sceneDropdown.getValue() == "Enter Physical")
		{
			switchToPhysicalEntry(event);
		}
		if (sceneDropdown.getValue() == "Prescribe Meds")
		{
			switchToPrescribe(event);
		}
		if (sceneDropdown.getValue() == "Faculty Q/A")
		{
			switchToFacultyQA(event);
		}
		if (sceneDropdown.getValue() == "Logout")
		{
			switchToPortal(event);
		}
	}
}