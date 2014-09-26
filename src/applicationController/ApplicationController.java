package applicationController;

import java.net.URL;
import java.util.ResourceBundle;

import applicationController.usr;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class ApplicationController implements Initializable {

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {	
	}
	
	private TextField usrField;
	private PasswordField passField;
	private Button btnLogin;
	private Button btnUsrCreate;
	
	public void validateInfo(ActionEvent event){
		System.out.println("Noen prøver å logge seg inn");
		System.out.println("Hva skal skje her?");
		
	}

}
