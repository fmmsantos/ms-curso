package br.com.trineo.hrfolhaPagamento.entity;

public class Pagamento {
	private String nome;
	private Double valorPagamento;
	private Integer dia;
	private Double total;
	

	public Pagamento(String nome, Double valorPagamento, Integer dia) {
		this.nome = nome;
		this.valorPagamento = valorPagamento;
		this.dia = dia;
		this.total = dia * valorPagamento;
	}
	public Pagamento() {
		super();
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getValorPagamento() {
		return valorPagamento;
	}
	public void setValorPagamento(Double valorPagamento) {
		this.valorPagamento = valorPagamento;
	}
	public Integer getDia() {
		return dia;
	}
	public void setDia(Integer dia) {
		this.dia = dia;
	}
	public Double getTotal() {
		return dia * valorPagamento;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	
	

}
