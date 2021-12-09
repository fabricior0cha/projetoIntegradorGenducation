package com.projetointegrador.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetointegrador.model.TemaModel;
import com.projetointegrador.repository.TemaRepository;

@RestController
@RequestMapping("/Genducation/tema")
@CrossOrigin("*")

public class TemaController {

	@Autowired
	private TemaRepository repository;

	@GetMapping
	public ResponseEntity<List<TemaModel>> GetAll() {
		return ResponseEntity.ok(repository.findAll());

	}
	
	@DeleteMapping("/{id}")
	public void delete (@PathVariable (value = "id") Long id) {
		repository.deleteById(id);
	}

}
