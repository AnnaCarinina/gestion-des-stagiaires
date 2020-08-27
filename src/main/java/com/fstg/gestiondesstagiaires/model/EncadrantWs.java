package com.fstg.gestiondesstagiaires.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fstg.gestiondesstagiaires.beans.Encadrant;
import com.fstg.gestiondesstagiaires.model.service.facade.EncadrantFacade;

@RestController
@RequestMapping("stage-api/encadrant" )
public class EncadrantWs {

	@Autowired 
	EncadrantFacade encadrantService;

	@GetMapping("/{login}")
	public Encadrant findByLogin(@PathVariable String login) {
		return encadrantService.findByLogin(login);
	}

	@GetMapping("/{login}/{password}")
	public Object[] seConnecter(@PathVariable String login,@PathVariable String password) {
		return encadrantService.seConnecter(login, password);
	}
	
	
	
}
