package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.lang.String;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class patientQAController extends SceneController {
	@FXML
	private Button backBtn;
	@FXML
	private Button sendBtn;
	@FXML
	private TextArea typeQuestion;
	@FXML
	private ListView<String> responses;
	@FXML
	private ComboBox<String> sceneDropdown;
	@FXML
	private URL location;
	@FXML
	private ResourceBundle Resource;	
	
	public patientQAController()
	{
		
	}
	
	@FXML
	protected void goBack(ActionEvent event) throws IOException
	{
		switchToPatientInfo(event);
	}
}
