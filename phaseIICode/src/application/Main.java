package application;
	
import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;






public class Main extends Application {
	
	
	//Linked List
	static LinkedList<Doctor> doctors = new LinkedList<Doctor>();
	static LinkedList<Nurse> nurses = new LinkedList<Nurse>();
	static LinkedList<Patient> patients = new LinkedList<Patient>();
	static LinkedList<Visit> visits = new LinkedList<Visit>();
	
	

	
	@Override
	public void start(Stage primaryStage) {
		
		//Add to the visit linked list just to test
		Visit testVisit = new Visit("Angel", "01/01/1990", "111.111.1111", 
									"Frys", "Geico", "", "" , "", "", "", 
									"", "", "", "");
		visits.add(testVisit);
		
		
		//Linked Lists will be built here
		//Doctors
		File docFile = new File("C:\\Users\\Chris\\eclipse-workspace\\PhaseIII\\src\\application\\doctors.txt");
		Scanner docScan = null;
		
        try {
            docScan = new Scanner(docFile);
        } catch (FileNotFoundException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }  //Creates a scanner to go through the file
		
		docScan.useDelimiter("-|\n"); //Determines the division between vatiables in the text file
		
		while(docScan.hasNext()) {

            String username = docScan.next();
            String password = docScan.next();
            String name = docScan.next();
            String nurse = docScan.next();
            String patients = docScan.next();

            doctors.add(new Doctor(username, password, name, nurse, patients));

        }
		
		//for loop to test printing the doctors Linked List
		for (int i = 0; i < doctors.size(); i++)
		{
			System.out.print(doctors.get(i).getName() + "--->");
		}
		System.out.println("null");
		
		
		//Nurses
		File nurseFile = new File("C:\\Users\\Chris\\eclipse-workspace\\PhaseIII\\src\\application\\nurses.txt");
		Scanner nurseScan = null;
		
        try {
            nurseScan = new Scanner(nurseFile);
        } catch (FileNotFoundException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }  //Creates a scanner to go through the file
		
		nurseScan.useDelimiter("-|\n"); //Determines the division between vatiables in the text file
		
		while(nurseScan.hasNext()) {

            String username = nurseScan.next();
            String password = nurseScan.next();
            String name = nurseScan.next();
            String doctor = nurseScan.next();
            //String patients = nurseScan.next();

            nurses.add(new Nurse(username, password, name, doctor));

        }
		
		//for loop to test printing the doctors Linked List
		for (int i = 0; i < nurses.size(); i++)
		{
			System.out.print(nurses.get(i).getName() + "--->");
		}
		System.out.println("null");
		
		
		
		
		
		//Patients
		File patientFile = new File("C:\\Users\\Chris\\eclipse-workspace\\PhaseIII\\src\\application\\patients.txt");
		Scanner patientScan = null;
		
        try {
            patientScan = new Scanner(patientFile);
        } catch (FileNotFoundException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }  //Creates a scanner to go through the file
		
		patientScan.useDelimiter("-|\n"); //Determines the division between vatiables in the text file
		
		while(patientScan.hasNext()) {

            String username = patientScan.next();
            String password = patientScan.next();
            String name = patientScan.next();
            //String doctor = patientScan.next();
            String dob = patientScan.next();
            String phone = patientScan.next();
            String pharmacy = patientScan.next();
            String insurance = patientScan.next();
            String doctor = patientScan.next();
            //String patients = nurseScan.next();

            patients.add(new Patient(username, password, name,dob, phone, pharmacy, insurance, doctor));

        }
		
		//for loop to test printing the doctors Linked List
		for (int i = 0; i < patients.size(); i++)
		{
			System.out.print(patients.get(i).getName() + "--->");
		}
		System.out.println("null");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		try {
			//Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("portal.fxml"));
			Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("portal2.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	
	
	
	
	
	
	
}//End of class
