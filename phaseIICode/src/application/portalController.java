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


public class portalController extends Main // originally was: SceneController
{
	
	//to switch scenes
	private Stage stage;
	private Scene scene;
	private Parent root;
	
	//to use javafx components
	@FXML
	private TextField fstNmeFld;
	@FXML
	private TextField lstNmeFld;
	@FXML
	private Button loginBtn;
	@FXML
	private RadioButton patRbtn;
	@FXML
	private RadioButton nrsRbtn;
	@FXML
	private RadioButton docRbtn;
	@FXML
	private URL location;
	@FXML
	private ResourceBundle Resource;	
	public static int userLevel;
	
	
	//New ones
	@FXML
	private TextField typedUsername, typedPassword;
	
	
	
	
	public portalController()
	{
		
	}
	
	@FXML
	protected void login(ActionEvent event) throws IOException
	{
		
		
		
		//We left here
		//Next step login-> check log in info and load scene depending on username type
		boolean isNurse = false;
		boolean isDoctor = false;
		boolean isPatient = false;
		
		//Data from the screen
		String userUsername = typedUsername.getText();
		String userPassword = typedPassword.getText();
		
		//Look inside the doctors Linked List for the User
		for (int i = 0; i < doctors.size(); i++)
		{
			if(userUsername.equals(doctors.get(i).getUsername()))
			{
				if(userPassword.equals(doctors.get(i).getPassword()))
				{
					isDoctor = true;
					System.out.println("Doctor Found");
					break;
				}
			}
		}
		
		//Look inside the nurses Linked List for the User
		for (int i = 0; i < nurses.size(); i++)
		{
			if(userUsername.equals(nurses.get(i).getUsername()))
			{
				if(userPassword.equals(nurses.get(i).getPassword()))
				{
					isNurse = true;
					System.out.println("Nurse Found");
					break;
				}
			}
		}
		
		//Look inside the patients Linked List for the User
		for (int i = 0; i < patients.size(); i++)
		{
			if(userUsername.equals(patients.get(i).getUsername()))
			{
				if(userPassword.equals(patients.get(i).getPassword()))
				{
					isPatient = true;
					System.out.println("Patient Found");
					break;
				}
			}
		}
	
		
		
		
		
		if (isDoctor == true)
		{
			//Load Doctor Scene
			Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("Doctor-Main.fxml"));
			stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		}
		
		else if (isNurse == true)
		{
			//Load Nurse Scene
			Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("Nurse-Main.fxml"));
			stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
			
		}
		
		else if (isPatient == true) 
		{
			//Load Patient Scene
			Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("patientQA.fxml"));
			stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		}
		else
		{
			//Load Error Scene
			Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("LoginFail.fxml"));
			stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			scene = new Scene(root);
			stage.setScene(scene);
			stage.show();
		}
		
	}//End of login()
	
	
	public void logInAgain(ActionEvent event) throws IOException
	{
		//Load Log In Scene again
		Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("portal2.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		
		
	}
	
	
	

}
