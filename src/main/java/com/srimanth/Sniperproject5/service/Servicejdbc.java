package com.srimanth.Sniperproject5.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srimanth.Sniperproject5.entity.Pojojdbc;
import com.srimanth.Sniperproject5.repository.Myrepository;

@Service
public class Servicejdbc {

	@Autowired
	Myrepository repo;
	
	public Pojojdbc saveAll(Pojojdbc e) {
		return repo.save(e);
	}
	
	public List<Pojojdbc> getAll() {
		return repo.findAll();
	}
	
}
