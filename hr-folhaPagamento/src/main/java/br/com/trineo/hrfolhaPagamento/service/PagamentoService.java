package br.com.trineo.hrfolhaPagamento.service;

import br.com.trineo.hrfolhaPagamento.entity.Pagamento;
import br.com.trineo.hrfolhaPagamento.entity.Trabalhador;
import br.com.trineo.hrfolhaPagamento.feignClient.TrabalhadorFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class PagamentoService {
	
	@Value("${hr-trabalho.host}")
	String hostRest;
	@Autowired
	private TrabalhadorFeignClient feign;
	@Autowired
	RestTemplate restTemplate;
	
	/*
	public Pagamento getPagamento(Long idTrabalho, Integer dia ) {
		Map<String,String> idUrl = new HashMap<String,String>();
		idUrl.put("id", ""+idTrabalho);
		String nomeUri = hostRest + "/trabalhadores/{id}" + idTrabalho;
		Trabalhador trabalhador = restTemplate.getForObject(hostRest + "/trabalhadores/{id}", Trabalhador.class, idUrl);
		//Trabalhador trabalhador = feign.findByTrabalhador(idTrabalho).getBody();
		return new Pagamento(trabalhador.getNome(),trabalhador.getValorDoTrabalho(),dia);

	}
	*/
	public Pagamento getPagamento(Long idTrabalho, Integer dias) {
		Trabalhador trabalhador = feign.findByTrabalhador(idTrabalho).getBody();
		return new Pagamento(trabalhador.getNome(), trabalhador.getValorDoTrabalho(), dias);
	}


}
