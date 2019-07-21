package Controller;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;

import javafx.animation.PauseTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.util.Duration;

public class LoginController  implements Initializable{
     
	   @FXML
	    private TextField Nomuser;

	   @FXML
	    private PasswordField Mopass;


	    @FXML
	    private Button CrCompte;

	    @FXML
	    private Button connecter;

	    @FXML
	    private CheckBox Mesouvien;

	    @FXML
	    private Label Mopasoubl;
	    
	    @FXML
	    private ImageView imlog;

	    @FXML
	    private ImageView imgutili;

	    @FXML
	    private ImageView imgpassword;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		
	}
	 
	@FXML
	public void loginAction(ActionEvent e) {
		PauseTransition pt=new PauseTransition();
		pt.setDuration(Duration.seconds(0));
		pt.setOnFinished(ev ->{
			System.out.println("login with success");
		});
		pt.play();
		
		
		
		
	}
	@FXML
	public void signUp(ActionEvent event) throws IOException {
		
		connecter.getScene().getWindow().hide();
		Stage signup=new Stage();
		Parent root= FXMLLoader.load(getClass().getResource("/FXML/SignUP.fxml"));
		Scene scene=new Scene(root);
		signup.setScene(scene);
		signup.show();
		signup.setResizable(false);
		
		
	}
	
	
	



}
