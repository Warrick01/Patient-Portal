package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.*;

public class SceneController {

	private Stage stage;
	private Scene scene;
	private Parent root;
	
	public void switchToPortal(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("portal.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void switchToPatientInfo(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("patientInfo.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void switchToPatientChangeInfo(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("patientChangeInfo.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void switchToPatientQA(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("patientQA.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void switchToDocNurseLogin(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("docNurseLogin.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void switchToFacultyQA(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("facultyQA.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void switchToPhysicalEntry(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("doctorPhysicalEntry.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void switchToEnterVitals(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("facultyEnterVitals.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void switchToPrescribe(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("doctorPrescribes.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void switchToRecords(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("patientRecords.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	

}
