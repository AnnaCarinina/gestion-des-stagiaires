package com.fstg.gestiondesstagiaires.model.service.facade;

import com.fstg.gestiondesstagiaires.beans.Encadrant;

public interface EncadrantFacade {

	public Encadrant findByLogin(String login);
	public Object[] seConnecter(String login, String password);
}
