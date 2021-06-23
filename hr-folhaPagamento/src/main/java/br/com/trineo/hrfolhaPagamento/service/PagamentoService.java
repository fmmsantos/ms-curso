package br.com.trineo.hrfolhaPagamento.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


import br.com.trineo.hrfolhaPagamento.entity.Pagamento;
import br.com.trineo.hrfolhaPagamento.entity.Trabalhador;

@Service
public class PagamentoService {
	
	@Autowired
	private RestTemplate restTemplate;
	@Value("${hr-trabalho.host}")
	private String trabalhoHost;
	
	public Pagamento getPagamento(Long idTrabalho, Integer dia ) {
		Map<String,String> uriVariable = new HashMap<String,String>();
		uriVariable.put("id", ""+idTrabalho);
		
		Trabalhador trabalhador = restTemplate.getForObject(trabalhoHost + "/trabalhadores/{id}", Trabalhador.class, uriVariable);	
		return new Pagamento(trabalhador.getNome(),trabalhador.getValorDoTrabalho(),dia);
	}

}
