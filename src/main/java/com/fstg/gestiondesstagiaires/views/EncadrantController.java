package com.fstg.gestiondesstagiaires.views;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;

import com.fstg.gestiondesstagiaires.GestionDesStagiairesApplication;
import com.fstg.gestiondesstagiaires.beans.Encadrant;
import com.fstg.gestiondesstagiaires.model.service.facade.EncadrantFacade;
import com.fstg.gestiondesstagiaires.model.service.impl.EncadrantServiceImpl;
import com.fstg.gestiondesstagiaires.model.service.util.Session;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class EncadrantController {
	
	
	EncadrantServiceImpl encadrantService = new EncadrantServiceImpl();
	
	    @FXML
	    private TextField user;

	    @FXML
	    private PasswordField pass;
	
	public void seConnect(ActionEvent actionEvent) throws IOException {
		 if (!user.getText().equals("") && !pass.getText().equals("")) {
	            Object res[] = encadrantService.seConnecter(user.getText(), pass.getText());
	            int resInt = (int) res[0];
	            if (resInt == 1){
	                Encadrant e = (Encadrant) res[1];
	                Session.clear();
	                Session.setAttribut(e, "encaConnect");
	             
	               GestionDesStagiairesApplication.forward(actionEvent, "EditeProfile.fxml", this.getClass());
	            } else if (resInt == -1) {
	                alertLogin(actionEvent);
	            } else if (resInt == -2) {
	                alertPasswd(actionEvent);
	                pass.setText("");

	            } else if (resInt == -3) {
	                alertBlock(actionEvent);
	                pass.setText("");
	            }
	        } else {
	            alertChamps(actionEvent);
	        }
	}

	private void alertLogin(ActionEvent actionEvent) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Compte non Trouvée! ");
        alert.setContentText("Aucun compte a ce Login!!.. \nSi vous n'avez pas de compte vous pouvez le crée en appuiant le boutton en bas");
        alert.setHeaderText("DESOLEE!");
        alert.showAndWait();
    }
	
	private void alertPasswd(ActionEvent actionEvent) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Mot de passe incorrect!");
        alert.setContentText("");
        alert.setHeaderText("MOT DE PASSE INCORRECT!");
        alert.showAndWait();
    }
	
	private void alertBlock(ActionEvent actionEvent) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Compte Bloquée!");
        alert.setContentText("Votre Compte est Bloquee!!\n");
        alert.setHeaderText("BLOQUEE!");
        alert.showAndWait();
    }

	 private void alertChamps(ActionEvent actionEvent) {
	        Alert alert = new Alert(Alert.AlertType.ERROR);
	        alert.setTitle("Champs Vide!");
	        alert.setContentText("Il est necessaire de remplire tout les champs pour se connecter!");
	        alert.setHeaderText("ATTENTION!");
	        alert.showAndWait();
	    }


}
