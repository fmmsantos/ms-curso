package br.com.trineo.hrfolhaPagamento.controller;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
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
	
	private static Logger logger = org.slf4j.LoggerFactory.getLogger(PagamentoController.class);
			
	@Autowired
	private PagamentoService service;
	
			
	@Autowired
	private Environment env;
			
	
	
	@GetMapping("/{id}/dias/{dias}")
	public ResponseEntity<Pagamento> getPagamento(@PathVariable Long id, @PathVariable Integer dias) {
		logger.info("PORT = " + env.getProperty("local.server.port"));
		return ResponseEntity.ok(service.getPagamento(id, dias));
		
	}

}
