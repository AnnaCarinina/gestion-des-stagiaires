package com.fstg.gestiondesstagiaires.model.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fstg.gestiondesstagiaires.beans.Encadrant;
import com.fstg.gestiondesstagiaires.model.repository.EncadrantRepository;
import com.fstg.gestiondesstagiaires.model.service.facade.EncadrantFacade;

@Service
public class EncadrantServiceImpl implements EncadrantFacade {

	@Autowired
	private EncadrantRepository encadrantRepository;
	
	@Override
	public Encadrant findByLogin(String login) {
		return encadrantRepository.findByLogin(login);
	}

	@Override
	public Object[] seConnecter(String login, String password) {
		Encadrant foundedEncadrant = findByLogin(login);
		System.out.println(foundedEncadrant.getLogin());
		 if (foundedEncadrant == null) {
	            return new Object[]{-1, null};
	        } else if (!foundedEncadrant.getPassword().equals(password)) {
	            return new Object[]{-2, null};
	        } else if (foundedEncadrant.getBlocked()==1) {
	            return new Object[]{-3, null};
	        } else {
	            return new Object[]{1, foundedEncadrant};
	        }
	}

}
