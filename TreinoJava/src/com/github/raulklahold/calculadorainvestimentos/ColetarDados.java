package com.github.raulklahold.calculadorainvestimentos;

public class ColetarDados {

	private double capital;
	private double jurosAm;
	private double mesesInvestidos;

	public double getcapital() {
		return capital;
	}

	public void setcapital(double novoCapital) {
		this.capital = novoCapital;
	}

	public double getjurosAm() {
		return jurosAm;
	}

	public void setjurosAm(double novoJuros) {
		this.jurosAm = novoJuros;
	}

	public double getmesesInvestidos() {
		return mesesInvestidos;
	}

	public void setmesesInvestidos(double novoMesInvestido) {
		this.mesesInvestidos = novoMesInvestido;
	}
	public double getnovoCapital() {
	 return capital * Math.pow((1 + jurosAm), mesesInvestidos);
	}
	public static String avaliarinvestimento(double novoIMC)
}
// tirar os getters desnecessarios, olhar o outro modelo como referencia calculadora IMC