package loginApplicationController;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import loginApplicationController.usr;

public class ApplicationController implements Initializable {

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {	
		
	}
	
	
	@FXML
	private TextField usrField;
	@FXML
	private PasswordField passField;
	@FXML
	private Button btnLogin;
	@FXML
	private Button btnUsrCreate;
	@FXML
	private Label usrWrong;
	@FXML
	private Label passWrong;


	
	
	public void validateInfo(ActionEvent event) throws IOException{
		usrRead fileUsrs = new usrRead();
		ArrayList<usr> usrs = fileUsrs.readFromFile();
		String usr = usrField.getText();
		String pass = passField.getText();
		
		for (int i = 0, n = usrs.size(); i<n; i++){
			if (usr.equals(usrs.get(i).getUsrname())){
				if (pass.equals(usrs.get(i).getPassword())){
					System.out.println("Her burde noe skje: innlogging komplett");
				} else {
					passWrong();
				}
			} else {
				usrWrong();
			}
			
		}
	}

	private void usrWrong() {
		usrWrong.setText("Feil brukernavn");
	}

	private void passWrong() {
		passWrong.setText("Feil passord");		
	}

}
