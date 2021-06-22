package br.com.trineo.hrtrabalho.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Trabalhador implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private Double valorDoTrabalho;
	
	public Trabalhador() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getValorDoTrabalho() {
		return valorDoTrabalho;
	}

	public void setValorDoTrabalho(Double valorDoTrabalho) {
		this.valorDoTrabalho = valorDoTrabalho;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Trabalhador)) {
			return false;
		}
		Trabalhador other = (Trabalhador) obj;
		return Objects.equals(id, other.id);
	}
	
	

}
