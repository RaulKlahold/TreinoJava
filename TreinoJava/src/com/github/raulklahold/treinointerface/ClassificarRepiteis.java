package com.github.raulklahold.treinointerface;

public class ClassificarRepiteis extends CaracteristicaGeralAnimal implements interfacesom {
	public ClassificarRepiteis(String nome) {
		super(nome);
	}

	@Override
	public void dormir() {
		System.out.println("O Réptil " + nome + " está dormindo.");
	}

	@Override
	public void fazersom() {
		System.out.println("O Réptil " + nome + " faz Urhaumm !");

	}

}