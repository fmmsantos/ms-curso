package br.com.trineo.hrtrabalho.repositores;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.trineo.hrtrabalho.entity.Trabalhador;
@Repository
public interface TrabalhadorRepositorio extends JpaRepository<Trabalhador, Long> {

}
