package br.com.trineo.hrfolhaPagamento.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;


import br.com.trineo.hrfolhaPagamento.entity.Pagamento;
import br.com.trineo.hrfolhaPagamento.entity.Trabalhador;
import br.com.trineo.hrfolhaPagamento.feignClient.TrabalhadorFeignClient;

@Service
public class PagamentoService {
	
	
	@Autowired
	private TrabalhadorFeignClient feign;
	
	public Pagamento getPagamento(Long idTrabalho, Integer dia ) {
		
		Trabalhador trabalhador = feign.findByTrabalhador(idTrabalho).getBody();
		return new Pagamento(trabalhador.getNome(),trabalhador.getValorDoTrabalho(),dia);
	}

}
