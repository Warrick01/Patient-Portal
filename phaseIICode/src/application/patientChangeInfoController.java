package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.*;

public class patientChangeInfoController extends SceneController{
	@FXML
	private Button updateInfoBtn;
	@FXML
	private TextField fstNmeFld;
	@FXML
	private TextField lstNmeFld;
	@FXML
	private TextField emailFld;
	@FXML
	private TextField phoneNumFld;
	@FXML
	private TextField addressFld;
	@FXML
	private DatePicker dob;
	@FXML
	private URL location;
	@FXML
	private ResourceBundle Resource;	
	
	public patientChangeInfoController()
	{
		
	}
	
	@FXML
	protected void updateInfo(ActionEvent event) throws IOException
	{
		switchToPatientInfo(event);
	}

}
