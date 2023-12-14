package com.github.raulklahold.treinointerface;

public class CaracteristicaGeralAnimal {

	private String nome;
	private String local;
	private String classificacao;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}

	public void EmitirSom() {
		System.out.println("Esse é som:");

	}

	public void Mamifero() {
		System.out.println("Amamenta e tem caracteristicas de mamifero");
	}

	public void Ovoviparo() {
		System.out.println("Filhote se desenvolve em ovos");
	}
}
