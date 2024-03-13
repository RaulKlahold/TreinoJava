package com.github.raulklahold.treinoCharacterObj;

public class Carro {
	
	private String marca;
	private Integer VelocidadeMax;
	private Integer ano;
	private String cor;

	@Override
	public String toString() {
		return "Carro [marca=" + marca + ","
				+ " VelocidadeMax=" + VelocidadeMax +
				", ano=" + ano + ", cor=" + cor + "]";
		
	}

	public Carro(String marca, Integer velocidadeMax, Integer ano, String cor) {
		super();
		this.marca = marca;
		this.VelocidadeMax = velocidadeMax;
		this.ano = ano;
		this.cor = cor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Integer getVelocidadeMax() {
		return VelocidadeMax;
	}

	public void setVelocidadeMax(Integer velocidadeMax) {
		VelocidadeMax = velocidadeMax;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	

}
