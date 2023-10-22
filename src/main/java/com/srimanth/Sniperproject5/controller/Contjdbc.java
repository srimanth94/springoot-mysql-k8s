package com.srimanth.Sniperproject5.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.srimanth.Sniperproject5.entity.Pojojdbc;
import com.srimanth.Sniperproject5.service.Servicejdbc;

@RestController
@RequestMapping("/a")
public class Contjdbc {
	@Autowired
Servicejdbc sc;

	@PostMapping("/insert")
	public Pojojdbc insert(@RequestBody Pojojdbc e) {
		return sc.saveAll(e);
	}
	 @GetMapping("/get")
	public List<Pojojdbc> getAll(){
		return sc.getAll();
	}
}
