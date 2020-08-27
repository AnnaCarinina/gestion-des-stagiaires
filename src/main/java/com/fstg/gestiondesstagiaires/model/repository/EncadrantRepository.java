package com.fstg.gestiondesstagiaires.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fstg.gestiondesstagiaires.beans.Encadrant;

@Repository
public interface EncadrantRepository extends JpaRepository<Encadrant, Long> {

	public Encadrant findByLogin(String login);
}
