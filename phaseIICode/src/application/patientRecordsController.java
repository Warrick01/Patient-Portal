package application;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;


public class patientRecordsController extends SceneController
{
	@FXML
	private TextArea healthIssues;
	@FXML
	private TextArea prescriptionHistory;
	@FXML
	private TextArea immunizationHistory;
	@FXML
	private TextArea physicalHistory;
	@FXML
	private TextArea other;
	@FXML
	private URL location;
	@FXML
	private ResourceBundle Resource;

	
	public patientRecordsController()
	{
		
	}
}
