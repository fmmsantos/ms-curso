package br.com.trineo.hrtrabalho.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import br.com.trineo.hrtrabalho.entity.Trabalhador;
import br.com.trineo.hrtrabalho.repositores.TrabalhadorRepositorio;

@RestController
@RequestMapping("/trabalhadores")
public class TrabalhadorController {
	
	@Autowired
	private TrabalhadorRepositorio repositorio;
	
	@GetMapping
	public ResponseEntity<List<Trabalhador>> buscarTrabalhador() {
		return ResponseEntity.ok(repositorio.findAll());
		
	}

	@GetMapping("/{id}")
	public ResponseEntity<Trabalhador> findByTrabalhador(@PathVariable Long id) {
		return ResponseEntity.ok(repositorio.findById(id).get());
		
	}
}
