package com.fstg.gestiondesstagiaires;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Configuration;

import com.fstg.gestiondesstagiaires.views.LoginController;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

@Configuration
@SpringBootApplication
public class GestionDesStagiairesApplication extends Application{
	
	private ConfigurableApplicationContext applicationContext;
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void init() throws Exception {
		// TODO Auto-generated method stub
		this.applicationContext = SpringApplication.run(GestionDesStagiairesApplication.class);
	}

	
	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		LoginController.loadView(stage);
	}

	@Override
	public void stop() throws Exception {
		// TODO Auto-generated method stub
		applicationContext.close();
	}
	
	  public static void forward(ActionEvent actionEvent, String pageName, Class myClass) throws IOException {
	        Parent parent = FXMLLoader.load(myClass.getResource(pageName));
	        Scene scene = new Scene(parent);
	        Stage app_stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
	        app_stage.hide();
	        app_stage.setScene(scene);
	        app_stage.show();
	        
	    }

	

}


