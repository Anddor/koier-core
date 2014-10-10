package loginApplicationController;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


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


	
	
	public void validateInfo(ActionEvent event){
		if(true){
			showMenuApplication();
		}
	}
	
	public void showMenuApplication(){
		Platform.runLater(new Runnable() {
    		@Override
            public void run() {
    			try{
    				Parent root = FXMLLoader.load(getClass().getResource("/menuApplication/gui.fxml"));
    				Stage newStage = new Stage();
    				Scene stageScene = new Scene(root);
    				stageScene.getStylesheets().add(getClass().getResource("MenuApplication.css").toExternalForm());
    				newStage.setScene(stageScene);
    				newStage.show();	
    			}catch(Exception e) {
    				e.printStackTrace();
    			}	
	            
    		}
        });	
	}
	

	private void usrWrong() {
		usrWrong.setText("Feil brukernavn");
	}

	private void passWrong() {
		passWrong.setText("Feil passord");		
	}

}
