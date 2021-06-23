package br.com.trineo.hrfolhaPagamento.feignClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.trineo.hrfolhaPagamento.entity.Trabalhador;


@Component
@FeignClient(name= "hr-trabalhador", url= "localhost:8080", path="/trabalhadores")
public interface TrabalhadorFeignClient {
	@GetMapping("/{id}")
	ResponseEntity<Trabalhador> findByTrabalhador(@PathVariable Long id);

		
}


