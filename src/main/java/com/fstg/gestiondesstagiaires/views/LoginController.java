package com.fstg.gestiondesstagiaires.views;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.fstg.gestiondesstagiaires.GestionDesStagiairesApplication;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LoginController implements Initializable {
	
	public static void loadView(Stage stage) {
		
		try {
			Parent root = FXMLLoader.load(LoginController.class.getResource("Login.fxml"));
			stage.setScene(new Scene(root));
			stage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void encadrant(ActionEvent actionEvent) throws IOException{
		GestionDesStagiairesApplication.forward(actionEvent, "Encadrant.fxml", this.getClass());
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
}
