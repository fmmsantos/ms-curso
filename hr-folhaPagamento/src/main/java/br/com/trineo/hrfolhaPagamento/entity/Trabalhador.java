package br.com.trineo.hrfolhaPagamento.entity;

import java.util.Objects;


public class Trabalhador {


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


