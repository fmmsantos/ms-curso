package br.com.trineo.hrfolhaPagamento.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.trineo.hrfolhaPagamento.entity.Pagamento;
import br.com.trineo.hrfolhaPagamento.service.PagamentoService;

@RestController
@RequestMapping("pagamentos")
public class PagamentoController {
	
	@Autowired
	private PagamentoService service;
	
	
	
	@GetMapping("/{id}/dias/{dias}")
	public ResponseEntity<Pagamento> getPagamento(@PathVariable Long id, @PathVariable Integer dias) {
		return ResponseEntity.ok(service.getPagamento(id, dias));
		
	}

}
