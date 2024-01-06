package com.github.raulklahold.sistemaderestaurante;

public class ColetarDados {
	private String nome;
	private String cpf;
	private char pedido;

	public char getPedido() {
		return pedido;
	}

	public void setPedido(char pedido) {
		this.pedido = pedido;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
