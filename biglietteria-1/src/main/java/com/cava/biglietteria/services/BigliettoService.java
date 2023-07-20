package com.cava.biglietteria.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cava.biglietteria.entities.Biglietto;
import com.cava.biglietteria.entities.Replica;
import com.cava.biglietteria.entities.Spettacolo;
import com.cava.biglietteria.repos.BigliettoRepos;
import com.cava.biglietteria.repos.ReplicaRepos;
import com.cava.biglietteria.repos.SpettacoloRepos;
import com.cava.biglietteria.repos.TeatroRepos;

@Service
public class BigliettoService {

	@Autowired
	private BigliettoRepos repos;

	public List<Biglietto> findAll() {
		// TODO Auto-generated method stub
		return repos.findAll();
	}

	public Biglietto save(Biglietto Biglietto) {
		// TODO Auto-generated method stub
		return null;
	}

	public Biglietto update(String id, Biglietto updateBiglietto) {
		// TODO Auto-generated method stub
		return null;
	}

	public void delete(String id) {
		// TODO Auto-generated method stub

	}

}// fine classe
